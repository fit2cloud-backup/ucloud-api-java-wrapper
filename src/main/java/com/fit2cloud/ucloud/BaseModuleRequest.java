package com.fit2cloud.ucloud;

import com.fit2cloud.ucloud.exception.UCloudClientException;
import com.fit2cloud.ucloud.exception.UCloudServiceException;
import com.fit2cloud.ucloud.utils.EncodeHelper;
import com.fit2cloud.ucloud.utils.GlobalConst;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.*;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class BaseModuleRequest {

    protected static final String ISO8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    protected static final Gson gson = new GsonBuilder().setDateFormat(ISO8601_DATE_FORMAT).create();

    protected URI endpoint;
    protected String httpMethod = "GET";

    protected UCloudCredentials credentials;

    public BaseModuleRequest(UCloudCredentials credentials, String endpoint) {
        this.credentials = credentials;
        this.endpoint = URI.create(endpoint);
    }

    public String execute(String action, Map<String, Object> parameters) throws UCloudClientException, UCloudServiceException {
        assert (action != null && action.length() > 0);
        if (parameters == null) {
            parameters = new HashMap<String, Object>();
        }
        addCommonParams(action, parameters);
        return sendRequest(action, parameters);
    }

    private String sendRequest(String action, Map<String, Object> parameters) throws UCloudClientException, UCloudServiceException {
        InputStream stream = null;
        try {
            String query = paramsToQueryString(parameters);
            URL url = new URL(endpoint.toString() + "?" + query);
            DefaultHttpClient client = new DefaultHttpClient();
            HttpGet request = new HttpGet(url.toString());
            HttpResponse httpResponse = client.execute(request);
            if (httpResponse.getStatusLine().getStatusCode() >= 400) {
                stream = httpResponse.getEntity().getContent();
                String message = readContent(stream);
                ErrorResponse error = gson.fromJson(message, ErrorResponse.class);
                UCloudServiceException exception = new UCloudServiceException(error.getMessage());
                exception.setRetCode(error.getRetCode());
                exception.setAction(action);
                throw exception;
            } else {
                stream = httpResponse.getEntity().getContent();
                String message = readContent(stream);
                Response response = gson.fromJson(message, Response.class);
                if (response.getRetCode() != 0) {
                    UCloudClientException exception = new UCloudClientException(response.getMessage());
                    exception.setAction(action);
                    exception.setRetCode(response.getRetCode());
                    throw exception;
                } else {
                    return message;
                }
            }
        } catch (IOException e) {
            throw new UCloudClientException("Failed to connect to UCloud:" + e.getMessage());
        } finally {
            safeClose(stream);
        }
    }

    protected void addCommonParams(String action, Map<String, Object> parameters) {
        parameters.put("Action", action);
        parameters.put("PublicKey", credentials.getPublicKey());
        parameters.put("Signature", computeSignature(parameters, credentials.getPrivateKey()));
    }

    protected String computeSignature(Map<String, Object> parameters, String privateKey) {
        final StringBuilder sb = new StringBuilder();
        TreeMap<String, Object> sortParams = new TreeMap<String, Object>(parameters);
        for (Entry<String, Object> entry : sortParams.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue());
        }
        return EncodeHelper.sha1(sb.append(privateKey).toString());
    }

    private String paramsToQueryString(Map<String, Object> params)
            throws UnsupportedEncodingException {
        if (params == null || params.size() == 0) {
            return null;
        }

        StringBuilder paramString = new StringBuilder();
        boolean first = true;
        for (Entry<String, Object> p : params.entrySet()) {
            String key = p.getKey();
            String val = p.getValue().toString();
            if (!first) {
                paramString.append("&");
            }
            paramString.append(URLEncoder.encode(key, GlobalConst.CHARSET));

            if (val != null) {
                paramString.append("=").append(
                        URLEncoder.encode(val, GlobalConst.CHARSET));
            }
            first = false;
        }
        return paramString.toString();
    }

    private String readContent(InputStream content)
            throws IOException {
        if (content == null)
            return "";

        Reader reader = null;
        Writer writer = new StringWriter();
        String result;

        char[] buffer = new char[1024];
        try {
            reader = new BufferedReader(
                    new InputStreamReader(content, GlobalConst.CHARSET));
            int n;
            while ((n = reader.read(buffer)) > 0) {
                writer.write(buffer, 0, n);
            }
            result = writer.toString();
        } finally {
            content.close();
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
        return result;
    }

    private void safeClose(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }
}

package com.fit2cloud.ucloud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.fit2cloud.ucloud.exception.UCloudClientException;
import com.fit2cloud.ucloud.exception.UCloudServiceException;
import com.fit2cloud.ucloud.utils.EncodeHelper;
import org.apache.commons.codec.binary.Base64;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BaseModuleRequest {

	protected static final String ISO8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
	protected static final String ENCODING = "UTF-8";
	protected static final String RESPONSE_FORMAT = "JSON";
	protected static final Gson gson = new GsonBuilder().setDateFormat(ISO8601_DATE_FORMAT).create();
    
    protected URI endpoint;
    protected String httpMethod = "GET";
    protected String apiVersion;

    protected UCloudCredentials credentials;

    public BaseModuleRequest(UCloudCredentials credentials, String endpoint) {
        this.credentials = credentials;
        this.endpoint = URI.create(endpoint);
    }

    public String execute(String action, Map<String, String> parameters) throws UCloudClientException, UCloudServiceException {
        assert(action != null && action.length() > 0);
        if (parameters == null) {
            parameters = new HashMap<String, String>();
        }
        addCommonParams(action, parameters);
        return sendRequest(parameters);
    }
    
    private String sendRequest(Map<String, String> parameters) throws UCloudClientException, UCloudServiceException  {
        InputStream content = null;
        HttpURLConnection connection  = null;
        try {
        	String query = paramsToQueryString(parameters);
        	URL url = new URL(endpoint.toString() + "?" + query);
        	connection = (HttpURLConnection)url.openConnection();
        	connection.setConnectTimeout(5000);
        	connection.setReadTimeout(5000);
        	connection.connect();
        	int code = connection.getResponseCode();
        	if (code>=400){
        	  	content = connection.getErrorStream();
            	String message = readContent(content);
        		ErrorResponse error = gson.fromJson(message, ErrorResponse.class);
        		UCloudServiceException exception =  new UCloudServiceException(error.getMessage());
        		exception.setRetCode(code);
        		exception.setAction(error.getAction());
        		throw exception;
        	}else{
        	   	content = connection.getInputStream();
            	String message = readContent(content);
            	return message;
        	}
        } catch (IOException e) {
            throw new UCloudClientException("Failed to connect to Aliyun:" + e.getMessage());
        } finally {
            safeClose(content);
        }
    }

    protected void addCommonParams(String action, Map<String, String> parameters) {
        parameters.put("Action", action);
        parameters.put("PublicKey", credentials.getPublicKey());
        parameters.put("Signature", computeSignature(parameters, credentials.getPrivateKey()));
        
    }

    protected String computeSignature(Map<String, String> parameters, String privateKey)  {
        final StringBuilder sb = new StringBuilder();
        TreeMap<String, String> sortParams = new TreeMap<String, String>(parameters);
        for (Entry<String, String> entry : sortParams.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println(sb.toString());
        System.out.println(EncodeHelper.sha1(sb.append(privateKey).toString()));
        return  EncodeHelper.sha1(sb.append(privateKey).toString());
    }

    protected String calculateSignature(String key, String stringToSign){
        final String ALGORITHM = "HmacSHA1";
        byte[] signData = null;
		try {
			Mac mac = Mac.getInstance(ALGORITHM);
			mac.init(new SecretKeySpec(
			         key.getBytes(ENCODING), ALGORITHM));
			signData = mac.doFinal(
			          stringToSign.getBytes(ENCODING));
		} catch (InvalidKeyException e) {
		} catch (NoSuchAlgorithmException e) {
		} catch (UnsupportedEncodingException e) {
		} catch (IllegalStateException e) {
		}
        return new String(Base64.encodeBase64(signData));
    }


    private String paramsToQueryString(Map<String, String> params)
            throws UnsupportedEncodingException{
        if (params == null || params.size() == 0){
            return null;
        }

        StringBuilder paramString = new StringBuilder();
        boolean first = true;
        for(Entry<String, String> p : params.entrySet()){
            String key = p.getKey();
            String val = p.getValue();
            if (!first){
                paramString.append("&");
            }
            paramString.append(URLEncoder.encode(key, ENCODING));

            if (val != null){
                paramString.append("=").append(
                        URLEncoder.encode(val, ENCODING));
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
        try{
            reader = new BufferedReader(
                    new InputStreamReader(content, ENCODING));
            int n;
            while((n = reader.read(buffer)) > 0){
                writer.write(buffer, 0, n);
            }
            result = writer.toString();
        } finally {
            content.close();
            if (reader != null){
                reader.close();
            }
            if (writer != null){
                writer.close();
            }
        }
        return result;
    }

    private void safeClose(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) { }
        }
    }
}

package com.fit2cloud.ucloud;

import com.fit2cloud.ucloud.exception.UCloudClientException;
import com.fit2cloud.ucloud.exception.UCloudServiceException;
import com.fit2cloud.ucloud.uapp.model.UserInfo;
import com.fit2cloud.ucloud.uapp.requests.GetUserInfoRequest;
import com.fit2cloud.ucloud.uapp.responses.GetUserInfoResponse;
import com.fit2cloud.ucloud.uhost.requests.*;
import com.fit2cloud.ucloud.uhost.responses.*;
import com.fit2cloud.ucloud.unet.requests.*;
import com.fit2cloud.ucloud.unet.responses.*;
import com.fit2cloud.ucloud.utils.EncodeHelper;
import com.fit2cloud.ucloud.utils.GlobalConst;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by chixq on 7/22/15.
 */
public class UCloudAppClient {
    private BaseAppRequest request;
    private Gson gson = new GsonBuilder().create();


    public UCloudAppClient(String token,String secretKey) {
        this.request = new BaseAppRequest(token,secretKey, GlobalConst.DEFAULT_BASE_URL);
    }


    public GetUserInfoResponse getUserInfo(GetUserInfoRequest request) throws UCloudClientException, UCloudServiceException {
        return gson.fromJson(this.request.execute("GetUserInfo", request.toMap()), GetUserInfoResponse.class);
    }

    public static String parseSignedToken(String accessToken,String clientSecret){
        String[] splitAccessToken = accessToken.split("\\.");
        String sign = EncodeHelper.debase64(splitAccessToken[0]);
        String token = EncodeHelper.debase64(splitAccessToken[1]);
        String exceptedSign = EncodeHelper.sha1(token+clientSecret);

        if(sign.toLowerCase().equals(exceptedSign.toLowerCase())){
            return token;
        }else{
            return null;
        }
    }
}


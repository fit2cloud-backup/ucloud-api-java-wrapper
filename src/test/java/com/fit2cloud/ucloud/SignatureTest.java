package com.fit2cloud.ucloud;

import com.fit2cloud.ucloud.exception.UCloudClientException;
import com.fit2cloud.ucloud.exception.UCloudServiceException;
import com.fit2cloud.ucloud.uhost.model.ChargeType;
import com.fit2cloud.ucloud.uhost.model.LoginMode;
import com.fit2cloud.ucloud.uhost.model.Region;
import com.fit2cloud.ucloud.uhost.requests.CreateUHostInstanceRequest;
import com.fit2cloud.ucloud.uhost.responses.CreateUHostInstanceResponse;
import com.fit2cloud.ucloud.utils.EncodeHelper;
import org.junit.Test;

/**
 * Created by chixq on 7/23/15.
 */
public class SignatureTest {

//    @Test
    public void testSign() throws UCloudClientException, UCloudServiceException {

        //官方签名结果
        String officalPythonSignature = "7a517649e4e9da3b6c82c932d667daa1599ae3a1";
        System.out.println(officalPythonSignature);
        //官方测试签名用的公钥和私钥
        String publicKey = "ass";
        String privateKey = "ass";

        String baseUrl = "http://api.ucloud.cn";
        UCloudCredentials credentials = new UCloudCredentials(publicKey, privateKey);
        UCloudClient client = new UCloudClient(credentials);
        CreateUHostInstanceRequest request = new CreateUHostInstanceRequest();
        request.setRegion(Region.CN_NORTH_01);
        request.setImageId("f43736e1-65a5-4bea-ad2e-8a46e18883c2");
        request.setCPU(2);
        request.setMemory(2048);
        request.setChargeType(ChargeType.Month);
        request.setDiskSpace(10);
        request.setLoginMode(LoginMode.Password);
        request.setPassword("UCloudexample01");
        request.setName("Host01");
        request.setQuantity(1);
        CreateUHostInstanceResponse response = client.CreateUHostInstance(request);
        System.out.println(response.getRetCode());
        System.out.println(response.getMessage());

    }

    @Test
    public void base64Test() {
        String originStr = "Cloudp1f2c";
        System.out.println(EncodeHelper.base64(originStr));
    }
}

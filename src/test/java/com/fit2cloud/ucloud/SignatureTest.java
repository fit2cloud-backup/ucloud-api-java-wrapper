package com.fit2cloud.ucloud;

import com.fit2cloud.ucloud.exception.UCloudClientException;
import com.fit2cloud.ucloud.exception.UCloudServiceException;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chixq on 7/23/15.
 */
public class SignatureTest {

    @Test
    public void testSign() throws UCloudClientException, UCloudServiceException {

        //官方签名结果
        String officalPythonSignature = "7a517649e4e9da3b6c82c932d667daa1599ae3a1";
        System.out.println(officalPythonSignature);
        //官方测试签名用的公钥和私钥
        String publicKey = "ucloudsomeone@example.com1296235120854146120";
        String privateKey = "46f09bb9fab4f12dfc160dae12273d5332b5debe";

        String baseUrl = "http://api.ucloud.cn";
        UCloudCredentials credentials = new UCloudCredentials(publicKey, privateKey);
        BaseModuleRequest request = new BaseModuleRequest(credentials, baseUrl);
        Map<String, String> params = new HashMap<String, String>();
        params.put("Region", "cn-north-01");
        params.put("ImageId", "f43736e1-65a5-4bea-ad2e-8a46e18883c2");
        params.put("CPU", "2");
        params.put("Memory", "2048");
        params.put("DiskSpace", "10");
        params.put("LoginMode", "Password");
        params.put("Password", "UCloudexample01");
        params.put("Name", "Host01");
        params.put("ChargeType", "Month");
        params.put("Quantity", "1");
        params.put("PublicKey", publicKey);
        request.execute("CreateUHostInstance", params);
    }
}

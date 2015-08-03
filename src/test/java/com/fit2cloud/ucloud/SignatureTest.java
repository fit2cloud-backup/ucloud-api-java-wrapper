package com.fit2cloud.ucloud;

import com.fit2cloud.ucloud.exception.UCloudClientException;
import com.fit2cloud.ucloud.exception.UCloudServiceException;
import com.fit2cloud.ucloud.uhost.model.ChargeType;
import com.fit2cloud.ucloud.uhost.model.LoginMode;
import com.fit2cloud.ucloud.uhost.model.Region;
import com.fit2cloud.ucloud.uhost.requests.CreateUHostInstanceRequest;
import com.fit2cloud.ucloud.uhost.responses.CreateUHostInstanceResponse;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
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
        String publicKey = "ucloudchilaoqi@gmail.com14377229700001785272260";
        String privateKey = "4a85a1100502a6fd56fbd9535962f0ac2eb30cb1";

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
    public void testSignTest() throws UCloudClientException, UCloudServiceException {

        String officalPythonSignature = "7a517649e4e9da3b6c82c932d667daa1599ae3a1";
        System.out.println(officalPythonSignature);
        Map<String, String> map = new HashMap<String, String>();
        map.put("Region", "cn-north-03");
        map.put("ImageId", "f43736e1-65a5-4bea-ad2e-8a46e18883c2");
        map.put("CPU", "2");
        map.put("Memory", "2048");
        map.put("ChargeType", "Month");
        map.put("DiskSpace", "10");
        map.put("LoginMode", "Password");
        map.put("Password", "UCloudexample01");
        map.put("Name", "Host01");
        map.put("Quantity", "1");
        String publicKey = "ucloudsomeone@example.com1296235120854146120";
        String privateKey = "46f09bb9fab4f12dfc160dae12273d5332b5debe";

        String baseUrl = "http://api.ucloud.cn";
        UCloudCredentials credentials = new UCloudCredentials(publicKey, privateKey);
        BaseModuleRequest request = new BaseModuleRequest(credentials, baseUrl);
        request.execute("CreateUHostInstance", map);
    }

    @Test
    public void encodeTest() throws IOException {
        URL url = new URL("https://api.ucloud.cn/?PublicKey=ucloudchilaoqi%40gmail.com14377229700001785272260&OsType=Linux&ImageType=Base&Region=cn-north-03&Action=DescribeImage&Offset=0&Signature=516350ed77db9fde75cacb29b1b720029b36c697");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        System.out.println(connection.getResponseCode());
        InputStream content = connection.getInputStream();
    }
}

package com.fit2cloud.ucloud;

import com.fit2cloud.ucloud.exception.UCloudClientException;
import com.fit2cloud.ucloud.exception.UCloudServiceException;
import com.fit2cloud.ucloud.uhost.model.*;
import com.fit2cloud.ucloud.uhost.requests.CreateUHostInstanceRequest;
import com.fit2cloud.ucloud.uhost.requests.DescribeImageRequest;
import com.fit2cloud.ucloud.uhost.requests.GetRegionsRequest;
import com.fit2cloud.ucloud.uhost.responses.CreateUHostInstanceResponse;
import com.fit2cloud.ucloud.uhost.responses.DescribeImageResponse;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/24/15
 * Time: 12:52 PM
 * Email: xqiang.chi@samsung.com
 */
public class UHostTest {
    private UCloudClient cloudClient;

    public UHostTest() throws UCloudClientException {
        String publicKey = System.getenv("UCLOUD_PUBLIC_KEY");
        String privateKey = System.getenv("UCLOUD_PRIVATE_KEY");
        UCloudCredentials credentials = new UCloudCredentials(publicKey, privateKey);
        cloudClient = new UCloudClient(credentials);
    }

    @Test
    public void GetRegionsTest() throws UCloudClientException, UCloudServiceException {
        GetRegionsRequest regionsRequest = new GetRegionsRequest();
        System.out.println(cloudClient.GetRegions(regionsRequest).getRegions());

    }
//    @Test
    public void CreateUHostInstanceTest() throws UCloudClientException, UCloudServiceException {
        CreateUHostInstanceRequest request = new CreateUHostInstanceRequest();
        request.setRegion(Region.CN_NORTH_03);
        request.setChargeType(ChargeType.Month);
        request.setQuantity(1);
        request.setMemory(2048);
        request.setDiskSpace(10);
        request.setCPU(2);
        request.setLoginMode(LoginMode.Password);
        request.setPassword("Password");
        request.setImageId("0163c0c5-7481-4319-9c");
        CreateUHostInstanceResponse response = cloudClient.CreateUHostInstance(request);
        System.out.println(response.getRetCode());
        System.out.println(response.getMessage());
    }

//    @Test
    public void DescribeImageTest() throws UCloudClientException, UCloudServiceException {
        DescribeImageRequest request = new DescribeImageRequest();
        request.setRegion(Region.CN_NORTH_03);
        request.setOffset(0);
        request.setLimit(5);
        request.setOsType(OsType.Linux);
        request.setImageType(ImageType.Base);
        DescribeImageResponse response = cloudClient.DescribeImage(request);
        System.out.println(response.getRetCode());
        System.out.println(response.getTotalCount());
        System.out.println(response.getImageSet());
    }
}

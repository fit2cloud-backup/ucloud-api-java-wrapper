package com.fit2cloud.ucloud;

import com.fit2cloud.ucloud.exception.UCloudClientException;
import com.fit2cloud.ucloud.exception.UCloudServiceException;
import com.fit2cloud.ucloud.uhost.model.*;
import com.fit2cloud.ucloud.uhost.requests.CreateUHostInstanceRequest;
import com.fit2cloud.ucloud.uhost.requests.DescribeImageRequest;
import com.fit2cloud.ucloud.uhost.responses.CreateUHostInstanceResponse;
import com.fit2cloud.ucloud.uhost.responses.DescribeImageResponse;
import com.fit2cloud.ucloud.unet.requests.DescribeSecurityGroupRequest;
import com.fit2cloud.ucloud.unet.requests.DescribeSecurityGroupResourceRequest;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/24/15
 * Time: 12:52 PM
 * Email: xqiang.chi@samsung.com
 */
public class UNetTest {
    private String publicKey = "";
    private String privateKey = "";
    private UCloudCredentials credentials;
    private UCloudClient cloudClient;


    public UNetTest() throws UCloudClientException {
        credentials = new UCloudCredentials(publicKey, privateKey);
        cloudClient = new UCloudClient(credentials);
    }

    @Test
    public void DescribeSecurityGroupResourceTest() throws UCloudClientException, UCloudServiceException {
        DescribeSecurityGroupRequest request = new DescribeSecurityGroupRequest();
        request.setRegion("cn-north-03");
//        request.setResourceType("0");
        System.out.println(cloudClient.DescribeSecurityGroup(request).toString());
    }

}

package com.fit2cloud.ucloud;

import com.fit2cloud.ucloud.exception.UCloudClientException;
import com.fit2cloud.ucloud.exception.UCloudServiceException;
import com.fit2cloud.ucloud.unet.requests.DescribeSecurityGroupRequest;
import com.fit2cloud.ucloud.unet.requests.DescribeVIPRequest;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/24/15
 * Time: 12:52 PM
 * Email: xqiang.chi@samsung.com
 */
public class UNetTest {

    private UCloudClient cloudClient;


    public UNetTest() throws UCloudClientException {
        String publicKey = "";
        String privateKey = "";
        UCloudCredentials credentials = new UCloudCredentials(publicKey, privateKey);
        cloudClient = new UCloudClient(credentials);
    }

//    @Test
    public void DescribeSecurityGroupResourceTest() throws UCloudClientException, UCloudServiceException {
        DescribeSecurityGroupRequest request = new DescribeSecurityGroupRequest();
        request.setRegion("cn-north-03");
//        request.setResourceType("0");
        System.out.println(cloudClient.DescribeSecurityGroup(request).toString());
    }

    @Test
    public void getVPCSubnetTest() throws UCloudClientException, UCloudServiceException {
        DescribeVIPRequest describeVIPRequest = new DescribeVIPRequest();
        describeVIPRequest.setRegion("cn-north-03");
        System.out.println(cloudClient.DescribeVIP(describeVIPRequest));

    }
}

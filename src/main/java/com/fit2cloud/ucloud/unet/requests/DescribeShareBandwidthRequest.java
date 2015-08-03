
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeShareBandwidthRequest extends Request {
    private String Region;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    @Override
    public String toString() {
        return "DescribeShareBandwidthRequest{" +
                "Region='" + Region + '\'' +
                '}';
    }
}
        
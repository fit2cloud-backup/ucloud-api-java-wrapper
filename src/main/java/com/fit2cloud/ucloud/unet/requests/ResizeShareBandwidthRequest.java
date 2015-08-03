
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class ResizeShareBandwidthRequest extends Request {
    private String Region;
    private int ShareBandwidth;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setShareBandwidth(int ShareBandwidth) {
        this.ShareBandwidth = ShareBandwidth;
    }

    public int getShareBandwidth() {
        return ShareBandwidth;
    }

    @Override
    public String toString() {
        return "ResizeShareBandwidthRequest{" +
                "Region='" + Region + '\'' +
                ", ShareBandwidth=" + ShareBandwidth +
                '}';
    }
}
        
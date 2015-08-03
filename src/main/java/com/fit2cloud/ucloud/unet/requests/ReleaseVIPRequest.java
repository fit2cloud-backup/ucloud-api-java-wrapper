
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class ReleaseVIPRequest extends Request {
    private String Region;
    private String VIP;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setVIP(String VIP) {
        this.VIP = VIP;
    }

    public String getVIP() {
        return VIP;
    }

    @Override
    public String toString() {
        return "ReleaseVIPRequest{" +
                "Region='" + Region + '\'' +
                ", VIP='" + VIP + '\'' +
                '}';
    }
}
        
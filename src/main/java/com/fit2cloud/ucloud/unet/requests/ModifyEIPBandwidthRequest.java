
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class ModifyEIPBandwidthRequest extends Request {
    private String Region;
    private String EIPId;
    private int Bandwidth;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setEIPId(String EIPId) {
        this.EIPId = EIPId;
    }

    public String getEIPId() {
        return EIPId;
    }

    public void setBandwidth(int Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    @Override
    public String toString() {
        return "ModifyEIPBandwidthRequest{" +
                "Region='" + Region + '\'' +
                ", EIPId='" + EIPId + '\'' +
                ", Bandwidth=" + Bandwidth +
                '}';
    }
}
        
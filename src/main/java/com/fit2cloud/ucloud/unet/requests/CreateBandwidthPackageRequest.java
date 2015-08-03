
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreateBandwidthPackageRequest extends Request {
    private String Region;
    private String EIPId;
    private int Bandwidth;
    private int EnableTime;
    private int TimeRange;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getEIPId() {
        return EIPId;
    }

    public void setEIPId(String EIPId) {
        this.EIPId = EIPId;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        Bandwidth = bandwidth;
    }

    public int getEnableTime() {
        return EnableTime;
    }

    public void setEnableTime(int enableTime) {
        EnableTime = enableTime;
    }

    public int getTimeRange() {
        return TimeRange;
    }

    public void setTimeRange(int timeRange) {
        TimeRange = timeRange;
    }

    public String toString() {
        return "CreateBandwidthPackageRequest{" +
                "Region='" + Region + '\'' +
                ", EIPId='" + EIPId + '\'' +
                ", Bandwidth=" + Bandwidth +
                ", EnableTime=" + EnableTime +
                ", TimeRange=" + TimeRange +
                '}';
    }
}


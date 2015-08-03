package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 11:42 AM
 * Email: xqiang.chi@samsung.com
 */
public class TerminateUHostInstanceRequest extends Request {
    private String Region;
    private String UHost;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getUHost() {
        return UHost;
    }

    public void setUHost(String UHost) {
        this.UHost = UHost;
    }

    @Override
    public String toString() {
        return "TerminateUHostInstanceRequest{" +
                "Region='" + Region + '\'' +
                ", UHost='" + UHost + '\'' +
                '}';
    }
}

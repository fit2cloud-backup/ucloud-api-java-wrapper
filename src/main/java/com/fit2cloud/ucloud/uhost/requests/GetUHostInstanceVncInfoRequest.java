package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:39 PM
 * Email: xqiang.chi@samsung.com
 */
public class GetUHostInstanceVncInfoRequest extends Request {
    private String Region;
    private String UHostId;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getUHostId() {
        return UHostId;
    }

    public void setUHostId(String UHostId) {
        this.UHostId = UHostId;
    }

    @Override
    public String toString() {
        return "GetUHostInstanceVncInfoRequest{" +
                "Region='" + Region + '\'' +
                ", UHostId='" + UHostId + '\'' +
                '}';
    }
}

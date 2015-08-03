package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:22 PM
 * Email: xqiang.chi@samsung.com
 */
public class ResetUHostInstancePasswordRequest extends Request {
    private String Region;
    private String UHostId;
    private String Password;

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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "ResetUHostInstancePasswordRequest{" +
                "Region='" + Region + '\'' +
                ", UHostId='" + UHostId + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}

package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:50 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreateUHostInstanceSnapshotRequest extends Request {
    private String Region;
    private String UHostId;

    @Override
    public String toString() {
        return "CreateUHostInstanceSnapshotRequest{" +
                "Region='" + Region + '\'' +
                ", UHostId='" + UHostId + '\'' +
                '}';
    }

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
}

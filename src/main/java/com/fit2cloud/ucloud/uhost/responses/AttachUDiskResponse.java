package com.fit2cloud.ucloud.uhost.responses;

import com.fit2cloud.ucloud.Response;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:48 PM
 * Email: xqiang.chi@samsung.com
 */
public class AttachUDiskResponse extends Response {
    private String UhostId;
    private String UDiskId;

    @Override
    public String toString() {
        return "AttachUDiskResponse{" +
                "UhostId='" + UhostId + '\'' +
                ", UDiskId='" + UDiskId + '\'' +
                '}';
    }

    public String getUhostId() {
        return UhostId;
    }

    public void setUhostId(String uhostId) {
        UhostId = uhostId;
    }

    public String getUDiskId() {
        return UDiskId;
    }

    public void setUDiskId(String UDiskId) {
        this.UDiskId = UDiskId;
    }
}

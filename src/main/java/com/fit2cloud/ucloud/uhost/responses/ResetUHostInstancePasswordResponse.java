package com.fit2cloud.ucloud.uhost.responses;

import com.fit2cloud.ucloud.Response;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:22 PM
 * Email: xqiang.chi@samsung.com
 */
public class ResetUHostInstancePasswordResponse extends Response {
    private String UhostId;

    public String getUhostId() {
        return UhostId;
    }

    public void setUhostId(String uhostId) {
        UhostId = uhostId;
    }

    @Override
    public String toString() {
        return "ResetUHostInstancePasswordResponse{" +
                "UhostId='" + UhostId + '\'' +
                '}';
    }
}

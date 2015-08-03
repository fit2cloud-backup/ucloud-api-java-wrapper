package com.fit2cloud.ucloud.uhost.responses;

import com.fit2cloud.ucloud.Response;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:51 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreateUHostInstanceSnapshotResponse extends Response {
    private String UhostId;
    private String SnapshotName;

    @Override
    public String toString() {
        return "CreateUHostInstanceSnapshotResponse{" +
                "UhostId='" + UhostId + '\'' +
                ", SnapshotName='" + SnapshotName + '\'' +
                '}';
    }

    public String getUhostId() {
        return UhostId;
    }

    public void setUhostId(String uhostId) {
        UhostId = uhostId;
    }

    public String getSnapshotName() {
        return SnapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        SnapshotName = snapshotName;
    }
}

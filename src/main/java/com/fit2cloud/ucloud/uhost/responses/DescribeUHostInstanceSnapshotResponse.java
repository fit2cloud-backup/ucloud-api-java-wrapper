package com.fit2cloud.ucloud.uhost.responses;

import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.uhost.model.Snapshot;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:52 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeUHostInstanceSnapshotResponse extends Response {
    private String UhostId;
    private List<Snapshot> SnapshotSet;

    @Override
    public String toString() {
        return "DescribeUHostInstanceSnapshotResponse{" +
                "UhostId='" + UhostId + '\'' +
                ", SnapshotSet=" + SnapshotSet +
                '}';
    }

    public String getUhostId() {
        return UhostId;
    }

    public void setUhostId(String uhostId) {
        UhostId = uhostId;
    }

    public List<Snapshot> getSnapshotSet() {
        return SnapshotSet;
    }

    public void setSnapshotSet(List<Snapshot> snapshotSet) {
        SnapshotSet = snapshotSet;
    }
}

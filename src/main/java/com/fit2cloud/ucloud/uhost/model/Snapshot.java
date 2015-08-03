package com.fit2cloud.ucloud.uhost.model;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:53 PM
 * Email: xqiang.chi@samsung.com
 */
public class Snapshot {
    private String SnapshotName;
    private String SnapshotTime;

    @Override
    public String toString() {
        return "Snapshot{" +
                "SnapshotName='" + SnapshotName + '\'' +
                ", SnapshotTime='" + SnapshotTime + '\'' +
                '}';
    }

    public String getSnapshotName() {
        return SnapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        SnapshotName = snapshotName;
    }

    public String getSnapshotTime() {
        return SnapshotTime;
    }

    public void setSnapshotTime(String snapshotTime) {
        SnapshotTime = snapshotTime;
    }
}

package com.fit2cloud.ucloud.udisk.responses;

import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.udisk.model.DescribeUDIskDataSet;

import java.util.List;

/**
 * Created by linjinbo on 2017/11/15.
 */
public class DescribeUDiskResponse extends Response {

    private List<DescribeUDIskDataSet> DataSet;

    private int TotalSnapshotCount;

    private int TotalSnapshotLimit;

    public List<DescribeUDIskDataSet> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<DescribeUDIskDataSet> dataSet) {
        DataSet = dataSet;
    }

    public int getTotalSnapshotCount() {
        return TotalSnapshotCount;
    }

    public void setTotalSnapshotCount(int totalSnapshotCount) {
        TotalSnapshotCount = totalSnapshotCount;
    }

    public int getTotalSnapshotLimit() {
        return TotalSnapshotLimit;
    }

    public void setTotalSnapshotLimit(int totalSnapshotLimit) {
        TotalSnapshotLimit = totalSnapshotLimit;
    }
}

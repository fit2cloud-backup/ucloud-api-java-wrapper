package com.fit2cloud.ucloud.uhost.responses;

import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.uhost.model.UHostMetricDataSet;
import com.fit2cloud.ucloud.uhost.model.UHostMetricDataSets;

import java.util.List;

/**
 * Created by dhf on 2017/5/23.
 */
public class GetMetricsResponse extends Response {
    //用于保存获取某些虚拟机某个时间段的监控数据时返回的数据
    private UHostMetricDataSets DataSets;
    //用于保存获取所有虚拟机当前时间的监控数据时返回的数据
    private List<UHostMetricDataSet> DataSet;
    private long RefreshTime;
    private String ResourceType;

    public UHostMetricDataSets getDataSets() {
        return DataSets;
    }

    public void setDataSets(UHostMetricDataSets dataSets) {
        DataSets = dataSets;
    }

    public long getRefreshTime() {
        return RefreshTime;
    }

    public void setRefreshTime(long refreshTime) {
        RefreshTime = refreshTime;
    }

    public String getResourceType() {
        return ResourceType;
    }

    public void setResourceType(String resourceType) {
        ResourceType = resourceType;
    }

    public List<UHostMetricDataSet> getDataSet() {
        return DataSet;
    }

    public void setDataSet(List<UHostMetricDataSet> dataSet) {
        DataSet = dataSet;
    }
}

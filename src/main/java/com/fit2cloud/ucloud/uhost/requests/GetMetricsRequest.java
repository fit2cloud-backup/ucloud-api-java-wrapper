package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;
import com.fit2cloud.ucloud.uhost.model.StatisticType;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dhf on 2017/5/23.
 */
public class GetMetricsRequest extends Request {
    private String Region;
    private String Zone;
    private String ResourceId;
    private String ResourceType;
    private Long BeginTime;
    private Long EndTime;
    private Integer TimeRange;
    private StatisticType Statistic;
    private String MetricNames;
    private Integer Limit;
    private Integer Offset;
    private String ProjectId;

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
        ProjectId = projectId;
    }

    public String getZone() {
        return Zone;
    }

    public void setZone(String zone) {
        Zone = zone;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getResourceId() {
        return ResourceId;
    }

    public void setResourceId(String resourceId) {
        ResourceId = resourceId;
    }

    public String getResourceType() {
        return ResourceType;
    }

    public void setResourceType(String resourceType) {
        ResourceType = resourceType;
    }

    public Long getBeginTime() {
        return BeginTime;
    }

    public void setBeginTime(Long beginTime) {
        BeginTime = beginTime;
    }

    public Long getEndTime() {
        return EndTime;
    }

    public void setEndTime(Long endTime) {
        EndTime = endTime;
    }

    public Integer getTimeRange() {
        return TimeRange;
    }

    public void setTimeRange(Integer timeRange) {
        TimeRange = timeRange;
    }

    public StatisticType getStatistic() {
        return Statistic;
    }

    public void setStatistic(StatisticType statistic) {
        Statistic = statistic;
    }

    public String getMetricNames() {
        return MetricNames;
    }

    public void setMetricNames(String metricNames) {
        MetricNames = metricNames;
    }

    public Integer getLimit() {
        return Limit;
    }

    public void setLimit(Integer limit) {
        Limit = limit;
    }

    public Integer getOffset() {
        return Offset;
    }

    public void setOffset(Integer offset) {
        Offset = offset;
    }

    @Override
    public Map toMap() {
        Map map =  super.toMap();
        Map result = new HashMap();
        for(Object key : map.keySet()) {
            if(!"MetricNames".equals(key))
                result.put(key, map.get(key));
            else {
                String metricNamsStr = map.get(key).toString();
                String[] metricNames = metricNamsStr.split("&");
                String[] pair;
                for(String metricPair : metricNames) {
                    pair = metricPair.split("=");
                    result.put(pair[0], pair[1]);
                }
            }
        }
        return result;
    }
}

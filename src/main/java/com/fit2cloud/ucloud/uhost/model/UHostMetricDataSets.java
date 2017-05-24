package com.fit2cloud.ucloud.uhost.model;

import java.util.List;

/**
 * Created by dhf on 2017/5/23.
 */
public class UHostMetricDataSets {
    private List<UHostMetricItem> CPUUtilization;
    private List<UHostMetricItem> MemUsage;
    private List<UHostMetricItem> NICIn;
    private List<UHostMetricItem> NICOut;

    public List<UHostMetricItem> getCPUUtilization() {
        return CPUUtilization;
    }

    public void setCPUUtilization(List<UHostMetricItem> CPUUtilization) {
        this.CPUUtilization = CPUUtilization;
    }

    public List<UHostMetricItem> getMemUsage() {
        return MemUsage;
    }

    public void setMemUsage(List<UHostMetricItem> memUsage) {
        MemUsage = memUsage;
    }

    public List<UHostMetricItem> getNICIn() {
        return NICIn;
    }

    public void setNICIn(List<UHostMetricItem> NICIn) {
        this.NICIn = NICIn;
    }

    public List<UHostMetricItem> getNICOut() {
        return NICOut;
    }

    public void setNICOut(List<UHostMetricItem> NICOut) {
        this.NICOut = NICOut;
    }
}

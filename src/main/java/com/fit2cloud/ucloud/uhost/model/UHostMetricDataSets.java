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
    private List<UHostMetricItem> IORead;
    private List<UHostMetricItem> IOWrite;

    public List<UHostMetricItem> getIORead() {
        return IORead;
    }

    public void setIORead(List<UHostMetricItem> IORead) {
        this.IORead = IORead;
    }

    public List<UHostMetricItem> getIOWrite() {
        return IOWrite;
    }

    public void setIOWrite(List<UHostMetricItem> IOWrite) {
        this.IOWrite = IOWrite;
    }

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

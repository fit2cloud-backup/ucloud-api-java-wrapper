
package com.fit2cloud.ucloud.unet.responses;

import com.fit2cloud.ucloud.Response;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeBandwidthPackageResponse extends Response {
    private List<String> DataSets;
    private String BandwidthPackageId;
    private int EnableTime;
    private int DisableTime;
    private int CreateTime;
    private int Bandwidth;
    private String EIPId;
    private List<com.fit2cloud.ucloud.unet.model.EIPAddr> EIPAddr;
    private String OperatorName;
    private String IP;

    public List<String> getDataSets() {
        return DataSets;
    }

    public void setDataSets(List<String> dataSets) {
        DataSets = dataSets;
    }

    public String getBandwidthPackageId() {
        return BandwidthPackageId;
    }

    public void setBandwidthPackageId(String bandwidthPackageId) {
        BandwidthPackageId = bandwidthPackageId;
    }

    public int getEnableTime() {
        return EnableTime;
    }

    public void setEnableTime(int enableTime) {
        EnableTime = enableTime;
    }

    public int getDisableTime() {
        return DisableTime;
    }

    public void setDisableTime(int disableTime) {
        DisableTime = disableTime;
    }

    public int getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(int createTime) {
        CreateTime = createTime;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        Bandwidth = bandwidth;
    }

    public String getEIPId() {
        return EIPId;
    }

    public void setEIPId(String EIPId) {
        this.EIPId = EIPId;
    }

    public List<com.fit2cloud.ucloud.unet.model.EIPAddr> getEIPAddr() {
        return EIPAddr;
    }

    public void setEIPAddr(List<com.fit2cloud.ucloud.unet.model.EIPAddr> EIPAddr) {
        this.EIPAddr = EIPAddr;
    }

    public String getOperatorName() {
        return OperatorName;
    }

    public void setOperatorName(String operatorName) {
        OperatorName = operatorName;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    @Override
    public String toString() {
        return "DescribeBandwidthPackageResponse{" +
                ", DataSets=" + DataSets +
                ", BandwidthPackageId='" + BandwidthPackageId + '\'' +
                ", EnableTime=" + EnableTime +
                ", DisableTime=" + DisableTime +
                ", CreateTime=" + CreateTime +
                ", Bandwidth=" + Bandwidth +
                ", EIPId='" + EIPId + '\'' +
                ", EIPAddr=" + EIPAddr +
                ", OperatorName='" + OperatorName + '\'' +
                ", IP='" + IP + '\'' +
                '}';
    }
}


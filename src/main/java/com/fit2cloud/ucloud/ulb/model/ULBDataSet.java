package com.fit2cloud.ucloud.ulb.model;

import com.fit2cloud.ucloud.uhost.model.IPSet;

import java.util.List;

/**
 * Created by chixq on 8/27/15.
 */
public class ULBDataSet {
    private String ULBId;
    private String ULBName;
    private String Name;
    private String Tag;
    private String Remark;
    private Integer BandwidthType;
    private Integer Bandwidth;
    private Integer CreateTime;
    private Integer ExpireTime;
    private List<Object> Resource;
    private List<IPSet> IPSet;
    private List<VServerSet> VServerSet;

    public String getULBId() {
        return ULBId;
    }

    public void setULBId(String ULBId) {
        this.ULBId = ULBId;
    }

    public String getULBName() {
        return ULBName;
    }

    public void setULBName(String ULBName) {
        this.ULBName = ULBName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public Integer getBandwidthType() {
        return BandwidthType;
    }

    public void setBandwidthType(Integer bandwidthType) {
        BandwidthType = bandwidthType;
    }

    public Integer getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        Bandwidth = bandwidth;
    }

    public Integer getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Integer createTime) {
        CreateTime = createTime;
    }

    public Integer getExpireTime() {
        return ExpireTime;
    }

    public void setExpireTime(Integer expireTime) {
        ExpireTime = expireTime;
    }

    public List<Object> getResource() {
        return Resource;
    }

    public void setResource(List<Object> resource) {
        Resource = resource;
    }

    public List<com.fit2cloud.ucloud.uhost.model.IPSet> getIPSet() {
        return IPSet;
    }

    public void setIPSet(List<com.fit2cloud.ucloud.uhost.model.IPSet> IPSet) {
        this.IPSet = IPSet;
    }

    public List<com.fit2cloud.ucloud.ulb.model.VServerSet> getVServerSet() {
        return VServerSet;
    }

    public void setVServerSet(List<com.fit2cloud.ucloud.ulb.model.VServerSet> VServerSet) {
        this.VServerSet = VServerSet;
    }
}

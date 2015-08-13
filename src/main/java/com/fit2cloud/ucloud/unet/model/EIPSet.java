package com.fit2cloud.ucloud.unet.model;

import java.util.List;

/**
 * Created by chixq on 8/2/15.
 */
public class EIPSet {
    private String EIPId;
    private List<EIPAddr> EIPAddr;

    public List<com.fit2cloud.ucloud.unet.model.EIPAddr> getEIPAddr() {
        return EIPAddr;
    }

    public void setEIPAddr(List<com.fit2cloud.ucloud.unet.model.EIPAddr> EIPAddr) {
        this.EIPAddr = EIPAddr;
    }

    public String getEIPId() {
        return EIPId;
    }

    public void setEIPId(String EIPId) {
        this.EIPId = EIPId;
    }

    @Override
    public String toString() {
        return "EIPSet{" +
                "EIPSet='" + EIPId + '\'' +
                ", EIPAddr=" + EIPAddr +
                '}';
    }
}

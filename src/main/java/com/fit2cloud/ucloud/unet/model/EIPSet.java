package com.fit2cloud.ucloud.unet.model;

import java.util.List;

/**
 * Created by chixq on 8/2/15.
 */
public class EIPSet {
    private String EIP;
    private List<EIPAddr> EIPAddr;

    public List<com.fit2cloud.ucloud.unet.model.EIPAddr> getEIPAddr() {
        return EIPAddr;
    }

    public void setEIPAddr(List<com.fit2cloud.ucloud.unet.model.EIPAddr> EIPAddr) {
        this.EIPAddr = EIPAddr;
    }

    public String getEIP() {
        return EIP;
    }

    public void setEIP(String EIP) {
        this.EIP = EIP;
    }

    @Override
    public String toString() {
        return "EIPSet{" +
                "EIPSet='" + EIP + '\'' +
                ", EIPAddr=" + EIPAddr +
                '}';
    }
}

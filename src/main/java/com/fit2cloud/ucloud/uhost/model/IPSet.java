package com.fit2cloud.ucloud.uhost.model;

/**
 * Created by chixq on 8/12/15.
 */
public class IPSet {
    private String Type;
    private String IPId;
    private String IP;
    private int bandwidth;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getIPId() {
        return IPId;
    }

    public void setIPId(String IPId) {
        this.IPId = IPId;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public String toString() {
        return "IPSet{" +
                "Type='" + Type + '\'' +
                ", IPId='" + IPId + '\'' +
                ", IP='" + IP + '\'' +
                ", bandwidth=" + bandwidth +
                '}';
    }
}

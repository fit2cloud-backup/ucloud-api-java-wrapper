package com.fit2cloud.ucloud.unet.model;

/**
 * Created by chixq on 8/2/15.
 */
public class EIPAddr {
    private String OperatorName;
    private String IP;

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getOperatorName() {
        return OperatorName;
    }

    public void setOperatorName(String operatorName) {
        OperatorName = operatorName;
    }

    @Override
    public String toString() {
        return "EIPAddr{" +
                "OperatorName='" + OperatorName + '\'' +
                ", IP='" + IP + '\'' +
                '}';
    }
}

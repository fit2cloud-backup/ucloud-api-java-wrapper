package com.fit2cloud.ucloud.uhost.responses;

import com.fit2cloud.ucloud.Response;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:39 PM
 * Email: xqiang.chi@samsung.com
 */
public class GetUHostInstanceVncInfoResponse extends Response {
    private String UhostId;
    private String VncIP;
    private int VncPort;
    private String VncPassword;

    @Override
    public String toString() {
        return "GetUHostInstanceVncInfoResponse{" +
                "UhostId='" + UhostId + '\'' +
                ", VncIP='" + VncIP + '\'' +
                ", VncPort=" + VncPort +
                ", VncPassword='" + VncPassword + '\'' +
                '}';
    }

    public String getUhostId() {
        return UhostId;
    }

    public void setUhostId(String uhostId) {
        UhostId = uhostId;
    }

    public String getVncIP() {
        return VncIP;
    }

    public void setVncIP(String vncIP) {
        VncIP = vncIP;
    }

    public int getVncPort() {
        return VncPort;
    }

    public void setVncPort(int vncPort) {
        VncPort = vncPort;
    }

    public String getVncPassword() {
        return VncPassword;
    }

    public void setVncPassword(String vncPassword) {
        VncPassword = vncPassword;
    }
}

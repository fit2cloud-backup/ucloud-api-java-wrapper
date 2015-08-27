
package com.fit2cloud.ucloud.ulb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreateVServerRequest extends Request {
    private String Region;
    private String ULBId;
    private String VServerName;
    private String Protocol;
    private Integer FrontendPort;
    private String Method;
    private String PersistenceType;
    private String PersistenceInfo;
    private Integer ClientTimeout;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setULBId(String ULBId) {
        this.ULBId = ULBId;
    }

    public String getULBId() {
        return ULBId;
    }

    public void setVServerName(String VServerName) {
        this.VServerName = VServerName;
    }

    public String getVServerName() {
        return VServerName;
    }

    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public String getProtocol() {
        return Protocol;
    }

    public void setFrontendPort(Integer FrontendPort) {
        this.FrontendPort = FrontendPort;
    }

    public Integer getFrontendPort() {
        return FrontendPort;
    }

    public void setMethod(String Method) {
        this.Method = Method;
    }

    public String getMethod() {
        return Method;
    }

    public void setPersistenceType(String PersistenceType) {
        this.PersistenceType = PersistenceType;
    }

    public String getPersistenceType() {
        return PersistenceType;
    }

    public void setPersistenceInfo(String PersistenceInfo) {
        this.PersistenceInfo = PersistenceInfo;
    }

    public String getPersistenceInfo() {
        return PersistenceInfo;
    }

    public void setClientTimeout(Integer ClientTimeout) {
        this.ClientTimeout = ClientTimeout;
    }

    public Integer getClientTimeout() {
        return ClientTimeout;
    }


}
        
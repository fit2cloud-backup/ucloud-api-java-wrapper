package com.fit2cloud.ucloud.ulb.model;

import java.util.List;

/**
 * Created by chixq on 8/27/15.
 */
public class VServerSet {
    private String VServerId;
    private String VServerName;
    private String Protocol;
    private Integer FrontendPort;
    private String Method;
    private String PersistenceType;
    private String PersistenceInfo;
    private Integer ClientTimeout;
    private Integer Status;
    private List<SSLDataSet> SSLSet;
    private List<BackendSet> BackendSet;

    public String getVServerId() {
        return VServerId;
    }

    public void setVServerId(String VServerId) {
        this.VServerId = VServerId;
    }

    public String getVServerName() {
        return VServerName;
    }

    public void setVServerName(String VServerName) {
        this.VServerName = VServerName;
    }

    public String getProtocol() {
        return Protocol;
    }

    public void setProtocol(String protocol) {
        Protocol = protocol;
    }

    public Integer getFrontendPort() {
        return FrontendPort;
    }

    public void setFrontendPort(Integer frontendPort) {
        FrontendPort = frontendPort;
    }

    public String getMethod() {
        return Method;
    }

    public void setMethod(String method) {
        Method = method;
    }

    public String getPersistenceType() {
        return PersistenceType;
    }

    public void setPersistenceType(String persistenceType) {
        PersistenceType = persistenceType;
    }

    public String getPersistenceInfo() {
        return PersistenceInfo;
    }

    public void setPersistenceInfo(String persistenceInfo) {
        PersistenceInfo = persistenceInfo;
    }

    public Integer getClientTimeout() {
        return ClientTimeout;
    }

    public void setClientTimeout(Integer clientTimeout) {
        ClientTimeout = clientTimeout;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public List<SSLDataSet> getSSLSet() {
        return SSLSet;
    }

    public void setSSLSet(List<SSLDataSet> SSLSet) {
        this.SSLSet = SSLSet;
    }

    public List<com.fit2cloud.ucloud.ulb.model.BackendSet> getBackendSet() {
        return BackendSet;
    }

    public void setBackendSet(List<com.fit2cloud.ucloud.ulb.model.BackendSet> backendSet) {
        BackendSet = backendSet;
    }
}

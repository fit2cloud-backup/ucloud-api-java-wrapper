package com.fit2cloud.ucloud.ulb.model;

/**
 * Created by chixq on 8/27/15.
 */
public class BackendSet {
    private String BackendId;
    private String PrivateIP;
    private Integer Port;
    private String ResourceType;
    private String ResourceId;
    private String ResourceName;
    private Integer Enabled;
    private Integer Status;

    public String getBackendId() {
        return BackendId;
    }

    public void setBackendId(String backendId) {
        BackendId = backendId;
    }

    public String getPrivateIP() {
        return PrivateIP;
    }

    public void setPrivateIP(String privateIP) {
        PrivateIP = privateIP;
    }

    public Integer getPort() {
        return Port;
    }

    public void setPort(Integer port) {
        Port = port;
    }

    public String getResourceId() {
        return ResourceId;
    }

    public void setResourceId(String resourceId) {
        ResourceId = resourceId;
    }

    public String getResourceName() {
        return ResourceName;
    }

    public void setResourceName(String resourceName) {
        ResourceName = resourceName;
    }

    public Integer getEnabled() {
        return Enabled;
    }

    public void setEnabled(Integer enabled) {
        Enabled = enabled;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public String getResourceType() {

        return ResourceType;
    }

    public void setResourceType(String resourceType) {
        ResourceType = resourceType;
    }
}

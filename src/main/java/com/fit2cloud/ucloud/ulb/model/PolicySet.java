package com.fit2cloud.ucloud.ulb.model;

import java.util.List;

/**
 * Created by chixq on 8/27/15.
 */
public class PolicySet {
    private String PolicyId;
    private String Type;
    private String Match;
    private String VServerId;
    private List<BackendSet> BackendSet;

    public String getPolicyId() {
        return PolicyId;
    }

    public void setPolicyId(String policyId) {
        PolicyId = policyId;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getMatch() {
        return Match;
    }

    public void setMatch(String match) {
        Match = match;
    }

    public String getVServerId() {
        return VServerId;
    }

    public void setVServerId(String VServerId) {
        this.VServerId = VServerId;
    }

    public List<BackendSet> getBackendSet() {
        return BackendSet;
    }

    public void setBackendSet(List<BackendSet> backendSet) {
        BackendSet = backendSet;
    }
}

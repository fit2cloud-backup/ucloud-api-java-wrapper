package com.fit2cloud.ucloud.ulb.model;

import java.util.List;

/**
 * Created by chixq on 8/27/15.
 */
public class PolicyDataSet {
    private String GroupId;
    private String GroupName;
    private List<PolicySet> PolicySet;

    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String groupId) {
        GroupId = groupId;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public List<PolicySet> getPolicySet() {
        return PolicySet;
    }

    public void setPolicySet(List<PolicySet> policySet) {
        PolicySet = policySet;
    }
}

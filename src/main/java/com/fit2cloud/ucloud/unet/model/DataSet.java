package com.fit2cloud.ucloud.unet.model;

import java.util.List;

/**
 * Created by chixq on 8/2/15.
 */
public class DataSet {
    private String GroupId;
    private String GroupName;
    private String CreateTime;
    private String Type;
    private List<Rule> Rule;

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

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public List<com.fit2cloud.ucloud.unet.model.Rule> getRule() {
        return Rule;
    }

    public void setRule(List<com.fit2cloud.ucloud.unet.model.Rule> rule) {
        Rule = rule;
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "GroupId='" + GroupId + '\'' +
                ", GroupName='" + GroupName + '\'' +
                ", CreateTime='" + CreateTime + '\'' +
                ", Type='" + Type + '\'' +
                ", Rule=" + Rule +
                '}';
    }
}


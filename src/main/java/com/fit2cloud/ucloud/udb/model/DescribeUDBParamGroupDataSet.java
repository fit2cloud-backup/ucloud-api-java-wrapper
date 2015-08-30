package com.fit2cloud.ucloud.udb.model;

import java.util.List;

/**
 * Created by chixq on 8/30/15.
 */
public class DescribeUDBParamGroupDataSet {
    private Integer GroupId;
    private String GroupName;
    private String DBTypeId;
    private String Description;
    private Boolean Modifiable;
    private List<ParamMemberSet> ParamMember;

    public Integer getGroupId() {
        return GroupId;
    }

    public void setGroupId(Integer groupId) {
        GroupId = groupId;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public String getDBTypeId() {
        return DBTypeId;
    }

    public void setDBTypeId(String DBTypeId) {
        this.DBTypeId = DBTypeId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Boolean getModifiable() {
        return Modifiable;
    }

    public void setModifiable(Boolean modifiable) {
        Modifiable = modifiable;
    }

    public List<ParamMemberSet> getParamMember() {
        return ParamMember;
    }

    public void setParamMember(List<ParamMemberSet> paramMember) {
        ParamMember = paramMember;
    }
}

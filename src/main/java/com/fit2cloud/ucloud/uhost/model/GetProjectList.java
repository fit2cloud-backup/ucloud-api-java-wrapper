package com.fit2cloud.ucloud.uhost.model;

/**
 * Created by max on 2020-04-30.
 */
public class GetProjectList {
    private String ProjectId;
    private String ProjectName;
    private String ParentId;
    private String ParentName;
    private String CreateTime;
    private Boolean IsDefault;
    private String MemberCount;
    private String ResourceCount;

    public String getParentId() {
        return ParentId;
    }

    public void setParentId(String parentId) {
        ParentId = parentId;
    }

    public String getParentName() {
        return ParentName;
    }

    public void setParentName(String parentName) {
        ParentName = parentName;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public Boolean getDefault() {
        return IsDefault;
    }

    public void setDefault(Boolean aDefault) {
        IsDefault = aDefault;
    }

    public String getMemberCount() {
        return MemberCount;
    }

    public void setMemberCount(String memberCount) {
        MemberCount = memberCount;
    }

    public String getResourceCount() {
        return ResourceCount;
    }

    public void setResourceCount(String resourceCount) {
        ResourceCount = resourceCount;
    }

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
        ProjectId = projectId;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }
}

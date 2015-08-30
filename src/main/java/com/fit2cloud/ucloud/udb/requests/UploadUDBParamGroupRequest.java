
package com.fit2cloud.ucloud.udb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class UploadUDBParamGroupRequest extends Request {
    private String Region;
    private String ProjectId;
    private String DBTypeId;
    private String GroupName;
    private String Description;
    private String Content;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public String getProjectId() {
        return ProjectId;
    }

    public void setDBTypeId(String DBTypeId) {
        this.DBTypeId = DBTypeId;
    }

    public String getDBTypeId() {
        return DBTypeId;
    }

    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getDescription() {
        return Description;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getContent() {
        return Content;
    }


}
        
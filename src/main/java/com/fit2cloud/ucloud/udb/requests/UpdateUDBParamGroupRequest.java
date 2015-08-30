
package com.fit2cloud.ucloud.udb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class UpdateUDBParamGroupRequest extends Request {
    private String Region;
    private String ProjectId;
    private Integer GroupId;
    private String Key;
    private String Value;


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

    public void setGroupId(Integer GroupId) {
        this.GroupId = GroupId;
    }

    public Integer getGroupId() {
        return GroupId;
    }

    public void setKey(String Key) {
        this.Key = Key;
    }

    public String getKey() {
        return Key;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public String getValue() {
        return Value;
    }


}
        
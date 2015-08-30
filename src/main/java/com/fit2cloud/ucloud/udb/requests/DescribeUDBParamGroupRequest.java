
package com.fit2cloud.ucloud.udb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeUDBParamGroupRequest extends Request {
    private String Region;
    private String ProjectId;
    private Integer GroupId;
    private Integer Offset;
    private Integer Limit;


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

    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    public Integer getOffset() {
        return Offset;
    }

    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    public Integer getLimit() {
        return Limit;
    }


}
        
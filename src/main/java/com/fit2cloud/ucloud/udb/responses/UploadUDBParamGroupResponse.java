
package com.fit2cloud.ucloud.udb.responses;

import com.fit2cloud.ucloud.Response;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class UploadUDBParamGroupResponse extends Response {
    private Integer GroupId;


    public void setGroupId(Integer GroupId) {
        this.GroupId = GroupId;
    }

    public Integer getGroupId() {
        return GroupId;
    }


}
        
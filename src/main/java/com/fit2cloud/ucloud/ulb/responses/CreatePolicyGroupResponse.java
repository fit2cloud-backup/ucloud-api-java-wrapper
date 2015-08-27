
package com.fit2cloud.ucloud.ulb.responses;

import com.fit2cloud.ucloud.Response;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreatePolicyGroupResponse extends Response {
    private String GroupId;


    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public String getGroupId() {
        return GroupId;
    }


}
        
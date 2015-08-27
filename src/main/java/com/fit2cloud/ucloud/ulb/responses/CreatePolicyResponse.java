
package com.fit2cloud.ucloud.ulb.responses;

import com.fit2cloud.ucloud.Response;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreatePolicyResponse extends Response {
    private String PolicyId;


    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    public String getPolicyId() {
        return PolicyId;
    }


}
        
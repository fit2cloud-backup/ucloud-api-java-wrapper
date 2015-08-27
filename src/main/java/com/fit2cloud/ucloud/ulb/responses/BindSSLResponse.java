
package com.fit2cloud.ucloud.ulb.responses;

import com.fit2cloud.ucloud.Response;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class BindSSLResponse extends Response {
    private String ULBId;


    public void setULBId(String ULBId) {
        this.ULBId = ULBId;
    }

    public String getULBId() {
        return ULBId;
    }


}
        
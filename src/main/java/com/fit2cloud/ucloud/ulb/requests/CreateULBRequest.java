
package com.fit2cloud.ucloud.ulb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreateULBRequest extends Request {
    private String Region;
    private String ULBName;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setULBName(String ULBName) {
        this.ULBName = ULBName;
    }

    public String getULBName() {
        return ULBName;
    }


}
        
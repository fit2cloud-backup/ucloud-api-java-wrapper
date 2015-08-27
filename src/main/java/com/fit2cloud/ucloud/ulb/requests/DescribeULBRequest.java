
package com.fit2cloud.ucloud.ulb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeULBRequest extends Request {
    private String Region;
    private Integer Offset;
    private Integer Limit;
    private String ULBId;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
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

    public void setULBId(String ULBId) {
        this.ULBId = ULBId;
    }

    public String getULBId() {
        return ULBId;
    }


}
        

package com.fit2cloud.ucloud.ulb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeSSLRequest extends Request {
    private String Region;
    private String SSLId;
    private Integer Limit;
    private Integer Offset;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    public String getSSLId() {
        return SSLId;
    }

    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    public Integer getLimit() {
        return Limit;
    }

    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    public Integer getOffset() {
        return Offset;
    }


}
        

package com.fit2cloud.ucloud.ulb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreateSSLRequest extends Request {
    private String Region;
    private String SSLContent;
    private String SSLName;
    private Integer SSLType;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setSSLContent(String SSLContent) {
        this.SSLContent = SSLContent;
    }

    public String getSSLContent() {
        return SSLContent;
    }

    public void setSSLName(String SSLName) {
        this.SSLName = SSLName;
    }

    public String getSSLName() {
        return SSLName;
    }

    public void setSSLType(Integer SSLType) {
        this.SSLType = SSLType;
    }

    public Integer getSSLType() {
        return SSLType;
    }


}
        
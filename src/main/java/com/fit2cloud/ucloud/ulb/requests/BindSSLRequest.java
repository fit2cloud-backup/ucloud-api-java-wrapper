
package com.fit2cloud.ucloud.ulb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class BindSSLRequest extends Request {
    private String Region;
    private String SSLId;
    private String ULBId;
    private String VServerId;


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

    public void setULBId(String ULBId) {
        this.ULBId = ULBId;
    }

    public String getULBId() {
        return ULBId;
    }

    public void setVServerId(String VServerId) {
        this.VServerId = VServerId;
    }

    public String getVServerId() {
        return VServerId;
    }


}
        
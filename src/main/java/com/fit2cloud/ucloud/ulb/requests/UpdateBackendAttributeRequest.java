
package com.fit2cloud.ucloud.ulb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class UpdateBackendAttributeRequest extends Request {
    private String Region;
    private String ULBId;
    private String BackendId;
    private Integer Port;
    private Integer Enabled;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setULBId(String ULBId) {
        this.ULBId = ULBId;
    }

    public String getULBId() {
        return ULBId;
    }

    public void setBackendId(String BackendId) {
        this.BackendId = BackendId;
    }

    public String getBackendId() {
        return BackendId;
    }

    public void setPort(Integer Port) {
        this.Port = Port;
    }

    public Integer getPort() {
        return Port;
    }

    public void setEnabled(Integer Enabled) {
        this.Enabled = Enabled;
    }

    public Integer getEnabled() {
        return Enabled;
    }


}
        
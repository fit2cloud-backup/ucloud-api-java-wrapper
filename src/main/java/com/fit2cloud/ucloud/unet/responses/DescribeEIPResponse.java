
package com.fit2cloud.ucloud.unet.responses;

import com.fit2cloud.ucloud.Response;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeEIPResponse extends Response {
    private List<com.fit2cloud.ucloud.unet.model.EIPSet> EIPSet;

    public List<com.fit2cloud.ucloud.unet.model.EIPSet> getEIPSet() {
        return EIPSet;
    }

    public void setEIPSet(List<com.fit2cloud.ucloud.unet.model.EIPSet> EIPSet) {
        this.EIPSet = EIPSet;
    }

    @Override
    public String toString() {
        return "DescribeEIPResponse{" +
                "EIPSet=" + EIPSet +
                '}';
    }
}
        
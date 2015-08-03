
package com.fit2cloud.ucloud.unet.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class AllocateVIPRequest extends Request {
    private String Region;
    private int Count;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setCount(Integer Count) {
        this.Count = Count;
    }

    public int getCount() {
        return Count;
    }

    @Override
    public String toString() {
        return "AllocateVIPRequest{" +
                "Region='" + Region + '\'' +
                ", Count=" + Count +
                '}';
    }
}
        
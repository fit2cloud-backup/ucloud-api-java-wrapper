package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:45 PM
 * Email: xqiang.chi@samsung.com
 */
public class TerminateCustomImageRequest extends Request {
    private String Region;
    private String ImageId;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
        ImageId = imageId;
    }

    @Override
    public String toString() {
        return "TerminateCustomImageRequest{" +
                "Region='" + Region + '\'' +
                ", ImageId='" + ImageId + '\'' +
                '}';
    }
}

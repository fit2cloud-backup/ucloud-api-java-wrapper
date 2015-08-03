package com.fit2cloud.ucloud.uhost.responses;

import com.fit2cloud.ucloud.Response;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:43 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreateCustomImageResponse extends Response {
    private String ImageId;

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
        ImageId = imageId;
    }

    @Override
    public String toString() {
        return "CreateCustomImageResponse{" +
                "ImageId='" + ImageId + '\'' +
                '}';
    }
}

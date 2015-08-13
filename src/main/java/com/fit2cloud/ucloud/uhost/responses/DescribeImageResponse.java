package com.fit2cloud.ucloud.uhost.responses;

import com.fit2cloud.ucloud.Response;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/24/15
 * Time: 1:24 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeImageResponse extends Response {
    private List<com.fit2cloud.ucloud.uhost.model.ImageSet> ImageSet;

    public List<com.fit2cloud.ucloud.uhost.model.ImageSet> getImageSet() {
        return ImageSet;
    }

    public void setImageSet(List<com.fit2cloud.ucloud.uhost.model.ImageSet> imageSet) {
        ImageSet = imageSet;
    }

    @Override
    public String toString() {
        return "DescribeImageResponse{" +
                "ImageSet=" + ImageSet +
                '}';
    }
}

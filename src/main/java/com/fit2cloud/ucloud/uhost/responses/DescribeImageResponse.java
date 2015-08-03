package com.fit2cloud.ucloud.uhost.responses;

import com.fit2cloud.ucloud.Response;
import com.fit2cloud.ucloud.uhost.model.Image;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/24/15
 * Time: 1:24 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeImageResponse extends Response {
    private List<Image> ImageSet;

    public List<Image> getImageSet() {
        return ImageSet;
    }

    public void setImageSet(List<Image> imageSet) {
        ImageSet = imageSet;
    }

    @Override
    public String toString() {
        return "DescribeImageResponse{" +
                "ImageSet=" + ImageSet +
                '}';
    }
}

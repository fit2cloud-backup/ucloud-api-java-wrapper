package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;
import com.fit2cloud.ucloud.uhost.model.ImageType;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/24/15
 * Time: 1:20 PM
 * Email: xqiang.chi@samsung.com
 */
public class DescribeImageRequest extends Request {
    private String Region;
    private ImageType ImageType;
    private com.fit2cloud.ucloud.uhost.model.OsType OsType;
    private String ImageId;
    private int Offset = 0;
    private int Limit = 20;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public com.fit2cloud.ucloud.uhost.model.ImageType getImageType() {
        return ImageType;
    }

    public void setImageType(com.fit2cloud.ucloud.uhost.model.ImageType imageType) {
        ImageType = imageType;
    }

    public com.fit2cloud.ucloud.uhost.model.OsType getOsType() {
        return OsType;
    }

    public void setOsType(com.fit2cloud.ucloud.uhost.model.OsType osType) {
        OsType = osType;
    }

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
        ImageId = imageId;
    }

    public int getOffset() {
        return Offset;
    }

    public void setOffset(int offset) {
        Offset = offset;
    }

    public int getLimit() {
        return Limit;
    }

    public void setLimit(int limit) {
        Limit = limit;
    }

    @Override
    public String toString() {
        return "DescribeImageRequest{" +
                "Region=" + Region +
                ", ImageType=" + ImageType +
                ", OsType=" + OsType +
                ", ImageId='" + ImageId + '\'' +
                ", Offset=" + Offset +
                ", Limit=" + Limit +
                '}';
    }
}

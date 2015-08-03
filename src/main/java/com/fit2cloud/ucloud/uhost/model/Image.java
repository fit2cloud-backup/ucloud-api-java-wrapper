package com.fit2cloud.ucloud.uhost.model;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/24/15
 * Time: 1:28 PM
 * Email: xqiang.chi@samsung.com
 */
public class Image {
    private String ImageId;
    private String ImageName;
    private OsType OsType;
    private String OsName;
    private ImageType ImageType;
    private List<String> Features;
    private String FuncType;
    private String IntegratedSoftware;
    private String Vendor;
    private String Links;
    private String State;
    private ImageState ImageState;
    private String ImageDescription;
    private int CreateTime;

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
        ImageId = imageId;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String imageName) {
        ImageName = imageName;
    }

    public com.fit2cloud.ucloud.uhost.model.OsType getOsType() {
        return OsType;
    }

    public void setOsType(com.fit2cloud.ucloud.uhost.model.OsType osType) {
        OsType = osType;
    }

    public String getOsName() {
        return OsName;
    }

    public void setOsName(String osName) {
        OsName = osName;
    }

    public com.fit2cloud.ucloud.uhost.model.ImageType getImageType() {
        return ImageType;
    }

    public void setImageType(com.fit2cloud.ucloud.uhost.model.ImageType imageType) {
        ImageType = imageType;
    }

    public List<String> getFeatures() {
        return Features;
    }

    public void setFeatures(List<String> features) {
        Features = features;
    }

    public String getFuncType() {
        return FuncType;
    }

    public void setFuncType(String funcType) {
        FuncType = funcType;
    }

    public String getIntegratedSoftware() {
        return IntegratedSoftware;
    }

    public void setIntegratedSoftware(String integratedSoftware) {
        IntegratedSoftware = integratedSoftware;
    }

    public String getVendor() {
        return Vendor;
    }

    public void setVendor(String vendor) {
        Vendor = vendor;
    }

    public String getLinks() {
        return Links;
    }

    public void setLinks(String links) {
        Links = links;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public com.fit2cloud.ucloud.uhost.model.ImageState getImageState() {
        return ImageState;
    }

    public void setImageState(com.fit2cloud.ucloud.uhost.model.ImageState imageState) {
        ImageState = imageState;
    }

    public String getImageDescription() {
        return ImageDescription;
    }

    public void setImageDescription(String imageDescription) {
        ImageDescription = imageDescription;
    }

    public int getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(int createTime) {
        CreateTime = createTime;
    }

    @Override
    public String toString() {
        return "Image{" +
                "ImageId='" + ImageId + '\'' +
                ", ImageName='" + ImageName + '\'' +
                ", OsType=" + OsType +
                ", OsName='" + OsName + '\'' +
                ", ImageType=" + ImageType +
                ", Features=" + Features +
                ", FuncType='" + FuncType + '\'' +
                ", IntegratedSoftware='" + IntegratedSoftware + '\'' +
                ", Vendor='" + Vendor + '\'' +
                ", Links='" + Links + '\'' +
                ", State='" + State + '\'' +
                ", ImageState=" + ImageState +
                ", ImageDescription='" + ImageDescription + '\'' +
                ", CreateTime=" + CreateTime +
                '}';
    }
}

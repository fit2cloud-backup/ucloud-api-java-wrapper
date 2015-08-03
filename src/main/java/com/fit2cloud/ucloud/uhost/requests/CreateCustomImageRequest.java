package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:41 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreateCustomImageRequest extends Request {
    private String Region;
    private String UHostId;
    private String ImageName;
    private String ImageDescription;
    private String ProjectId;

    @Override
    public String toString() {
        return "CreateCustomImageRequest{" +
                "Region='" + Region + '\'' +
                ", UHostId='" + UHostId + '\'' +
                ", ImageName='" + ImageName + '\'' +
                ", ImageDescription='" + ImageDescription + '\'' +
                ", ProjectId='" + ProjectId + '\'' +
                '}';
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getUHostId() {
        return UHostId;
    }

    public void setUHostId(String UHostId) {
        this.UHostId = UHostId;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String imageName) {
        ImageName = imageName;
    }

    public String getImageDescription() {
        return ImageDescription;
    }

    public void setImageDescription(String imageDescription) {
        ImageDescription = imageDescription;
    }

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
        ProjectId = projectId;
    }
}

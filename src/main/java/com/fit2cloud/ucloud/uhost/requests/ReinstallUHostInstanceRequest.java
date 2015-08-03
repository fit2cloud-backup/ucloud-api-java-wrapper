package com.fit2cloud.ucloud.uhost.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:15 PM
 * Email: xqiang.chi@samsung.com
 */
public class ReinstallUHostInstanceRequest extends Request {
    private String Region;
    private String UHostId;
    private String Password;
    private String ImageId;
    private String ReserveDisk = "Yes";

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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String imageId) {
        ImageId = imageId;
    }

    public String getReserveDisk() {
        return ReserveDisk;
    }

    public void setReserveDisk(String reserveDisk) {
        ReserveDisk = reserveDisk;
    }

    @Override
    public String toString() {
        return "ReinstallUHostInstanceRequest{" +
                "Region='" + Region + '\'' +
                ", UHostId='" + UHostId + '\'' +
                ", Password='" + Password + '\'' +
                ", ImageId='" + ImageId + '\'' +
                ", ReserveDisk='" + ReserveDisk + '\'' +
                '}';
    }

}

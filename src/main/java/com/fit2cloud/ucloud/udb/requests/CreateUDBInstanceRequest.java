
package com.fit2cloud.ucloud.udb.requests;

import com.fit2cloud.ucloud.Request;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/28/15
 * Time: 1:47 PM
 * Email: xqiang.chi@samsung.com
 */
public class CreateUDBInstanceRequest extends Request {
    private String Region;
    private String ProjectId;
    private String DBTypeId;
    private String ChargeType;
    private String CouponId;
    private Integer Quantity;
    private String Name;
    private String AdminUser;
    private String AdminPassword;
    private Integer Port;
    private Integer ParamGroupId;
    private Integer MemoryLimit;
    private Integer DiskSpace;
    private Integer BackupCount;
    private Integer BackupTime;
    private Integer BackupDuration;
    private Integer BackupId;
    private Boolean UseSSD;
    private String SSDType;


    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public String getProjectId() {
        return ProjectId;
    }

    public void setDBTypeId(String DBTypeId) {
        this.DBTypeId = DBTypeId;
    }

    public String getDBTypeId() {
        return DBTypeId;
    }

    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    public String getChargeType() {
        return ChargeType;
    }

    public void setCouponId(String CouponId) {
        this.CouponId = CouponId;
    }

    public String getCouponId() {
        return CouponId;
    }

    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setAdminUser(String AdminUser) {
        this.AdminUser = AdminUser;
    }

    public String getAdminUser() {
        return AdminUser;
    }

    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setPort(Integer Port) {
        this.Port = Port;
    }

    public Integer getPort() {
        return Port;
    }

    public void setParamGroupId(Integer ParamGroupId) {
        this.ParamGroupId = ParamGroupId;
    }

    public Integer getParamGroupId() {
        return ParamGroupId;
    }

    public void setMemoryLimit(Integer MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    public Integer getMemoryLimit() {
        return MemoryLimit;
    }

    public void setDiskSpace(Integer DiskSpace) {
        this.DiskSpace = DiskSpace;
    }

    public Integer getDiskSpace() {
        return DiskSpace;
    }

    public void setBackupCount(Integer BackupCount) {
        this.BackupCount = BackupCount;
    }

    public Integer getBackupCount() {
        return BackupCount;
    }

    public void setBackupTime(Integer BackupTime) {
        this.BackupTime = BackupTime;
    }

    public Integer getBackupTime() {
        return BackupTime;
    }

    public void setBackupDuration(Integer BackupDuration) {
        this.BackupDuration = BackupDuration;
    }

    public Integer getBackupDuration() {
        return BackupDuration;
    }

    public void setBackupId(Integer BackupId) {
        this.BackupId = BackupId;
    }

    public Integer getBackupId() {
        return BackupId;
    }

    public void setUseSSD(Boolean UseSSD) {
        this.UseSSD = UseSSD;
    }

    public Boolean getUseSSD() {
        return UseSSD;
    }

    public void setSSDType(String SSDType) {
        this.SSDType = SSDType;
    }

    public String getSSDType() {
        return SSDType;
    }


}
        
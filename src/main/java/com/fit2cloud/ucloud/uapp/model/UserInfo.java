package com.fit2cloud.ucloud.uapp.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangbohan on 15/11/2.
 */
public class UserInfo {
    //用户ID
    private Integer UserId;
    //用户邮箱
    private String UserEmail;
    //用户手机
    private String UserPhone;
    //会员类型
    private Integer UserType;
    //称呼
    private String  UserName;
    //公司名称
    private String CompanyName;
    //所属行业
    private Integer IndustryType;
    //省份
    private String  Province;
    //城市
    private String City;
    //公司地址
    private String UserAddress;

    private static final Map<Integer, String> userTypeMap = new HashMap<Integer, String>();
    static {
        userTypeMap.put(0 ,"企业");
        userTypeMap.put(1 ,"个人");
    }

    private static final Map<Integer, String> industryTypeMap = new HashMap<Integer, String>();
    static {
        industryTypeMap.put(20000 ,"游戏");
        industryTypeMap.put(40000 ,"视频娱乐(电竞直播,秀场)");
        industryTypeMap.put(41000 ,"在线教育");
        industryTypeMap.put(42000 ,"广告营销");
        industryTypeMap.put(43000 ,"电子商务");
        industryTypeMap.put(44000	,"本地生活");
        industryTypeMap.put(45000	,"互联网金融");
        industryTypeMap.put(46000	,"企业服务(SAAS/PASS)");
        industryTypeMap.put(47000	,"社交网络");
        industryTypeMap.put(48000	,"影音阅读");
        industryTypeMap.put(49000	,"个人工具软件");
        industryTypeMap.put(29000 ,"智能硬件");
        industryTypeMap.put(52000 ,"传统企业");
        industryTypeMap.put(30000 ,"其他");
    }


    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPhone() {
        return UserPhone;
    }

    public void setUserPhone(String userPhone) {
        UserPhone = userPhone;
    }

    public Integer getUserType() {
        return UserType;
    }

    public void setUserType(Integer userType) {
        UserType = userType;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public Integer getIndustryType() {
        return IndustryType;
    }

    public void setIndustryType(Integer industryType) {
        IndustryType = industryType;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getUserAddress() {
        return UserAddress;
    }

    public void setUserAddress(String userAddress) {
        UserAddress = userAddress;
    }

    public String getUserTypeName(Integer userType){
        return userTypeMap.getOrDefault(userType, "个人");
    }

    public String getIndustryTypeName(Integer industryType){
        return industryTypeMap.getOrDefault(industryType,"其他");
    }
}

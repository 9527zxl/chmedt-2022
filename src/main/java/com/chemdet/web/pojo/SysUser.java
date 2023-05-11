package com.chemdet.web.pojo;

import java.time.LocalDateTime;

public class SysUser {
    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户类型：
     * 1系统管理员
     * 0普通用户
     */
    private Integer userType;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 密码（使用MD5算法加密）
     */
    private String password;

    /**
     * 性别：
     * 0：男
     * 1：女
     * 90：未知
     * 99：不详
     */
    private Integer gender;

    /**
     * 生日
     */
    private LocalDateTime birthdate;

    /**
     * 职位
     */
    private String title;

    /**
     * 联系方式
     */
    private String mobile;

    /**
     * 办公电话
     */
    private String officeTel;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 登录次数
     */
    private Integer loginCount;

    /**
     * 最近登录IP
     */
    private String lastLoginIp;

    /**
     * 最近登录时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 排序值
     */
    private Integer orderValue;

    /**
     * 部门编号
     */
    private Long deptNo;

    /**
     * 所属区域
     */
    private Long regionId;

    /**
     * 用户是否激活：
     * 0 未激活
     * 1 已激活
     */
    private Integer isDel;

    /**
     * 用户是否激活：
     * 0 未激活
     * 1 已激活
     */
    private Integer isActive;

    /**
     * 用户头像
     */
    private String userImg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public LocalDateTime getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDateTime birthdate) {
        this.birthdate = birthdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOfficeTel() {
        return officeTel;
    }

    public void setOfficeTel(String officeTel) {
        this.officeTel = officeTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(Integer orderValue) {
        this.orderValue = orderValue;
    }

    public Long getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Long deptNo) {
        this.deptNo = deptNo;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", userType=" + userType +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", birthdate=" + birthdate +
                ", title='" + title + '\'' +
                ", mobile='" + mobile + '\'' +
                ", officeTel='" + officeTel + '\'' +
                ", email='" + email + '\'' +
                ", loginCount=" + loginCount +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", orderValue=" + orderValue +
                ", deptNo=" + deptNo +
                ", regionId=" + regionId +
                ", isDel=" + isDel +
                ", isActive=" + isActive +
                ", userImg='" + userImg + '\'' +
                '}';
    }
}


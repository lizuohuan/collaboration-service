package com.magicbeans.collaboration.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.magicbeans.base.BaseEntity;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author null123
 * @since 2018-02-12
 */
@TableName("t_user")
public class User extends BaseEntity<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 昵称
     */
    private String nickName;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 登录密码
     */
    private String pwd;
    /**
     * 性别  0：男  1：女
     */
    private Integer sex;
    /**
     * 地区id
     */
    private Integer cityId;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 上级id
     */
    private String parentId;
    /**
     * 代理人id
     */
    private String agencyUserId;
    /**
     * 是否允许代理编辑 0：否  1：是
     */
    private Integer agencyIsEdit;
    /**
     * 是否允许代理删除 0：否  1：是
     */
    private Integer agencyIsDel;
    /**
     * 是否开通代理商权限 0：否  1：是
     */
    private Integer agencyIsJurisdiction;
    /**
     * 备注
     */
    private String remark;

    /** 请求令牌 */
    private String token;

    /** 设备token */
    private String deviceToken;

    /** 设备类型 0:android  1:ios */
    private Integer deviceType;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }


    public Integer getAgencyIsEdit() {
        return agencyIsEdit;
    }

    public void setAgencyIsEdit(Integer agencyIsEdit) {
        this.agencyIsEdit = agencyIsEdit;
    }

    public Integer getAgencyIsDel() {
        return agencyIsDel;
    }

    public void setAgencyIsDel(Integer agencyIsDel) {
        this.agencyIsDel = agencyIsDel;
    }

    public Integer getAgencyIsJurisdiction() {
        return agencyIsJurisdiction;
    }

    public void setAgencyIsJurisdiction(Integer agencyIsJurisdiction) {
        this.agencyIsJurisdiction = agencyIsJurisdiction;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        "nickName=" + nickName +
        ", avatar=" + avatar +
        ", phone=" + phone +
        ", pwd=" + pwd +
        ", sex=" + sex +
        ", cityId=" + cityId +
        ", address=" + address +
        ", parentId=" + parentId +
        ", agencyUserId=" + agencyUserId +
        ", agencyIsEdit=" + agencyIsEdit +
        ", agencyIsDel=" + agencyIsDel +
        ", agencyIsJurisdiction=" + agencyIsJurisdiction +
        ", remark=" + remark +
        "}";
    }

    /**
     * 获取 代理人id
     */
    public String getAgencyUserId() {
        return this.agencyUserId;
    }

    /**
     * 设置 代理人id
     */
    public void setAgencyUserId(String agencyUserId) {
        this.agencyUserId = agencyUserId;
    }

    /** 获取 请求令牌 */
    public String getToken() {
        return this.token;
    }

    /** 设置 请求令牌 */
    public void setToken(String token) {
        this.token = token;
    }

    /** 获取 设备token */
    public String getDeviceToken() {
        return this.deviceToken;
    }

    /** 设置 设备token */
    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    /** 获取 设备类型 0:android  1:ios */
    public Integer getDeviceType() {
        return this.deviceType;
    }

    /** 设置 设备类型 0:android  1:ios */
    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }
}

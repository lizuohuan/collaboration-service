package com.magicbeans.collaboration.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.magicbeans.base.BaseEntity;

/**
 * <p>
 * 搭配
 * </p>
 *
 * @author null123
 * @since 2018-02-12
 */
@TableName("t_clothing_match")
public class ClothingMatch extends BaseEntity<ClothingMatch> {

    private static final long serialVersionUID = 1L;

    /**
     * 搭配封面图
     */
    private String cover;
    /**
     * 所属季节 以逗号隔开
     */
    private String season;
    /**
     * 备注 搭配说明
     */
    private String remark;
    /**
     * 是否仅自己可见  0：否  1：是
     */
    private Integer isHisOnlyTheVisible;
    /**
     * 奔到是否明天提示
     */
    private Integer isTomorrowHint;


    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsHisOnlyTheVisible() {
        return isHisOnlyTheVisible;
    }

    public void setIsHisOnlyTheVisible(Integer isHisOnlyTheVisible) {
        this.isHisOnlyTheVisible = isHisOnlyTheVisible;
    }

    public Integer getIsTomorrowHint() {
        return isTomorrowHint;
    }

    public void setIsTomorrowHint(Integer isTomorrowHint) {
        this.isTomorrowHint = isTomorrowHint;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ClothingMatch{" +
        "cover=" + cover +
        ", season=" + season +
        ", remark=" + remark +
        ", isHisOnlyTheVisible=" + isHisOnlyTheVisible +
        ", isTomorrowHint=" + isTomorrowHint +
        "}";
    }
}

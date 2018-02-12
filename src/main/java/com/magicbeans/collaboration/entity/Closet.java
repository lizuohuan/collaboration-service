package com.magicbeans.collaboration.entity;

import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.magicbeans.base.BaseEntity;

/**
 * <p>
 * 衣柜
 * </p>
 *
 * @author null123
 * @since 2018-02-12
 */
@TableName("t_closet")
public class Closet extends BaseEntity<Closet> {

    private static final long serialVersionUID = 1L;

    /**
     * 衣柜编号/名
     */
    private String name;
    /**
     * 位置
     */
    private String place;
    /**
     * 图片
     */
    private String img;
    /**
     * 衣柜所输入Id
     */
    private String userId;
    /**
     * 是否激活
     */
    private Integer isActivate;

    /***************  衣柜中的服装  *****************/

    /** 服装集合 */
    @TableField(exist = false)
    private List<Clothing> clothingList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getIsActivate() {
        return isActivate;
    }

    public void setIsActivate(Integer isActivate) {
        this.isActivate = isActivate;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Closet{" +
        "name=" + name +
        ", place=" + place +
        ", img=" + img +
        ", userId=" + userId +
        ", isActivate=" + isActivate +
        "}";
    }

    /** 获取 服装集合 */
    public List<Clothing> getClothingList() {
        return this.clothingList;
    }

    /** 设置 服装集合 */
    public void setClothingList(List<Clothing> clothingList) {
        this.clothingList = clothingList;
    }
}

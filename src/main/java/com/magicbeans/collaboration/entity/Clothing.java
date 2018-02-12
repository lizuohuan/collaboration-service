package com.magicbeans.collaboration.entity;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.magicbeans.base.BaseEntity;

/**
 * <p>
 * 服装
 * </p>
 *
 * @author null123
 * @since 2018-02-12
 */
@TableName("t_clothing")
public class Clothing extends BaseEntity<Clothing> {

    private static final long serialVersionUID = 1L;

    /**
     * 名称
     */
    private String name;
    /**
     * 编码
     */
    private String coding;
    /**
     * 服装所属类型id
     */
    private String clothingTypeId;
    /**
     * 所属季节 以逗号隔开
     */
    private String season;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 规格尺寸 L M S ...
     */
    private String size;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 使用次数
     */
    private Integer useNum;
    /**
     * 如何清洗
     */
    private String rinse;
    /**
     * 喜欢星级 最多五颗星
     */
    private Integer loveLevel;
    /**
     * 购买时间
     */
    private Date buyTime;
    /**
     * 购买来源  如淘宝、京东...
     */
    private String buySource;
    /**
     * 归属人id
     */
    private String userId;
    /**
     * 归属衣柜id
     */
    private String closetId;
    /**
     * 衣柜中位置  如柜左上、柜左下...
     */
    private String place;
    /**
     * 备注
     */
    private String remark;
    /**
     * 最新一次使用时间
     */
    private Date newUseTime;
    /**
     * 使用状态 0：在柜  1：已取出  
     */
    private Integer useStatus;

    /** 存放方式  0：叠放  1：悬挂 */
    private Integer depositWay;

    /** 坐标 衣服在衣柜中放置的横纵坐标  逗号隔开 */
    private String coordinate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }

    public String getClothingTypeId() {
        return clothingTypeId;
    }

    public void setClothingTypeId(String clothingTypeId) {
        this.clothingTypeId = clothingTypeId;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getUseNum() {
        return useNum;
    }

    public void setUseNum(Integer useNum) {
        this.useNum = useNum;
    }

    public String getRinse() {
        return rinse;
    }

    public void setRinse(String rinse) {
        this.rinse = rinse;
    }

    public Integer getLoveLevel() {
        return loveLevel;
    }

    public void setLoveLevel(Integer loveLevel) {
        this.loveLevel = loveLevel;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public String getBuySource() {
        return buySource;
    }

    public void setBuySource(String buySource) {
        this.buySource = buySource;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getClosetId() {
        return closetId;
    }

    public void setClosetId(String closetId) {
        this.closetId = closetId;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getNewUseTime() {
        return newUseTime;
    }

    public void setNewUseTime(Date newUseTime) {
        this.newUseTime = newUseTime;
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Clothing{" +
        "name=" + name +
        ", coding=" + coding +
        ", clothingTypeId=" + clothingTypeId +
        ", season=" + season +
        ", brandName=" + brandName +
        ", size=" + size +
        ", price=" + price +
        ", useNum=" + useNum +
        ", rinse=" + rinse +
        ", loveLevel=" + loveLevel +
        ", buyTime=" + buyTime +
        ", buySource=" + buySource +
        ", userId=" + userId +
        ", closetId=" + closetId +
        ", place=" + place +
        ", remark=" + remark +
        ", newUseTime=" + newUseTime +
        ", useStatus=" + useStatus +
        "}";
    }

    /** 获取 存放方式  0：叠放  1：悬挂 */
    public Integer getDepositWay() {
        return this.depositWay;
    }

    /** 设置 存放方式  0：叠放  1：悬挂 */
    public void setDepositWay(Integer depositWay) {
        this.depositWay = depositWay;
    }

    /** 获取 坐标 衣服在衣柜中放置的横纵坐标  逗号隔开 */
    public String getCoordinate() {
        return this.coordinate;
    }

    /** 设置 坐标 衣服在衣柜中放置的横纵坐标  逗号隔开 */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }
}

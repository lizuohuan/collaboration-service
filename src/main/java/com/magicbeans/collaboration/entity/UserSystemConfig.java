package com.magicbeans.collaboration.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.magicbeans.base.BaseEntity;

/**
 * <p>
 * 用户的系统配置
 * </p>
 *
 * @author null123
 * @since 2018-02-12
 */
@TableName("t_user_system_config")
public class UserSystemConfig extends BaseEntity<UserSystemConfig> {

    private static final long serialVersionUID = 1L;

    /**
     * 所属人id
     */
    private String userId;
    /**
     * 是否优先展示常用搭配  0：否  1：是
     */
    private Integer isCommonUseMatch;
    /**
     * 未入柜搭配是否可见  0：否 1：是
     */
    private Integer unIntoTheTankIsSee;
    /**
     * 非本季节搭配是否可见
     */
    private Integer mistakeSeasonIsSee;
    /**
     * 未激活衣柜衣服是否有效  0：否 1：是
     */
    private Integer activateClosetIsValid;
    /**
     * 是否仅本季节衣服可见
     */
    private Integer clothingSeasonIsSee;
    /**
     * 是否按购买时间排序  0：否  1：是
     */
    private Integer isBuyTimeOrder;
    /**
     * 是否按价格排序  0：否  1：是
     */
    private Integer isPriceOrder;
    /**
     * 是否按类型（品种）排序  0：否 1：是
     */
    private Integer isTypeOrder;
    /**
     * 是否按使用次数排序  0：否  1：是
     */
    private Integer isUseNumOrder;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getIsCommonUseMatch() {
        return isCommonUseMatch;
    }

    public void setIsCommonUseMatch(Integer isCommonUseMatch) {
        this.isCommonUseMatch = isCommonUseMatch;
    }

    public Integer getUnIntoTheTankIsSee() {
        return unIntoTheTankIsSee;
    }

    public void setUnIntoTheTankIsSee(Integer unIntoTheTankIsSee) {
        this.unIntoTheTankIsSee = unIntoTheTankIsSee;
    }

    public Integer getMistakeSeasonIsSee() {
        return mistakeSeasonIsSee;
    }

    public void setMistakeSeasonIsSee(Integer mistakeSeasonIsSee) {
        this.mistakeSeasonIsSee = mistakeSeasonIsSee;
    }

    public Integer getActivateClosetIsValid() {
        return activateClosetIsValid;
    }

    public void setActivateClosetIsValid(Integer activateClosetIsValid) {
        this.activateClosetIsValid = activateClosetIsValid;
    }

    public Integer getClothingSeasonIsSee() {
        return clothingSeasonIsSee;
    }

    public void setClothingSeasonIsSee(Integer clothingSeasonIsSee) {
        this.clothingSeasonIsSee = clothingSeasonIsSee;
    }

    public Integer getIsBuyTimeOrder() {
        return isBuyTimeOrder;
    }

    public void setIsBuyTimeOrder(Integer isBuyTimeOrder) {
        this.isBuyTimeOrder = isBuyTimeOrder;
    }

    public Integer getIsPriceOrder() {
        return isPriceOrder;
    }

    public void setIsPriceOrder(Integer isPriceOrder) {
        this.isPriceOrder = isPriceOrder;
    }

    public Integer getIsTypeOrder() {
        return isTypeOrder;
    }

    public void setIsTypeOrder(Integer isTypeOrder) {
        this.isTypeOrder = isTypeOrder;
    }

    public Integer getIsUseNumOrder() {
        return isUseNumOrder;
    }

    public void setIsUseNumOrder(Integer isUseNumOrder) {
        this.isUseNumOrder = isUseNumOrder;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserSystemConfig{" +
        "userId=" + userId +
        ", isCommonUseMatch=" + isCommonUseMatch +
        ", unIntoTheTankIsSee=" + unIntoTheTankIsSee +
        ", mistakeSeasonIsSee=" + mistakeSeasonIsSee +
        ", activateClosetIsValid=" + activateClosetIsValid +
        ", clothingSeasonIsSee=" + clothingSeasonIsSee +
        ", isBuyTimeOrder=" + isBuyTimeOrder +
        ", isPriceOrder=" + isPriceOrder +
        ", isTypeOrder=" + isTypeOrder +
        ", isUseNumOrder=" + isUseNumOrder +
        "}";
    }
}

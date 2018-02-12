package com.magicbeans.collaboration.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.magicbeans.base.BaseEntity;

/**
 * <p>
 * 搭配的衣服
 * </p>
 *
 * @author null123
 * @since 2018-02-12
 */
@TableName("t_clothing_match_item")
public class ClothingMatchItem extends BaseEntity<ClothingMatchItem> {

    private static final long serialVersionUID = 1L;

    private String clothingMatchId;
    private String clothingId;


    public String getClothingMatchId() {
        return clothingMatchId;
    }

    public void setClothingMatchId(String clothingMatchId) {
        this.clothingMatchId = clothingMatchId;
    }

    public String getClothingId() {
        return clothingId;
    }

    public void setClothingId(String clothingId) {
        this.clothingId = clothingId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ClothingMatchItem{" +
        "clothingMatchId=" + clothingMatchId +
        ", clothingId=" + clothingId +
        "}";
    }
}

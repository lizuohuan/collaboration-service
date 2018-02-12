package com.magicbeans.collaboration.mapper;

import com.magicbeans.collaboration.entity.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 地区
 * @author lzh
 * @create 2018/2/12 17:47
 */
public interface CityMapper {



    /**
     * 通过ID 和 城市级别 查询城市
     * @param parentId
     * @param levelType
     * @return
     */
    List<City> queryCityByParentId(@Param("cityId") Integer parentId, @Param("levelType") Integer levelType);

    List<City> queryAllCity();

    City queryCityById(@Param("cityId") Integer cityId);

}

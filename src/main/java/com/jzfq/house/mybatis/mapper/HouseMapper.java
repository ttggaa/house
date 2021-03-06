package com.jzfq.house.mybatis.mapper;


import com.jzfq.house.mybatis.domain.House;
import com.jzfq.house.mybatis.domain.HouseQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int countByExample(HouseQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int deleteByExample(HouseQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int insert(House record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int insertSelective(House record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    List<House> selectByExample(HouseQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    House selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") House record, @Param("example") HouseQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByExample(@Param("record") House record, @Param("example") HouseQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByPrimaryKeySelective(House record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByPrimaryKey(House record);
}
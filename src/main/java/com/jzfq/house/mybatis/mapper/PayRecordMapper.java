package com.jzfq.house.mybatis.mapper;

import com.jzfq.house.mybatis.domain.PayRecord;
import com.jzfq.house.mybatis.domain.PayRecordQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PayRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbggenerated Mon Sep 10 15:12:58 CST 2018
     */
    int countByExample(PayRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbggenerated Mon Sep 10 15:12:58 CST 2018
     */
    int deleteByExample(PayRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbggenerated Mon Sep 10 15:12:58 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbggenerated Mon Sep 10 15:12:58 CST 2018
     */
    int insert(PayRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbggenerated Mon Sep 10 15:12:58 CST 2018
     */
    int insertSelective(PayRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbggenerated Mon Sep 10 15:12:58 CST 2018
     */
    List<PayRecord> selectByExample(PayRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbggenerated Mon Sep 10 15:12:58 CST 2018
     */
    PayRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbggenerated Mon Sep 10 15:12:58 CST 2018
     */
    int updateByExampleSelective(@Param("record") PayRecord record, @Param("example") PayRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbggenerated Mon Sep 10 15:12:58 CST 2018
     */
    int updateByExample(@Param("record") PayRecord record, @Param("example") PayRecordQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbggenerated Mon Sep 10 15:12:58 CST 2018
     */
    int updateByPrimaryKeySelective(PayRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_record
     *
     * @mbggenerated Mon Sep 10 15:12:58 CST 2018
     */
    int updateByPrimaryKey(PayRecord record);
}
package com.jzfq.house.mybatis.mapper;

import com.jzfq.house.mybatis.domain.TemplateLink;
import com.jzfq.house.mybatis.domain.TemplateLinkQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TemplateLinkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_link
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int countByExample(TemplateLinkQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_link
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int deleteByExample(TemplateLinkQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_link
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_link
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int insert(TemplateLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_link
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int insertSelective(TemplateLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_link
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    List<TemplateLink> selectByExample(TemplateLinkQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_link
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    TemplateLink selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_link
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") TemplateLink record, @Param("example") TemplateLinkQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_link
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByExample(@Param("record") TemplateLink record, @Param("example") TemplateLinkQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_link
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByPrimaryKeySelective(TemplateLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_link
     *
     * @mbggenerated Mon Sep 03 15:18:29 CST 2018
     */
    int updateByPrimaryKey(TemplateLink record);
}
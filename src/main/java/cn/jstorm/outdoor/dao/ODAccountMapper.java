package cn.jstorm.outdoor.dao;

import cn.jstorm.outdoor.model.ODAccount;

public interface ODAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_table
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    int deleteByPrimaryKey(String accountId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_table
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    int insert(ODAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_table
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    int insertSelective(ODAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_table
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    ODAccount selectByPrimaryKey(String accountId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_table
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    int updateByPrimaryKeySelective(ODAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_table
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    int updateByPrimaryKey(ODAccount record);
}
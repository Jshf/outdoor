package cn.jstorm.outdoor.dao;

import cn.jstorm.outdoor.model.ODUser;

public interface ODUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    int insert(ODUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    int insertSelective(ODUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    ODUser selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    int updateByPrimaryKeySelective(ODUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_table
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    int updateByPrimaryKey(ODUser record);
}
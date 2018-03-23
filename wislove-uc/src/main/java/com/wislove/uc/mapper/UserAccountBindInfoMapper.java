package com.wislove.uc.mapper;

import com.wislove.uc.entity.UserAccountBindInfo;
import java.util.List;

public interface UserAccountBindInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_bind_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_bind_info
     *
     * @mbggenerated
     */
    int insert(UserAccountBindInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_bind_info
     *
     * @mbggenerated
     */
    UserAccountBindInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_bind_info
     *
     * @mbggenerated
     */
    List<UserAccountBindInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account_bind_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserAccountBindInfo record);
}
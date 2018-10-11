package com.neo.dao;

import com.neo.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import javax.annotation.Resource;

@Resource
public interface UserMapper {
    @Select("SELECT * FROM user WHERE  userId = #{userId}")
    User getUser(@Param("userId")String userId);
}

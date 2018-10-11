package com.neo.dao;

import com.neo.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("SELECT * FROM user WHERE  id = #{userId}")
    User getUser(@Param("userId")String userId);
}

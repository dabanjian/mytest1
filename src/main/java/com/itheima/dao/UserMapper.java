package com.itheima.dao;

import com.itheima.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from s_user where password = #{password} and username = #{username} ")
    User login(@Param("username")String username,@Param("password")String password);

    @Select("SELECT rolename FROM s_user")
    List<User> list();

}

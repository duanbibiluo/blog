package com.example.blog.Mapper;

import com.example.blog.model.Entity.UserPo;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{username} and password = #{password} and deleted = 0 ")
    UserPo getUserByUsername(String username,String password);

    @Select("select * from user where username = #{username}")
    UserPo listByUsername(String username);

    @Select("insert into user(username,password,email,phone,role,deleted,status) " +
            "values(#{username},#{password},#{email},#{phone},#{role},#{deleted},#{status})")
    void insert(UserPo userPo);
}

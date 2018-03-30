package com.newer.dao;


import com.newer.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userMapper")
public interface UserMapper {

    @Insert("insert into test0312.user(username,userpwd,realname,birthday) " +
            "values(#{userName},#{userPwd},#{realName},#{birthday})")
    int addUser(User user);

    @Select("select * from test0312.user")
    List<User> findAll();

    @Select("select * from test0312.user where userid=#{userId}")
    User findById(int userId);
}

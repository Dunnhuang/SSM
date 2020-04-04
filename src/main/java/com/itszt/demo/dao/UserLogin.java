package com.itszt.demo.dao;


import com.itszt.demo.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLogin {
    @Select("select * from user where username=#{username} and userpwd=#{userpwd}")
    public User login(String username, String userpwd);
}

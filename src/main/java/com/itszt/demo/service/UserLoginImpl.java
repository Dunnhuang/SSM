package com.itszt.demo.service;

import com.itszt.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserLoginImpl implements UserLogin {
    @Autowired
    private com.itszt.demo.dao.UserLogin userLogin;

    @Override
    public User Login(String username, String userpwd) {
        User user = userLogin.login(username, userpwd);


        return user;
    }
}

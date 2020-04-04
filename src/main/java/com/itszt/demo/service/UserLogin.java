package com.itszt.demo.service;

import com.itszt.demo.domain.User;
import org.springframework.stereotype.Repository;

public interface UserLogin {

    public User Login(String username,String userpwd);
}

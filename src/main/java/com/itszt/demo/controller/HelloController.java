package com.itszt.demo.controller;

import com.itszt.demo.domain.User;
import com.itszt.demo.service.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @Autowired
    private UserLogin userLogin;

    @RequestMapping("doLogin")
    public String doLogin(String username, String userpwd, Model model) {
        User user = userLogin.Login(username, userpwd);

        if (user == null) {
            model.addAttribute("result", "登陆失败");
            return "index";
        } else {
            model.addAttribute("result", "登录成功");
        }
        return "result";

    }
}

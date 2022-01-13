package com.aynu.gmall.user.controller;

import com.aynu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    //自动导包误报去掉；
    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello user";
    }
}

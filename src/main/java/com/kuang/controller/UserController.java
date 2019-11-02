package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usr")
public class UserController {

    @GetMapping("/toUserCenter")
    public String userCenter(){
        return "views/user/index";
    }

}

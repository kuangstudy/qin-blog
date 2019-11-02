package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//加的单页功能
@Controller
@RequestMapping("/say")
public class SayController {

    @GetMapping("/toSay")
    public String toSay(){
        return "views/other/say";
    }

}

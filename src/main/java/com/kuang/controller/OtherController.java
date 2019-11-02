package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//加的单页功能
@Controller
@RequestMapping("/plus")
public class OtherController {

    @GetMapping("/toAboutMe")
    public String toAboutMe(){
        return "views/other/about";
    }

    @GetMapping("/toFileDown")
    public String toFileDown(){
        return "views/other/file";
    }


}

package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/video")
public class VideoController {

    @GetMapping("/toVideoIndex")
    public String toVideoIndex(){
        return "views/video/index";
    }

    @GetMapping("/toPlay")
    public String toPlay(){
        return "views/video/play";
    }

}

package com.kuang.controller;

import com.kuang.pojo.User;
import com.kuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/usr/toUserCenter")
    public String userCenter(){
        return "views/user/index";
    }

    //用户登录
    @RequestMapping("/usr/login")
    public String login(String username, String password, Model model, HttpSession session){
        User loginUser = userService.login(username, password);

        if (loginUser==null){
            model.addAttribute("msg","用户名或密码错误！");
            return "views/system/login";
        }else {
            session.setAttribute("loginUser",loginUser);
            return "/index.html";
        }
    }



}

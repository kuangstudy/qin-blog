package com.kuang.service.impl;

import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import com.kuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String name, String password) {
        User user = userMapper.queryUserByName(name);
        if (user!=null){
            if (password.equals(user.getPwd())){
                return user;
            }
        }
        return null;
    }
}

package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    //根据用户名查询用户
    public User queryUserByName(String name);

    //查询全部用户

    //通过id查询用户

    //修改用户密码

    //修改用户的信息

    //删除用户

}

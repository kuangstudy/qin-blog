package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private String pwd;
    private int sex; //0：女    1：男
    private Date createTime;
    private int level;
    private int role;
    private String email;
    private String introduce;
    private String homepage;

}

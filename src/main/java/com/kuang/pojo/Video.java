package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video {

    private int id;
    private String title;
    private String author;
    private Date createTime;
    private int category;
    private String url;
    private String cover;

}

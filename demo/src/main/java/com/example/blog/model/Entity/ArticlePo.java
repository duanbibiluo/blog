package com.example.blog.model.Entity;

import lombok.Data;

@Data
public class ArticlePo {
    private Long id;

    private Long userId;

    private String content;

    private String title;

    private String createTime;

    private String updateTime;

    //公开 私有
    private int status;
    //删除 未删除
    private int deleted;


}

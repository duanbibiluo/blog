package com.example.blog.Entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Data
@Slf4j
public class UserPo {
    //用户id
    private Long id;
    //用户名
    private String username;
    //密码
    private String password;

    private String email;

    private String phone;

    //权限
    private int role;

    //删除 未删除
    private int deleted;

    //创建时间
    private String createTime;

    //更新时间
    private String updateTime;

    //状态 正常 禁用
    private int status;
}

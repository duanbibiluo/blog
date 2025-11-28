package com.example.blog.model.Dto;

import lombok.Data;
import org.bouncycastle.asn1.x509.UserNotice;

@Data
public class RegisterDto
{
    // 用户名
    private String username;
    //姓名
    private String password;
    //邮箱
    private String email;
    // 手机号
    private String phone;

}

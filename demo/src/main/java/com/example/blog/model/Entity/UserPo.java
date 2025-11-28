package com.example.blog.model.Entity;

import com.example.blog.model.Dto.RegisterDto;
import com.example.blog.util.PasswordUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

//import static com.example.blog.util.PasswordUtil.encryptPassword;


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

    //权限 0 为管理员 1 为用户
    private int role;

    //删除 未删除
    private int deleted;

    //创建时间
    private String createTime;

    //更新时间
    private String updateTime;

    //状态 正常 禁用
    private int status;



    public void newEntity(RegisterDto dto){
        username = dto.getUsername();
         password = PasswordUtil.encryptPassword(dto.getPassword());
//        password = dto.getPassword();
        email = dto.getEmail();
        phone = dto.getPhone();
        role = 1;
        this.deleted = 0;
        this.status = 1;
    }
}

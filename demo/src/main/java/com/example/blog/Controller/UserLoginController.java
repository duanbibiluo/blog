package com.example.blog.Controller;

import com.example.blog.Service.UserService;
import com.example.blog.model.Dto.LoginDto;

import com.example.blog.model.Dto.RegisterDto;
import com.example.blog.model.Entity.Result;
import com.example.blog.model.VO.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/blog")
@RestController
public class UserLoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/login")
    public Result<LoginVo> login(@RequestBody LoginDto dto){
        return userService.login(dto);
    }



    @PostMapping("/user/register")
    public Result<String> register(@RequestBody RegisterDto dto){
        return userService.register(dto);
    }

    @PostMapping("user/logout")
    public Result<String> logout(){
        return userService.logout();
    }
}

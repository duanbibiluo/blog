package com.example.blog.Service.Impl;

import com.example.blog.Mapper.UserMapper;
import com.example.blog.Service.UserService;
import com.example.blog.model.Dto.LoginDto;
import com.example.blog.model.Dto.RegisterDto;
import com.example.blog.model.Entity.Result;
import com.example.blog.model.Entity.UserPo;
import com.example.blog.model.VO.LoginVo;
import com.example.blog.util.JWTUtil;
import com.example.blog.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result<LoginVo> login(LoginDto dto) {
        String password = PasswordUtil.encryptPassword(dto.getPassword());
        UserPo user = userMapper.getUserByUsername(dto.getUsername(), password);
        if(user != null){
            Map<String, Object> claims = Map.of("id", user.getId(),
                    "username", user.getUsername(),
                    "role", user.getRole());
            LoginVo loginVo = new LoginVo(user.getId(), user.getUsername(), JWTUtil.generateJwt(claims));
            return Result.success(loginVo);
        }
        return Result.fail(400,"用户名或密码错误");
    }


    @Override
    public Result<String> register(RegisterDto dto) {
        UserPo user = userMapper.listByUsername(dto.getUsername());
        if(user != null)
        {
            return Result.fail(400,"用户名已存在");
        }
        UserPo userPo = new UserPo();
        userPo.newEntity(dto);
        userMapper.insert(userPo);
        return Result.success("注册成功");
    }

    @Override
    public Result<String> logout() {
        return Result.success("退出成功");
    }
}

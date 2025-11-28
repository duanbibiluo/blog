package com.example.blog.Service;

import com.example.blog.model.Dto.LoginDto;
import com.example.blog.model.Dto.RegisterDto;
import com.example.blog.model.Entity.Result;
import com.example.blog.model.VO.LoginVo;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    /**
     * 登录
     * @return 登录结果
     */
    Result<LoginVo> login(LoginDto dto);
    /**
     * 注册
     * @return 注册结果
     */
    Result<String> register(RegisterDto dto);

    /**
     * 注销
     * @return 注销结果
     */
    Result<String> logout();
}

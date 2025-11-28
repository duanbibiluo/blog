package com.example.blog.model.VO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginVo {
    private Long id; //用户

    private String username; //用户名


    private String token; //令牌

    private int role;
}
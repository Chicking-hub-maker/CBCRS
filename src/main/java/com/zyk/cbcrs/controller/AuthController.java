package com.zyk.cbcrs.controller;

import com.zyk.cbcrs.entity.DTO.LoginDTO;
import com.zyk.cbcrs.entity.DTO.RegisterDTO;
import com.zyk.cbcrs.entity.VO.UserVO;
import com.zyk.cbcrs.entity.statics.Result;
import com.zyk.cbcrs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody LoginDTO loginDTO) {
        UserVO userVO = userService.login(loginDTO);
        return Result.success("登录成功", userVO);
    }

    @PostMapping("/register")
    public Result register(@RequestBody RegisterDTO registerDTO) {
        UserVO userVO = userService.register(registerDTO);
        return Result.success("注册成功", userVO);

    }
}

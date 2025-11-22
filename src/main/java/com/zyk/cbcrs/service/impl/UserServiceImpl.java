package com.zyk.cbcrs.service.impl;

import com.zyk.cbcrs.entity.DTO.LoginDTO;
import com.zyk.cbcrs.entity.DTO.RegisterDTO;
import com.zyk.cbcrs.entity.VO.UserVO;
import com.zyk.cbcrs.entity.pojo.User;
import com.zyk.cbcrs.mapper.UserMapper;
import com.zyk.cbcrs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserVO login(LoginDTO loginDTO) {
        // 参数校验
        if (loginDTO.getUsername() == null || loginDTO.getUsername().trim().isEmpty()) {
            throw new RuntimeException("用户名不能为空");
        }
        if (loginDTO.getPassword() == null || loginDTO.getPassword().trim().isEmpty()) {
            throw new RuntimeException("密码不能为空");
        }

        // 查询用户
        User user = userMapper.findByUsername(loginDTO.getUsername());
        if (user == null) {
            throw new RuntimeException("用户不存在");
        }

        // 校验密码
        if (!user.getPassword().equals(loginDTO.getPassword())) {
            throw new RuntimeException("密码错误");
        } else {
            // 转换为VO对象返回
            return convertToUserVO(user);
        }


    }

    @Override
    public UserVO register(RegisterDTO registerDTO) {
        // 参数校验
        if (registerDTO.getUsername() == null || registerDTO.getUsername().trim().isEmpty()) {
            throw new RuntimeException("用户名不能为空");
        }
        if (registerDTO.getPassword() == null || registerDTO.getPassword().trim().isEmpty()) {
            throw new RuntimeException("密码不能为空");
        }

        // 检查用户名是否已存在
        User existingUser = userMapper.findByUsername(registerDTO.getUsername());
        if (existingUser != null) {
            throw new RuntimeException("用户名已存在");
        }

        // 创建新用户
        User newUser = new User();
        newUser.setId(UUID.randomUUID().toString());
        newUser.setUsername(registerDTO.getUsername());
        newUser.setPassword(registerDTO.getPassword());
        newUser.setName(registerDTO.getName());
        newUser.setPhone(registerDTO.getPhone());
        newUser.setRole(registerDTO.getRole());
        newUser.setCreatedTime(LocalDateTime.now());

        // 插入数据库
        int rows = userMapper.insertUser(newUser);
        if (rows <= 0) {
            throw new RuntimeException("注册失败，请重试");
        }

        // 返回新用户信息
        User createdUser = userMapper.findByUsername(registerDTO.getUsername());
        return convertToUserVO(createdUser);
    }


    private UserVO convertToUserVO(User user) {
        UserVO userVO = new UserVO();
        userVO.setId(user.getId());
        userVO.setUsername(user.getUsername());
        userVO.setName(user.getName());
        userVO.setPhone(user.getPhone());
        userVO.setRole(user.getRole());
        return userVO;
    }
}



package com.zyk.cbcrs.service;

import com.zyk.cbcrs.entity.DTO.LoginDTO;
import com.zyk.cbcrs.entity.DTO.RegisterDTO;
import com.zyk.cbcrs.entity.VO.UserVO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    /**
     * 用户登录
     * @param loginDTO
     * @return
     */
    UserVO login(LoginDTO loginDTO);


    /**
     * 用户注册
     * @param registerDTO
     * @return
     */
    UserVO register(RegisterDTO registerDTO);
}

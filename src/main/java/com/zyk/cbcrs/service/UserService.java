package com.zyk.cbcrs.service;

import com.zyk.cbcrs.entity.DTO.LoginDTO;
import com.zyk.cbcrs.entity.DTO.RegisterDTO;
import com.zyk.cbcrs.entity.VO.UserVO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserVO login(LoginDTO loginDTO);

    UserVO register(RegisterDTO registDTO);
}

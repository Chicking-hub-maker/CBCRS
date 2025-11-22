package com.zyk.cbcrs.entity.DTO;

import com.zyk.cbcrs.entity.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDTO {
    private String username;//学工号
    private String password;//密码
    private String name;
    private String phone;
    private UserRole role;//用户角色(如果是学生则通过登录界面注册，如果是管理员身份，需要在后台添加)
}

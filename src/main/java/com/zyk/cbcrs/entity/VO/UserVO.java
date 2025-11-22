package com.zyk.cbcrs.entity.VO;

import com.zyk.cbcrs.entity.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户视图对象
 * 用于展示用户信息
 * 内容包括用户名、姓名、电话和角色
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
    private String id;
    private String username;
    private String name;
    private String phone;
    private UserRole role;
}

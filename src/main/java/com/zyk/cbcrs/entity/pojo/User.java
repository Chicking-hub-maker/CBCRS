package com.zyk.cbcrs.entity.pojo;

import com.zyk.cbcrs.entity.enums.UserRole;

import java.util.Date;

public class User {
    private Integer id;
    private String username; // 学号/工号
    private String password;
    private String name;
    private String phone;
    private UserRole role;
    private Date createdTime;
}

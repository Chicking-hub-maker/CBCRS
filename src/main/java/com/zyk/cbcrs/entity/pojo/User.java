package com.zyk.cbcrs.entity.pojo;

import com.zyk.cbcrs.entity.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String username; // 学号/工号
    private String password;
    private String name;
    private String phone;
    private UserRole role;
    private LocalDateTime createdTime;
}

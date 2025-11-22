package com.zyk.cbcrs.mapper;


import com.zyk.cbcrs.entity.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User findByUsername(@Param("username") String username);

    int insertUser(User user);

    User findById(@Param("id") String id);
}

package com.zyk.cbcrs.entity.statics;

import java.util.HashMap;
import java.util.Map;

public class Result<T>{
    private Integer code;
    private String msg;
    private T data;

    private Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // ---------------------- 成功响应（无数据）----------------------
    public static Result<Void> success() {
        return new Result<>(200, "操作成功", null);
    }

    // ---------------------- 成功响应（有数据）----------------------
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "操作成功", data);
    }

    public static <T> Result<T> success(String msg, T data) {
        return new Result<>(200, msg, data);
    }

    // 失败静态方法
    public static <T> Result<T> error(Integer code, String message) {
        return new Result<>(code, message, null);
    }

    public static <T> Result<T> error(String message) {
        return new Result<>(500, message, null);
    }

}

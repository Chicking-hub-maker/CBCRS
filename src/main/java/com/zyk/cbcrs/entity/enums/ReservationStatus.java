package com.zyk.cbcrs.entity.enums;

/**
 * 标识羽毛球场地预订的状态分为四种：待审核、待使用、已完成、已取消。
 */
public enum ReservationStatus {
    PENDING("待审核"),
    CONFIRMED("待使用"),
    COMPLETED("已完成"),
    CANCELLED("已取消");

    private final String description;

    ReservationStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
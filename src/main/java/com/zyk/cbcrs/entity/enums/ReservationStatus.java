package com.zyk.cbcrs.entity.enums;

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
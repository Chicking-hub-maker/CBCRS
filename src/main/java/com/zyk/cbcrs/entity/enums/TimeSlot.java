package com.zyk.cbcrs.entity.enums;

/**
 * 标识羽毛球场地的可预订时间段
 */
public enum TimeSlot {
    MORNING_8_10("8:00-10:00"),
    MORNING_10_12("10:00-12:00"),
    AFTERNOON_13_15("13:00-15:00"),
    AFTERNOON_15_17("15:00-17:00"),
    EVENING_17_19("17:00-19:00"),
    EVENING_19_21("19:00-21:00");

    private final String timeRange;

    TimeSlot(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public String getDescription() {
        return timeRange;
    }
}

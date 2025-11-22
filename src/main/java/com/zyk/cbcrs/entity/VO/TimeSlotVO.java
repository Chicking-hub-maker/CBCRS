package com.zyk.cbcrs.entity.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeSlotVO {
    private String timeRange; // 时段，如 "09:00-10:00"
    private Boolean available; // 是否可预约

}
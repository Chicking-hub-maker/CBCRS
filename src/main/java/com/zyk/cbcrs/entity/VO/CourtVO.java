package com.zyk.cbcrs.entity.VO;

import com.zyk.cbcrs.entity.enums.CourtStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 场地视图对象
 * 用于展示场地信息，内容包括场地编号、名称、状态
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourtVO {
    private String id;
    private String courtNumber;//场地编号
    private CourtStatus courtType;
    private CourtStatus status;
    private Integer availableTimeSlots; // 剩余可预约时段数量（用于列表显示）
    private List<TimeSlotVO> timeSlots; // 详情页的时段列表


}

package com.zyk.cbcrs.entity.pojo;

import com.zyk.cbcrs.entity.enums.ReservationStatus;
import com.zyk.cbcrs.entity.enums.TimeSlot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    private String id; // UUID
    private String userId; // 预约人的ID，改为String
    private String courtId; // 改为String
    private Date reservationDate; // 预约日期（年月日）
    private TimeSlot timeSlot; // 预约时段
    private ReservationStatus status;
    private LocalDateTime createdTime;

    // 关联信息
    private User user;
    private Court court;
}

package com.zyk.cbcrs.entity.pojo;

import com.zyk.cbcrs.entity.enums.ReservationStatus;

import java.util.Date;

public class Reservation {
    private Integer id;
    private Integer userId;
    private Integer courtId;
    private Date startTime;
    private Date endTime;
    private ReservationStatus status;
    private Date createdTime;

    // 关联信息
    private User user;
    private Court court;
}

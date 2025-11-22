package com.zyk.cbcrs.entity.VO;

/**
 * 预订视图对象
 * 用于展示预订信息
 * 内容包括预订ID、用户信息、场地信息、预订时段和预约信息的状态
 */
public class ReservationVO {
    private String id;
    private UserVO user;
    private CourtVO court;
    private String timeSlot;
    private String status;


}

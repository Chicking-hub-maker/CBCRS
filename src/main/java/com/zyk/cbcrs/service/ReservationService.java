package com.zyk.cbcrs.service;

import com.zyk.cbcrs.entity.DTO.ReservationDTO;
import com.zyk.cbcrs.entity.DTO.ReservationQueryDTO;
import com.zyk.cbcrs.entity.VO.ReservationVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationService {

    /**
     * 创建预约
     * @param reservationDTO
     * @return
     */
    boolean createReservation(ReservationDTO reservationDTO);

    /**
     * 取消预约
     * @param reservationId
     * @return
     */
    boolean cancelReservation(String reservationId);

    /**
     * 获取用户的预约列表
     * @param queryDTO
     * @return
     */
    List<ReservationVO> getUserReservations(ReservationQueryDTO queryDTO);
}

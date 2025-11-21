package com.zyk.cbcrs.service;

import com.zyk.cbcrs.entity.DTO.ReservationDTO;
import com.zyk.cbcrs.entity.DTO.ReservationQueryDTO;
import com.zyk.cbcrs.entity.VO.ReservationVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationService {
    ReservationVO createReservation(ReservationDTO reservationDTO);
    boolean cancelReservation(Long id);
    List<ReservationVO> getReservations(ReservationQueryDTO queryDTO);
    ReservationVO getReservationById(Long id);
}

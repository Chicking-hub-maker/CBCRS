//package com.zyk.cbcrs.service.impl;
//
//import com.zyk.cbcrs.entity.DTO.ReservationDTO;
//import com.zyk.cbcrs.entity.pojo.Reservation;
//import com.zyk.cbcrs.entity.enums.ReservationStatus;
//import com.zyk.cbcrs.mapper.ReservationMapper;
//import com.zyk.cbcrs.service.ReservationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.time.LocalDate;
//import java.util.List;
//import java.util.UUID;
//
//@Service
//public class ReservationServiceImpl implements ReservationService {
//
//    @Autowired
//    private ReservationMapper reservationMapper;
//
//    @Override
//    public Reservation createReservation(ReservationDTO reservationDTO) {
//        reservationDTO.setId(UUID.randomUUID().toString());
//        reservation.setCreatedTime(java.time.LocalDateTime.now());
//        reservation.setStatus(ReservationStatus.PENDING);
//
//        int result = reservationMapper.insertReservation(reservation);
//        if (result > 0) {
//            return reservationMapper.selectReservationById(reservation.getId());
//        }
//        return null;
//    }
//
//    @Override
//    public List<Reservation> getReservationsByUserId(String userId) {
//        return reservationMapper.selectReservationsByUserId(userId);
//    }
//
//    @Override
//    public List<Reservation> getReservationsByCourtAndDate(String courtId, LocalDate date) {
//        return reservationMapper.selectReservationsByCourtAndDate(courtId, date);
//    }
//
//    @Override
//    @Transactional
//    public boolean updateReservationStatus(String reservationId, ReservationStatus status) {
//        Reservation reservation = new Reservation();
//        reservation.setId(reservationId);
//        reservation.setStatus(status);
//        return reservationMapper.updateReservationStatus(reservation) > 0;
//    }
//
//    @Override
//    @Transactional
//    public boolean cancelReservation(String reservationId) {
//        return updateReservationStatus(reservationId, ReservationStatus.CANCELLED);
//    }
//}
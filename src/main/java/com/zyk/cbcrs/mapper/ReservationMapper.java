package com.zyk.cbcrs.mapper;

import com.zyk.cbcrs.entity.pojo.Reservation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface ReservationMapper {

    int insertReservation(Reservation reservation);

    Reservation selectReservationById(String id);

    List<Reservation> selectReservationsByUserId(String userId);

    List<Reservation> selectReservationsByCourtAndDate(@Param("courtId") String courtId, @Param("date") LocalDate date);

    int updateReservationStatus(Reservation reservation);



    // 检查时段是否已被预约
    int checkTimeSlotConflict(@Param("courtId") String courtId,
                              @Param("date") LocalDate date,
                              @Param("timeSlot") String timeSlot);
}
//package com.zyk.cbcrs.controller;
//
//
//import com.zyk.cbcrs.entity.DTO.ReservationDTO;
//import com.zyk.cbcrs.entity.DTO.ReservationQueryDTO;
//import com.zyk.cbcrs.entity.VO.ReservationVO;
//import com.zyk.cbcrs.entity.statics.Result;
//import com.zyk.cbcrs.service.ReservationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/reservation")
//public class ReservationController {
//
//    @Autowired
//    private ReservationService reservationService;
//
//    @PostMapping("/create")
//    public Result<ReservationVO> createReservation(@RequestBody ReservationDTO reservationDTO) {
//        ReservationVO reservation = reservationService.createReservation(reservationDTO);
//        return Result.success("预约成功", reservation);
//    }
//
//    @PostMapping("/cancel/{id}")
//    public Result<Boolean> cancelReservation(@PathVariable Long id) {
//        boolean result = reservationService.cancelReservation(id);
//        return result ? Result.success("取消成功", true)
//                : Result.error("取消失败");
//    }
//
//    @PostMapping("/list")
//    public Result<List<ReservationVO>> getReservations(@RequestBody ReservationQueryDTO queryDTO) {
//        List<ReservationVO> reservations = reservationService.getReservations(queryDTO);
//        return Result.success(reservations);
//    }
//
//    @GetMapping("/{id}")
//    public Result<ReservationVO> getReservationById(@PathVariable Long id) {
//        ReservationVO reservation = reservationService.getReservationById(id);
//        return Result.success(reservation);
//    }
//}

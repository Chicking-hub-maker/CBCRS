package com.zyk.cbcrs.controller;


import com.zyk.cbcrs.entity.DTO.CourtQueryDTO;
import com.zyk.cbcrs.entity.DTO.CourtStatusDTO;
import com.zyk.cbcrs.entity.VO.CourtVO;
import com.zyk.cbcrs.entity.statics.Result;
import com.zyk.cbcrs.service.CourtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/court")
public class CourtController {

    @Autowired
    private CourtService courtService;

    /**
     * 获取所有场地信息(管理员查看)
     * @return
     */
    @GetMapping("/all")
    public Result getAllCourts() {
        List<CourtVO> courts = courtService.getAllCourts();
        return Result.success(courts);
    }

    /**
     * 获取可用场地信息(用户查看)
     * @param queryDTO
     * @return
     */
    @PostMapping("/available")
    public Result<List<CourtVO>> getAvailableCourts(@RequestBody CourtQueryDTO queryDTO) {
        List<CourtVO> availableCourts = courtService.getAvailableCourts(queryDTO);
        return Result.success(availableCourts);
    }

    /**
     * 更改场地状态(管理员操作)
     * @param statusDTO
     * @return
     */
    @PostMapping("/changeStatus")
    public Result<Boolean> changeCourtStatus(@RequestBody CourtStatusDTO statusDTO) {
        boolean result = courtService.changeCourtStatus(statusDTO);
        return result ? Result.success("状态更新成功", true)
                : Result.error("状态更新失败");
    }

    /**
     * 获取某个场地详情（显示具体可预约的时段）
     * @param courtId
     * @return
     */
    @GetMapping("/detail/{courtId}")
    public Result<CourtVO> getCourtDetail(@PathVariable String courtId, @RequestParam LocalDate date) {
        CourtVO courtVO = courtService.getCourtDetail(courtId, date);
        return Result.success(courtVO);
    }
}

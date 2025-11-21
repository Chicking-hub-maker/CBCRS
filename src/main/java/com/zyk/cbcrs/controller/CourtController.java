package com.zyk.cbcrs.controller;


import com.zyk.cbcrs.entity.DTO.CourtStatusDTO;
import com.zyk.cbcrs.entity.VO.CourtVO;
import com.zyk.cbcrs.entity.statics.Result;
import com.zyk.cbcrs.service.CourtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/court")
public class CourtController {

    @Autowired
    private CourtService courtService;

    @GetMapping("/all")
    public Result getAllCourts() {
        List<CourtVO> courts = courtService.getAllCourts();
        return Result.success(courts);
    }

    @PostMapping("/available")
    public Result<List<CourtVO>> getAvailableCourts( ) {


    }

    @PostMapping("/changeStatus") // 改为POST，因为需要请求体
    public Result<Boolean> changeCourtStatus(@RequestBody CourtStatusDTO statusDTO) {
        boolean result = courtService.changeCourtStatus(statusDTO);
        return result ? Result.success("状态更新成功", true)
                : Result.error("状态更新失败");
    }
}

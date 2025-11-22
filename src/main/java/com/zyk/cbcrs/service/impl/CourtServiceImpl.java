// CourtServiceImpl.java - 实现类
package com.zyk.cbcrs.service.impl;

import com.zyk.cbcrs.entity.DTO.CourtQueryDTO;
import com.zyk.cbcrs.entity.DTO.CourtStatusDTO;
import com.zyk.cbcrs.entity.VO.CourtVO;
import com.zyk.cbcrs.entity.VO.TimeSlotVO;
import com.zyk.cbcrs.mapper.CourtMapper;
import com.zyk.cbcrs.service.CourtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CourtServiceImpl implements CourtService {

    @Autowired
    private CourtMapper courtMapper;

    @Override
    public List<CourtVO> getAllCourts() {
        return courtMapper.selectAllCourts();
    }

    @Override
    public List<CourtVO> getAvailableCourts(CourtQueryDTO queryDTO) {
        // 获取场地列表，并计算每个场地的剩余可预约时段
        List<CourtVO> courts = courtMapper.selectAvailableCourts(queryDTO);
        for (CourtVO court : courts) {
            Integer availableCount = getAvailableTimeSlotsCount(court.getId(), queryDTO.getDate());
            court.setAvailableTimeSlots(availableCount);
        }
        return courts;
    }

    @Override
    public CourtVO getCourtDetail(String courtId, LocalDate date) {
        // 获取场地基本信息
        CourtVO court = courtMapper.selectCourtById(courtId);
        if (court != null) {
            // 获取该场地的详细时段信息
            List<TimeSlotVO> timeSlots = courtMapper.selectTimeSlotsByCourtId(courtId, date);
            court.setTimeSlots(timeSlots);
        }
        return court;
    }

    @Override
    public Integer getAvailableTimeSlotsCount(String courtId, LocalDate date) {
        return courtMapper.countAvailableTimeSlots(courtId, date);
    }

    @Override
    public boolean changeCourtStatus(CourtStatusDTO statusDTO) {
        return courtMapper.updateCourtStatus(statusDTO) > 0;
    }
}
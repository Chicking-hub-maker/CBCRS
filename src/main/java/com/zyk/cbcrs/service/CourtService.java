package com.zyk.cbcrs.service;

import com.zyk.cbcrs.entity.DTO.CourtQueryDTO;
import com.zyk.cbcrs.entity.DTO.CourtStatusDTO;
import org.springframework.stereotype.Service;
import com.zyk.cbcrs.entity.VO.CourtVO;

import java.time.LocalDate;
import java.util.List;

@Service
public interface CourtService {

    /**
     * 获取所有场地信息(管理员查看)
     * @return
     */
    List<CourtVO> getAllCourts();

    /**
     * 获取可用场地信息(用户查看)
     * @param queryDTO
     * @return
     */
    List<CourtVO> getAvailableCourts(CourtQueryDTO queryDTO);

    /**
     * 更改场地状态(管理员操作)
     * @param statusDTO
     * @return
     */
    boolean changeCourtStatus(CourtStatusDTO statusDTO);

    /**
     * 获取某个场地详情（显示具体可预约的时段）
     * @param
     * @return
     */
    CourtVO getCourtDetail(String courtId, LocalDate date);

    /**
     * 获取可预约时段数量
     * @param courtId
     * @param date
     * @return
     */
    Integer getAvailableTimeSlotsCount(String courtId, LocalDate date); // 获取可预约时段数量
}

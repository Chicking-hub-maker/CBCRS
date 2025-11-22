// CourtMapper.java
package com.zyk.cbcrs.mapper;

import com.zyk.cbcrs.entity.DTO.CourtQueryDTO;
import com.zyk.cbcrs.entity.DTO.CourtStatusDTO;
import com.zyk.cbcrs.entity.VO.CourtVO;
import com.zyk.cbcrs.entity.VO.TimeSlotVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface CourtMapper {

    // 查询所有场地（管理员用）
    List<CourtVO> selectAllCourts();

    // 查询可用场地（用户用）
    List<CourtVO> selectAvailableCourts(CourtQueryDTO queryDTO);

    // 根据ID查询场地
    CourtVO selectCourtById(@Param("courtId") String courtId);

    // 查询场地的时段信息
    List<TimeSlotVO> selectTimeSlotsByCourtId(@Param("courtId") String courtId, @Param("date") LocalDate date);

    // 根据日期查询场地详情
    CourtVO selectCourtByIdAndDate(@Param("courtId") String courtId, @Param("date") LocalDate date);

    // 统计可用时段数量
    Integer countAvailableTimeSlots(@Param("courtId") String courtId, @Param("date") LocalDate date);

    // 更新场地状态
    int updateCourtStatus(CourtStatusDTO statusDTO);
}
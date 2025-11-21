package com.zyk.cbcrs.service;

import com.zyk.cbcrs.entity.DTO.CourtStatusDTO;
import org.springframework.stereotype.Service;
import com.zyk.cbcrs.entity.VO.CourtVO;

import java.util.List;

@Service
public interface CourtService {

    List<CourtVO> getAllCourts();
    List<CourtVO> getAvailableCourts();
    boolean changeCourtStatus(CourtStatusDTO statusDTO);
}

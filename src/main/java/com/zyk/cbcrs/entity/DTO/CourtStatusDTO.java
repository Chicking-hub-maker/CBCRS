package com.zyk.cbcrs.entity.DTO;

import com.zyk.cbcrs.entity.enums.CourtStatus;
import lombok.Data;

@Data
public class CourtStatusDTO {
    private String courtId;
    private CourtStatus status; // 目标状态

}

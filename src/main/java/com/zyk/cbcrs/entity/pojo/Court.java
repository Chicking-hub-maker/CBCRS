package com.zyk.cbcrs.entity.pojo;

import com.zyk.cbcrs.entity.enums.CourtStatus;
import com.zyk.cbcrs.entity.enums.CourtType;

public class Court {
    private Integer id;
    private String courtNumber;
    private CourtType courtType;
    private CourtStatus status;
    private String description;
}

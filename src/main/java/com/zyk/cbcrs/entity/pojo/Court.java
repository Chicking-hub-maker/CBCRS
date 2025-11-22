package com.zyk.cbcrs.entity.pojo;

import com.zyk.cbcrs.entity.enums.CourtStatus;
import com.zyk.cbcrs.entity.enums.CourtType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Court {
    private String id;//场地ID
    private String courtNumber;//场地编号
    private CourtType courtType;
    private CourtStatus status;

}

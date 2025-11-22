package com.zyk.cbcrs.entity.DTO;

import com.zyk.cbcrs.entity.enums.CourtType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourtQueryDTO {
    private String id;
    private LocalDate date;
    private CourtType courtType;
}

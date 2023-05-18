package com.example.kursach.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventRsDto {
    private Long Id;
    private String theme;
    private EmployeeRsDto responsible;

}

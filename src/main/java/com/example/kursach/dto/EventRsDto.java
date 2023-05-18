package com.example.kursach.dto;

import com.example.kursach.model.Employee;
import lombok.*;

import java.util.List;

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

package com.example.kursach.dto;


import com.example.kursach.model.Event;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRsDto {
    private Long Id;
    private String name;
    private String secondName;
    private String position;
    private Double salary;
    private EventRsDto event;
}

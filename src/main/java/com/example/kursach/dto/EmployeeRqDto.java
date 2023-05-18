package com.example.kursach.dto;

import com.example.kursach.model.Event;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRqDto {
    private String name;
    private String secondName;
    private String position;
    private Double salary;
    private EventRqDto event;
}

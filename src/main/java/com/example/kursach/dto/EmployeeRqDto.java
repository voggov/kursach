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
    private String country;
    private Integer age;
    private EventRqDto event;
}

package com.example.kursach.dto;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventRqDto {
    private String theme;
    private EmployeeRqDto responsible;
}

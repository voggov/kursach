package com.example.kursach.dto;


import com.example.kursach.model.Employee;
import lombok.*;

import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventRqDto {
    private String theme;
    private EmployeeRqDto responsible;
}

package com.example.kursach.mapper;

import com.example.kursach.dto.EmployeeRqDto;
import com.example.kursach.dto.EmployeeRsDto;
import com.example.kursach.model.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public EmployeeRsDto mapToDto(Employee employee) {
        return modelMapper.map(employee, EmployeeRsDto.class);
    }
    public Employee mapToEmployee(EmployeeRqDto rqDto) {
        return modelMapper.map(rqDto, Employee.class);
    }
}

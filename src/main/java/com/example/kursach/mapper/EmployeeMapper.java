package com.example.kursach.mapper;

import com.example.kursach.dto.EmployeeRqDto;
import com.example.kursach.dto.EmployeeRsDto;
import com.example.kursach.model.Animal;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public EmployeeRsDto mapToDto(Animal animal) {
        return modelMapper.map(animal, EmployeeRsDto.class);
    }
    public Animal mapToEmployee(EmployeeRqDto rqDto) {
        return modelMapper.map(rqDto, Animal.class);
    }
}

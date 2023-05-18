package com.example.kursach.service;

import com.example.kursach.dto.EmployeeRqDto;
import com.example.kursach.dto.EmployeeRsDto;
import com.example.kursach.mapper.EmployeeMapper;
import com.example.kursach.model.Animal;
import com.example.kursach.model.Event;
import com.example.kursach.repository.EmployeeRepository;
import com.example.kursach.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;
    @Autowired
    private final EventRepository eventRepository;
    @Autowired
    private final EmployeeMapper mapper;

    public EmployeeService(EmployeeRepository employeeRepository, EventRepository eventRepository, EmployeeMapper mapper) {
        this.employeeRepository = employeeRepository;
        this.eventRepository = eventRepository;
        this.mapper = mapper;
    }


    public EmployeeRsDto addEmployee(EmployeeRqDto employeeRqDto) {

        Animal newAnimal = Animal.builder()
                .name(employeeRqDto.getName())
                .age(employeeRqDto.getAge())
                .country(employeeRqDto.getCountry())
                .build();
        Event newEvent = Event.builder()
                .theme(employeeRqDto.getEvent().getTheme())
                .build();
        newAnimal.setEvent(newEvent);
        employeeRepository.save(newAnimal);
        return mapper.mapToDto(newAnimal);
    }

    public List<EmployeeRsDto> getEmployees() {
        return employeeRepository.findAll().stream().map(x -> mapper.mapToDto(x)).collect(Collectors.toList());
    }

    public EmployeeRsDto getById(Long id) {
        if (employeeRepository.findById(id).isPresent()) {
            return mapper.mapToDto(employeeRepository.findById(id).get());
        } else {
            throw new NullPointerException("Someone wrong!(");
        }
    }
}

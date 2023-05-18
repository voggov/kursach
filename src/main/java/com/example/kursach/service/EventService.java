package com.example.kursach.service;

import com.example.kursach.dto.EventRqDto;
import com.example.kursach.dto.EventRsDto;
import com.example.kursach.mapper.EventMapper;
import com.example.kursach.model.Event;
import com.example.kursach.repository.EmployeeRepository;
import com.example.kursach.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventService {

    @Autowired
    private final EmployeeRepository employeeRepository;
    @Autowired
    private final EventRepository eventRepository;
    @Autowired
    private final EventMapper mapper;

    public EventService(EmployeeRepository employeeRepository, EventRepository eventRepository, EventMapper mapper) {
        this.employeeRepository = employeeRepository;
        this.eventRepository = eventRepository;
        this.mapper = mapper;
    }

    public EventRsDto addEvent(EventRqDto  dto, Long id) {
        Event newEvent = Event.builder()
                .theme(dto.getTheme())
                .responsible(employeeRepository.getById(id))
                .build();
        eventRepository.save(newEvent);
        return mapper.mapToDto(newEvent);
    }

    public List<EventRsDto> getAllEvents(){
        return eventRepository.findAll().stream().map(x->mapper.mapToDto(x)).collect(Collectors.toList());
    }
}

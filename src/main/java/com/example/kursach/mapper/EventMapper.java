package com.example.kursach.mapper;

import com.example.kursach.dto.EventRqDto;
import com.example.kursach.dto.EventRsDto;
import com.example.kursach.model.Event;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public EventRsDto mapToDto(Event event) {
        return modelMapper.map(event, EventRsDto.class);
    }
    public Event mapToEvent(EventRqDto rqDto) {
        return modelMapper.map(rqDto, Event.class);
    }
}

package com.example.kursach.controller;


import com.example.kursach.dto.EventRqDto;
import com.example.kursach.dto.EventRsDto;
import com.example.kursach.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("/add/{id}")
    public EventRsDto addEvent(@RequestBody EventRqDto dto, @PathVariable Long id) {
        return eventService.addEvent(dto, id);
    }

    @GetMapping()
    public List<EventRsDto> getAll() {
        return eventService.getAllEvents();
    }
}

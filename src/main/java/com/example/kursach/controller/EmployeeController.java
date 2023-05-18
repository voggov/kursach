package com.example.kursach.controller;

import com.example.kursach.dto.EmployeeRqDto;
import com.example.kursach.dto.EmployeeRsDto;
import com.example.kursach.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class EmployeeController {
    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public EmployeeRsDto addEmployee(@RequestBody EmployeeRqDto rqDto) {
        return employeeService.addEmployee(rqDto);
    }

    @GetMapping("/all")
    public List<EmployeeRsDto> getAll(){
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeRsDto getById(@PathVariable Long id) {
        return employeeService.getById(id);
    }

}

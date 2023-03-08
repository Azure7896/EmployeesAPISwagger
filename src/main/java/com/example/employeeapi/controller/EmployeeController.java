package com.example.employeeapi.controller;


import com.example.employeeapi.dto.EmployeeDto;
import com.example.employeeapi.model.Employee;
import com.example.employeeapi.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employees")
    public String getAllEmployees() {
        return "test";
    }

    @PostMapping("/employees")
    public String addEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "User saved";
    }

}

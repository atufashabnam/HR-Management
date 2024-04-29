package com.hrms.HRManagement.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.HRManagement.model.Employee;
import com.hrms.HRManagement.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "*")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

     @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
       return new ResponseEntity<>(service.findAllEmployees(), HttpStatus.OK);
    }
}

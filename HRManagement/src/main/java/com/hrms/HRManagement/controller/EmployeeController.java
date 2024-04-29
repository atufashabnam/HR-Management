package com.hrms.HRManagement.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable String employeeId) {
        Employee employee = service.findEmployeeById(Long.valueOf(employeeId)).orElse(null);
        if(employee == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(employee);
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employeeRequest) {
        Employee saveEmployee = service.saveEmployee(employeeRequest);
        URI location  = URI.create("/api/employees/" + saveEmployee.getId());
        return ResponseEntity.created(location).body(saveEmployee);
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long employeeId) {
        service.deleteEmployee(employeeId);
        return ResponseEntity.noContent().build();
    }
}


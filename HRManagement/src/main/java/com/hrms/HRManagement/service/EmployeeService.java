package com.hrms.HRManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hrms.HRManagement.model.Employee;
import com.hrms.HRManagement.repository.EmployeeRepo;

@Service
public class EmployeeService {

    private final EmployeeRepo repository;

    
    public EmployeeService(EmployeeRepo repository) {
        this.repository = repository;
    }


    public List<Employee> findAllEmployees() {
        return repository.findAllEmployees();
    }
}

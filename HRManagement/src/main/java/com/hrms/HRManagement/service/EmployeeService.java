package com.hrms.HRManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import com.hrms.HRManagement.model.Employee;
import com.hrms.HRManagement.repository.EmployeeRepositoryJPA;

@Service
public class EmployeeService {

    private final EmployeeRepositoryJPA repo;
    
    public EmployeeService(EmployeeRepositoryJPA repo) {
        this.repo = repo;
    }


    public List<Employee> findAllEmployees() {
        return Streamable.of(repo.findAll()).toList();
    }

    public Optional<Employee> findEmployeeById(Long employeeId) {
        return repo.findById(employeeId);
    }

}

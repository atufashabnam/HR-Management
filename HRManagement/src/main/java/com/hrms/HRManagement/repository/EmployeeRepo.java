package com.hrms.HRManagement.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;
import com.hrms.HRManagement.model.Employee;

@Repository
public class EmployeeRepo {
    private final EmployeeRepositoryJPA repository;

    @Autowired
    public EmployeeRepo(EmployeeRepositoryJPA repository) {
        this.repository = repository;
    }

    public List<Employee> findAllEmployees() {
        return Streamable.of(repository.findAll()).toList();
    }
}

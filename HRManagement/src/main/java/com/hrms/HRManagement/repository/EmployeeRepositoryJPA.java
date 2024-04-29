package com.hrms.HRManagement.repository;

import com.hrms.HRManagement.model.Employee;
import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepositoryJPA extends CrudRepository<Employee, Long> {
    
}

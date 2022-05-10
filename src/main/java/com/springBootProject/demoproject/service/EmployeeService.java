package com.springBootProject.demoproject.service;

import com.springBootProject.demoproject.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
 void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);


}


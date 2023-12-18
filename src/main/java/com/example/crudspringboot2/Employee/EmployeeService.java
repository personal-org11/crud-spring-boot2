package com.example.crudspringboot2.Employee;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
        Employee saveEmployee(Employee employee);
        List<Employee> getEmployees();
        Optional<Employee> getEmployeeById(long id);
        Employee updateEmployee(Employee updatedEmployee);
        void deleteEmployee(long id);
}

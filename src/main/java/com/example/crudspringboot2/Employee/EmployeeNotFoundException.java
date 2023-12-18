package com.example.crudspringboot2.Employee;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String exception) {
        super(exception);
    }
}

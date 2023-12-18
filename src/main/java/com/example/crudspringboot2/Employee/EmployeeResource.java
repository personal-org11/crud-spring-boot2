package com.example.crudspringboot2.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeResource {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (!employee.isPresent())
            throw new EmployeeNotFoundException("Employee data not found for id=" + id);
        return employee.get();
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable long id) {
        employeeRepository.deleteById(id);
    }

    @PostMapping("/employees")
    public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
        Employee saveEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee, @PathVariable long id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if (!employeeOptional.isPresent())
            return ResponseEntity.notFound().build();
        employee.setId(id);
        employeeRepository.save(employee);
        return ResponseEntity.ok()
                .build();
    }
}

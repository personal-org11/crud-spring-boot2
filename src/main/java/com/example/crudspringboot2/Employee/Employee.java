package com.example.crudspringboot2.Employee;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String city;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Employee() {
        super();
    }
}

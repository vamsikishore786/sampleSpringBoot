package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findByName(String name);

    void save(Employee employee);

    void delete(Employee employee);
}

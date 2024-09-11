package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return employeeService.findAll();
    }

    @GetMapping("/getEmployee")
    public Employee getEmployeeByName(@RequestParam("name") String name){
        return employeeService.findByName(name);
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        employeeService.save(employee);
        return "saved " + employee.getName() + " successfully";
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){
        employeeService.save(employee);
        return "updated " + employee.getName() + " successfully";
    }

    @DeleteMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("name") String name){
        Employee employee = employeeService.findByName(name);
        employeeService.delete(employee);
        return "deleted " + employee.getName() + " successfully";
    }
}

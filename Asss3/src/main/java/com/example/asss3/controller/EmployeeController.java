package com.example.asss3.controller;

import com.example.asss3.employee.Employee;
import com.example.asss3.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public String createEmployee(@RequestBody Employee employee) {
        try {
            return employeeService.create(employee);
        } catch (Exception e){
            System.out.println(e.getMessage());
            return "error";
        }
    }

    @GetMapping
    public List<Employee> findAllEmployees() {
        try {
            return employeeService.findAll();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return findAllEmployees();
    }
}

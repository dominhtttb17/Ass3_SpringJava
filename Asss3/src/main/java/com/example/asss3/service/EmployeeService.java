package com.example.asss3.service;

import com.example.asss3.employee.Employee;
import com.example.asss3.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public String create(Employee employee) {
        try {
            employeeRepository.save(employee);
            return "success";
        } catch (Exception e){
            System.out.println(e.getMessage());
            return "error";
        }
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
}

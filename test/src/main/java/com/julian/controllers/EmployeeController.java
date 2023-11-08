package com.julian.controllers;

import com.julian.models.entities.Employee;
import com.julian.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("{Id}")
    public Employee getById(@PathVariable String Id){
        return employeeService.getById(Id);
    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping
    public Employee saveEmployee(Employee employee){
        return employeeService.addEmployee(employee);
    }

}

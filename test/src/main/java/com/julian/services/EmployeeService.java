package com.julian.services;

import com.julian.models.entities.Employee;
import com.julian.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee (Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee getById (String Id){
        return employeeRepository.findById(Id).get();
    }
    public List<Employee> getAllEmployee(){
        return  employeeRepository.findAll();
    }
}

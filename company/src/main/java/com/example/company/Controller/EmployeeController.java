package com.example.company.Controller;
import com.example.company.Entity.Employee;
import com.example.company.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController

public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }
    @GetMapping("/employees")
    public List<Employee> getEmployee(){
        return service.getEmployees();
    }


}

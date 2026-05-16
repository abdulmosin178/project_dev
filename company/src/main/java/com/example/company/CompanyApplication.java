package com.example.company;

import com.example.company.Entity.Employee;
import com.example.company.Repository.EmployeeRepository;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompanyApplication {

	@Autowired
	private EmployeeRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(CompanyApplication.class, args);
	}

	@PostConstruct
	public void addEmployee(){

		Employee emp = new Employee();

		emp.setName("Mosin");

		emp.setDepartment("IT");

		emp.setSalary(50000);

		repository.save(emp);

		System.out.println("Employee Saved");
	}
}
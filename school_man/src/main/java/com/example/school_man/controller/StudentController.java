package com.example.school_man.controller;

import com.example.school_man.Entity.Student;
import com.example.school_man.Service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    // POST API
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {

        return service.saveStudent(student);
    }

    // GET API
    @GetMapping("/students")
    public List<Student> getStudents() {

        return service.getStudents();
    }
}
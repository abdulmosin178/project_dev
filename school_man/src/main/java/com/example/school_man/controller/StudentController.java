package com.example.school_man.controller;
import com.example.school_man.Entity.Student;
import com.example.school_man.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController

public class StudentController {
    @Autowired   //this line refers sb automatically create object
    private StudentRepository repository;
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return repository.save(student);//equal to insert into student
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        return repository.findAll(); //select * from all
    }
}

package com.example.school_man.Service;
import com.example.school_man.Entity.Student;
import com.example.school_man.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired //it creates object for sb
    private StudentRepository repository;

    public Student saveStudent(Student student){
        return repository.save(student);

    }
    public List<Student> getStudents(){
        return repository.findAll();
    }

}

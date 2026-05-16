package com.example.school_man.repository;

import com.example.school_man.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository
    extends JpaRepository<Student, Long>{
}

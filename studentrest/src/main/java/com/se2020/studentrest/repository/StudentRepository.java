package com.se2020.studentrest.repository;

import com.se2020.studentrest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {   
    
}

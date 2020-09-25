package com.se2020.studentrest.repository;

import com.se2020.studentrest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {   
    // @Query("SELECT s FROM Student s WHERE s.email = :email AND s.password = :pass")
    // ?1 first param
    List<Student> findByEmailAndPassword(@Param("email") String email, @Param("pass") String password);

}

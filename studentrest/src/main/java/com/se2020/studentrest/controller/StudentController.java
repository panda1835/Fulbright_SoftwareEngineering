
package com.se2020.studentrest.controller;

import java.util.List;

import com.se2020.studentrest.entity.Student;
import com.se2020.studentrest.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Annoation is something that tells the compiler to do exrta work
@RestController // this annotation tells the compiler that this is a controller
public class StudentController{

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/student/{id}") // tell the controller you are serving get method, 
    // matching the pattern and doing he logic
    // @PathVariable: map {id} to String studentID

    public Student getStudent(@PathVariable(name = "id") Long studentId){ 
        return studentRepository.findById(studentId).get();
    }

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
    
    @PostMapping("/student")
    public String saveStudent(@RequestBody Student student){
        studentRepository.save(student);

        return "Success";
    }

    @DeleteMapping("/student/{id}")
    void delete(@PathVariable Long id){

    }

    @PutMapping("/student/{id}")
    Student updatStudent(@RequestBody Student student, @PathVariable Long id){

        return null;
    }

}
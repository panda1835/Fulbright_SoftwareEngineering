
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

    public Student getStudent(@PathVariable(name = "id") Long id){ 
        return studentRepository.findById(id).get();
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
    public String delete(@PathVariable Long id){
        // String name = studentRepository.findById(id).get().getName();
        studentRepository.deleteById(id);
        return "Success";
    }

    @PutMapping("/student/{id}")
    public String updateStudent(@RequestBody Student student, @PathVariable Long id){
        Student updateStudent = studentRepository.getOne(id);
        updateStudent.setName(student.getName());
        updateStudent.setRole(student.getRole());
        studentRepository.save(updateStudent);
        return "Success";
    }

}
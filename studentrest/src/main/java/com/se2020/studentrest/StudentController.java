
package com.se2020.studentrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Annoation is something that tells the compiler to do exrta work
@RestController // this annotation tells the compiler that this is a controller
public class StudentController{
    @GetMapping("/student/{id}") // tell the controller you are serving get method, 
    // matching the pattern and doing he logic
    // @PathVariable: map {id} to String studentID

    public String getStudent(@PathVariable(name = "id") String studentID){ 
        return "Student " + studentID;
    }
}
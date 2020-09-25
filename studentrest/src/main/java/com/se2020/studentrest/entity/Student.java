package com.se2020.studentrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

import javax.persistence.GeneratedValue;

@Entity
@Data
public class Student {
    @Id //use field Id for Id table
    @GeneratedValue

    private long id;
    private String name;
    private String role;
    private String password;
    private String email;
    private Integer age;

    public Student(){}

    Student(String name, String role){
        this.name = name;
        this.role = role;
    }

    // public void setID(long id){
    //     this.id = id;
    // }
    // public void setName(String name){
    //     this.name = name;
    // }
    // public void setRole(String role){
    //     this.role = role;
    // }

    // public long getID(){
    //     return this.id;
    // }

    // public String getRole(){
    //     return this.role;
    // }

    // public String getName(){
    //     return this.name;
    // }

    // public void setAge(int age){
    //     this.age = age;
    // }
    // public void setEmail(String email){
    //     this.email = email;
    // }
    // public void setPassword(String password){
    //     this.password = password;
    // }

    // public int getAge(){
    //     return this.age;
    // }

    // public String getPassword(){
    //     return this.password;
    // }

    // public String getEmail(){
    //     return this.email;
    // }
}

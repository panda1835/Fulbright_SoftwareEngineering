package com.se2020.studentrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Student {
    @Id //use field Id for Id table
    @GeneratedValue

    private long id;
    private String name;
    private String role;

    Student(){}

    Student(String name, String role){
        this.name = name;
        this.role = role;
    }

    public void setID(long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRole(String role){
        this.role = role;
    }

    public long getID(){
        return this.id;
    }

    public String getRole(){
        return this.role;
    }

    public String getName(){
        return this.name;
    }
}

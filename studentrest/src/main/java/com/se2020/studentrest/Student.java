package com.se2020.studentrest;

public class Student {
    private long id;
    private String name;
    private String role;

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

}

package com.project.sms;

public class Student {
    private int id;
    private String name;
    private String rollNumber;
    private String course;

    public Student() {}
    
    // Constructor for creating a new student (ID is auto-generated in DB)
    public Student(String name, String rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Constructor for retrieving a student from the database
    public Student(int id, String name, String rollNumber, String course) {
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    
    
    public int getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Roll No: " + rollNumber + ", Course: " + course;
    }
}

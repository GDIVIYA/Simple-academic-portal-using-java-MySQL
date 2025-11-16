package com.project.sms;

public class Student {
    private int id;
    private String name;
    private String rollNumber;
    private String course;

    // Default Constructor
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

    // --- Getters and Setters ---
    // (You must include all getters and setters here)
    
    // Example Getter
    public int getId() {
        return id;
    }
    
    // Example Setter
    public void setName(String name) {
        this.name = name;
    }

    // Simple toString for easy printing
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Roll No: " + rollNumber + ", Course: " + course;
    }
}
package com.example.student_management.model;

public class Student {

    private String first;
    private String last;
    private String course;
    private int yearLevel;
    private int age;
    private int studentID;
    private boolean status;

    Student(String first, String last, String course, int age, int yearLevel, int studentID, boolean status){
        this.first = first;
        this.last = last;
        this.course = course;
        this.age = age;
        this.yearLevel = yearLevel;
        this.studentID = studentID;
        this.status = status;
    }
    //getters
    public int getStudentID(){
        return this.studentID;
    }
    public String getFirst(){return this.first;}
    public String getLast(){return this.last;}
    public String getCourse(){return this.course;}
    public int getAge(){return this.age;}
    public int getYearLevel(){return this.yearLevel;}
    public boolean getStatus(){return this.status;}

}

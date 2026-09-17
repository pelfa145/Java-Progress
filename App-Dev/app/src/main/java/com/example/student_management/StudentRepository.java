package com.example.student_management;

import java.util.ArrayList;
import android.database.sqlite.*;

public class StudentRepository{
    private static ArrayList<Student> students = new ArrayList<>();

    public static ArrayList<Student> getStudents(){return students;}


}

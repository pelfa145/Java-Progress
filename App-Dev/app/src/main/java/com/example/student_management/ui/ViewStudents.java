package com.example.student_management.ui;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student_management.R;
import com.example.student_management.adapter.StudentAdapter;
import com.example.student_management.data.StudentRepository;
import com.example.student_management.model.Student;

import java.util.ArrayList;

public class ViewStudents extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_students);

        RecyclerView recyclerView = findViewById(R.id.studentList);
        StudentRepository repository = new StudentRepository(this);
        ArrayList<Student> students = repository.returnArrayOfStudents();
        StudentAdapter adapter = new StudentAdapter(students);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }




}

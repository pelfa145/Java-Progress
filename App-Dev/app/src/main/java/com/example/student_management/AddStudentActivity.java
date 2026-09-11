package com.example.student_management;

import static com.example.student_management.MainActivity.students;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class AddStudentActivity extends Activity {

    static boolean successful;
    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_add_student);

        //elements
        TextInputEditText etFirst = findViewById(R.id.etFirstName);
        TextInputEditText etLast = findViewById(R.id.etLastName);
        TextInputEditText etAge = findViewById(R.id.etAge);
        TextInputEditText etCourse = findViewById(R.id.etCourse);
        TextInputEditText etYearLevel = findViewById(R.id.YearLevel);
        Switch switchStatus = findViewById(R.id.switchStatus);
        Button btnAdd = findViewById(R.id.btnAdd);
        //get
        btnAdd.setOnClickListener(v -> {
            String first = etFirst.getText().toString().trim();
            String last = etLast.getText().toString().trim();
            int age = Integer.parseInt(etAge.getText().toString());
            String course = etCourse.getText().toString();
            int yearLevel = Integer.parseInt(etYearLevel.getText().toString());
            boolean status = switchStatus.isChecked();
            //create a database first and then before adding into an arraylist or a hashmap even
            int studentID = generateID();
            try{students.add(new Student(first,last, course, age, yearLevel, studentID, status));}catch(Exception e){
                Toast.makeText(this, "Failed to add student.", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(AddStudentActivity.this, MainActivity.class);
            startActivity(intent);
            Toast.makeText(this, "Successfully added "+first+"!", Toast.LENGTH_SHORT).show();

        });
    }
    int generateID(){
        if(!students.isEmpty()){
            return 2026000+students.get(students.size()-1).getStudentID();
        }
        return 2026000;
    }
}

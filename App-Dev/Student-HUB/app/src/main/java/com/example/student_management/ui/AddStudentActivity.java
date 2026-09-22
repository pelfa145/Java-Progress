package com.example.student_management.ui;


import android.content.Intent;
import android.database.sqlite.SQLiteConstraintException;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.student_management.R;
import com.example.student_management.data.StudentRepository;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;

public class AddStudentActivity extends AppCompatActivity {

    StudentRepository repository;

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_add_student);

        //elements
        TextInputEditText etFirst = findViewById(R.id.etFirstName);
        TextInputEditText etLast = findViewById(R.id.etLastName);
        TextInputEditText etAge = findViewById(R.id.etAge);
        TextInputEditText etCourse = findViewById(R.id.etCourse);
        TextInputEditText etYearLevel = findViewById(R.id.YearLevel);
        MaterialSwitch switchStatus = findViewById(R.id.switchStatus);
        Button btnAdd = findViewById(R.id.btnAdd);
        //get
        btnAdd.setOnClickListener(v -> {
            String first = etFirst.getText().toString().trim();
            String last = etLast.getText().toString().trim();
            String initAge = etAge.getText().toString();
            String course = etCourse.getText().toString();
            String initYearLevel = etYearLevel.getText().toString();
            boolean status = switchStatus.isChecked();
            //create a database first and then before adding into an arraylist or a hashmap even

            try {
                int studentID = generateID();
                int age = Integer.parseInt(initAge);
                int yearLevel = Integer.parseInt(initYearLevel);
                repository = new StudentRepository(this);
                long result = repository.addStudent(first, last, course, age, yearLevel, status, studentID);
                if(result==-1){
                    Toast.makeText(this, "Failed to add student.", Toast.LENGTH_SHORT).show();
                    return;
                }
            } catch (SQLiteConstraintException e) {
                Toast.makeText(this, "Student ID already exists.", Toast.LENGTH_SHORT).show();
                clearStatements(etAge, etFirst, etLast, etCourse, etYearLevel);
                return;
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Input a correct number on age or year level. (Ex. 1 or 18)", Toast.LENGTH_SHORT).show();
                clearStatements(etAge, etFirst, etLast, etCourse, etYearLevel);
                return;
            }
            Intent intent = new Intent(AddStudentActivity.this, MainActivity.class);
            Toast.makeText(this, "Successfully added " + first + "!", Toast.LENGTH_SHORT).show();
            finish();
            startActivity(intent);
        });

    }

    void clearStatements(TextInputEditText a, TextInputEditText b, TextInputEditText c, TextInputEditText d, TextInputEditText e){
        a.setText("");
        b.setText("");
        c.setText("");
        d.setText("");
        e.setText("");
    }
    int generateID() {
        repository = new StudentRepository(this);
        int id = repository.scanID();
        if(id != -100){
            return id + 1;
        }
        return 2026000;

    }
}

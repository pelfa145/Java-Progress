package com.example.student_management;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;

import com.google.android.material.textfield.TextInputEditText;

public class AddStudentActivity extends Activity {

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
       /* String first = etFirst.getText().toString().trim();
        String last = etLast.getText().toString().trim();
        int age = Integer.parseInt(etAge.getText().toString().trim());
        String course = etCourse.getText().toString();
        int yearLevel = Integer.parseInt(etYearLevel.getText().toString().trim());*/
        btnAdd.setOnClickListener(v -> {
            String first = etFirst.getText().toString().trim();
            String last = etLast.getText().toString().trim();
            int age = Integer.parseInt(etAge.getText().toString().trim());
            String course = etCourse.getText().toString();
            int yearLevel = Integer.parseInt(etYearLevel.getText().toString().trim());
            boolean isEnabled = switchStatus.isChecked();
            //create a database first and then before adding into an arraylist or a hashmap even
        });
    }
}

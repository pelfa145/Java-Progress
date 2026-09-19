package com.example.student_management;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //elements
        TextView tvTotalStudents = findViewById(R.id.tvTotalStudents);
        CardView btnAddStudent = findViewById(R.id.btnAddStudent);
        CardView btnViewStudents = findViewById(R.id.btnViewStudents);
        TextView tvActiveStudents = findViewById(R.id.tvActiveStudents);
        TextView tvInactiveStudents = findViewById(R.id.tvInactiveStudents);
        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigation);
        MenuItem homeItem = bottomNavigation.getMenu().findItem(R.id.nav_dashboard);
        MenuItem studentsItem = bottomNavigation.getMenu().findItem(R.id.nav_students);
        MenuItem settingsItem = bottomNavigation.getMenu().findItem(R.id.nav_settings);

        btnAddStudent.setOnClickListener(v-> {
        Intent intent = new Intent(MainActivity.this, AddStudentActivity.class);
        startActivity(intent);
        });
        btnViewStudents.setOnClickListener(v -> {
        Intent intent = new Intent(this, ViewStudents.class);
        });

        bottomNavigation.setOnItemSelectedListener(item -> {
            if(item.getItemId() == R.id.nav_students){
                Intent intent = new Intent(this, ViewStudents.class);
                startActivity(intent);
            }
            if(item.getItemId() == R.id.nav_dashboard){

            }
            if(item.getItemId() == R.id.nav_settings){

            }
            return false;
        });
    }
    @Override
    protected void onResume(){
        super.onResume();

        updateDashboard();
    }
    public void updateDashboard(){
        StudentRepository repository = new StudentRepository(this);
        int[] result = repository.returnTotalAndActive();
        if(result != null){
            TextView a = findViewById(R.id.tvTotalStudents);
            TextView b = findViewById(R.id.tvActiveStudents);
            a.setText(String.valueOf(result[0]));
            b.setText(String.valueOf(result[1]));
        }
    }
}
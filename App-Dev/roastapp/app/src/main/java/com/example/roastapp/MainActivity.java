package com.example.roastapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Button btnRegister = findViewById(R.id.myButton);
            Button btnLogin = findViewById(R.id.myButton2);

            btnRegister.setOnClickListener(v -> {
                Intent intent = new Intent(this, RegistrationPage.class);
                startActivity(intent);
                finish();
            });

            btnLogin.setOnClickListener(v -> {
                Intent intent = new Intent(this, LoginPage.class);
                startActivity(intent);
                finish();
            });
        }
}
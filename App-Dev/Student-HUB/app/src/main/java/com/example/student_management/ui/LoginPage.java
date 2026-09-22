package com.example.student_management.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.student_management.R;


public class LoginPage extends Activity {


    //hardcoded login credentials
    String hEmail = "admin";
    String hPassword = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v -> {
            String email = etEmail.getText().toString();
            String password = etPassword.getText().toString();
            Intent intent = new Intent(this, MainActivity.class);

            if(email.equals(hEmail)&&password.equals(hPassword)){
                Toast.makeText(this, "Successfully logged in!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                return;
            }
            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Password or Email is empty", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "Password or Email is wrong.", Toast.LENGTH_SHORT).show();
            }
        });
    }

}

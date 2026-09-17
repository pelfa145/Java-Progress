package com.example.student_management;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.database.sqlite.*;


public class LoginPage extends Activity {


    //hardcoded login credentials
    String hEmail = "admin";
    String hPassword = "1234";
    EditText etEmail = findViewById(R.id.etEmail);
    EditText etPassword = findViewById(R.id.etPassword);
    Button btnLogin = findViewById(R.id.btnLogin);
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        btnLogin.setOnClickListener(v -> {
            String email = etEmail.getText().toString();
            String password = etPassword.getText().toString();
            Intent intent = new Intent(this, MainActivity.class);

            if(email.equals(hEmail)&&password.equals(hPassword)){
                Toast.makeText(this, "Successfully logged in!", Toast.LENGTH_SHORT);
                startActivity(intent);
                return;
            }

            Toast.makeText(this, "Password or Email was wrong.", Toast.LENGTH_SHORT).show();
            
        });
    }

}

package com.example.roastapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class RegistrationPage extends Activity {

    @Override
    protected void onCreate(Bundle savedBundleInstance){
        super.onCreate(savedBundleInstance);
        setContentView(R.layout.activity_registration);
        EditText etEmail = findViewById(R.id.emailInputReg);
        EditText etPassword = findViewById(R.id.passwordInputReg);
        EditText etConfirmPass = findViewById(R.id.confirmPasswordInput);
        Button btnRegister = findViewById(R.id.btnCreateAcc);
        CheckBox termsCheckbox = findViewById(R.id.termsCheckbox);


    }
}

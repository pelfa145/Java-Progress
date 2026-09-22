package com.example.roastapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationPage extends Activity {

    AccountRepository repository = new AccountRepository(this);
    @Override
    protected void onCreate(Bundle savedBundleInstance){
        super.onCreate(savedBundleInstance);
        setContentView(R.layout.activity_registration);
        EditText etEmail = findViewById(R.id.emailInputReg);
        EditText etPassword = findViewById(R.id.passwordInputReg);
        EditText etConfirmPass = findViewById(R.id.confirmPasswordInput);
        Button btnRegister = findViewById(R.id.btnCreateAcc);
        CheckBox termsCheckbox = findViewById(R.id.termsCheckbox);

        btnRegister.setOnClickListener(v -> {
            String inputEmail = etEmail.getText().toString();
            String inputPassword = etPassword.getText().toString();
            String confirmPassword = etConfirmPass.getText().toString();
            boolean terms = termsCheckbox.isChecked();
            if(!terms){
                Toast.makeText(this, "Check the terms and conditions before proceeding.", Toast.LENGTH_SHORT).show();
                return;
            }
            if(!inputPassword.equals(confirmPassword)){
                Toast.makeText(this, "Passwords don't match.", Toast.LENGTH_SHORT).show();
                return;
            }
            Intent intent = new Intent(this, MainActivityPage.class);
            long result = repository.createAccount(inputEmail, inputPassword);
            if(result == -1){
                Toast.makeText(this, "Something went wrong.", Toast.LENGTH_SHORT).show();
                etEmail.setText("");
                etPassword.setText("");
                etConfirmPass.setText("");
                return;
            }
            startActivity(intent);
            Toast.makeText(this, "Account added.", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}

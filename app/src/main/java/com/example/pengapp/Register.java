package com.example.pengapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Register extends AppCompatActivity {

    private EditText etUsername, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etUsername = findViewById(R.id.editTextTextEmailAddress2);
        etPassword = findViewById(R.id.editTextTextPassword2);
        findViewById(R.id.register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

    private void registerUser(){
        String userName = etUsername.getText().toString().trim();
        String passWord = etPassword.getText().toString().trim();

        if(userName.isEmpty()){
            etUsername.setError("need username");
            etUsername.requestFocus();

        }else if(passWord.isEmpty()){
            etPassword.setError("need password");
            etPassword.requestFocus();
        }
    }
}
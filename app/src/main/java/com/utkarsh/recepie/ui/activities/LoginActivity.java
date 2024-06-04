package com.utkarsh.recepie.ui.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.utkarsh.recepie.R;

public class LoginActivity extends AppCompatActivity {
    private TextView txtRegister;
    private AppCompatButton btnSignin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        txtRegister=findViewById(R.id.txtRegister);
        btnSignin=findViewById(R.id.btnSignin);
        txtRegister.setOnClickListener(v -> {
            startActivity(new Intent(this, RegisterActivity.class));
        });
        btnSignin.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });

    }
}

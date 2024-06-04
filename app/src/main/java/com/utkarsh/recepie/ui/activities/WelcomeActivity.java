package com.utkarsh.recepie.ui.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.utkarsh.recepie.R;

public class WelcomeActivity extends AppCompatActivity {
   private AppCompatButton btnRegister;
   private TextView signIn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcome);
        btnRegister=findViewById(R.id.btnRegister);
        signIn= findViewById(R.id.signIn);
        btnRegister.setOnClickListener(v -> {
            startActivity(new Intent(WelcomeActivity.this,RegisterActivity.class));
        });

        signIn.setOnClickListener(v -> {
            startActivity(new Intent(WelcomeActivity.this, LoginActivity.class));
        });

    }
}

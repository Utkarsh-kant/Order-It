package com.utkarsh.recepie.ui.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.utkarsh.recepie.R;

public class RegisterActivity extends AppCompatActivity {
   private TextView txtSignin;
   private AppCompatButton btnRegister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        txtSignin=findViewById(R.id.txtSignin);
        btnRegister=findViewById(R.id.btnRegister);
        txtSignin.setOnClickListener(v -> {
            startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
        });
        btnRegister.setOnClickListener(v->{
            startActivity(new Intent(RegisterActivity.this,MainActivity.class));
        });

    }
}

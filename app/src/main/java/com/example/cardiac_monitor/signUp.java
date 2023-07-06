package com.example.cardiac_monitor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signUp extends AppCompatActivity {
    Button btmSU;
    EditText phn, pass, ConPass, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        phn = findViewById(R.id.phone);
        pass = findViewById(R.id.password);
        email =findViewById(R.id.email);
        ConPass = findViewById(R.id.confirmPass);
        btmSU = findViewById(R.id.signUp);

        btmSU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getPhn = phn.getText().toString();
                String getEmail = email.getText().toString();
                String getPass = email.getText().toString();

                Intent intent = new Intent(signUp.this, verify.class);
                intent.putExtra("Phone", getPhn);
                intent.putExtra("Email", getEmail);
                intent.putExtra("Pass", getPass);
                startActivity(intent);
            }
        });
    }


}
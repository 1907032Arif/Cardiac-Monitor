package com.example.cardiac_monitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class logIn extends AppCompatActivity {
    Button btmSI, btmSU;
    EditText phn, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        phn = findViewById(R.id.phone);
        pass = findViewById(R.id.password);
        btmSI = findViewById(R.id.signIn);
        btmSU = findViewById(R.id.toSU);

        btmSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getPhn = phn.getText().toString();
                Intent intent = new Intent(logIn.this, HomeActivity.class);
                intent.putExtra("Phone", getPhn);

                startActivity(intent);
            }
        });

        btmSU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(logIn.this, signUp.class);
                startActivity(intent);
            }
        });
    }


}
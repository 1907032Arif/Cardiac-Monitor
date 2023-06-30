package com.example.cardiac_monitor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class logIn extends AppCompatActivity {
    Button btmSI;
    EditText phn, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        phn = findViewById(R.id.phone);
        pass = findViewById(R.id.password);
        btmSI = findViewById(R.id.signIn);

        btmSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


}
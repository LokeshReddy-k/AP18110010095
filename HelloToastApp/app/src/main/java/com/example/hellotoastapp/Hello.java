package com.example.hellotoastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Hello extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        String s =getIntent().getStringExtra("Count");
        tv = findViewById(R.id.text);
        tv.setText("Hello!"+"\n"+s);
    }
}
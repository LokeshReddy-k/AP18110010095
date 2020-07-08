package com.example.hellotoastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Button_count,Button_hello;
    TextView tv;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button_count = findViewById(R.id.count);
        Button_hello = findViewById(R.id.hello);
        tv = findViewById(R.id.count);
        Button_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //action
                count++;
                tv.setText(""+count);
            }
        });
        if(savedInstanceState!=null){
            String s = savedInstanceState.getString("loki");
            tv.setText(s);
        }

    }

    public void display(View view) {
        String Count = tv.getText().toString();
        Intent i = new Intent(MainActivity.this,Hello.class);
        i.putExtra("Count", Count);
        startActivity(i);

    }
}
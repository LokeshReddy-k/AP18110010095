package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView tv;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.name);
        et2 = findViewById(R.id.password);
    }

    public void SignIn(View view) {
        String data = et1.getText().toString();
        String passwrd = et2.getText().toString();
        if(data.isEmpty() && passwrd.isEmpty()){
            Toast.makeText(this, "Enter Username and Password", Toast.LENGTH_SHORT).show();
        }
        else if(data.isEmpty()){
            Toast.makeText(this, "Enter Username", Toast.LENGTH_SHORT).show();
        }
        else if(passwrd.isEmpty()){
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent i = new Intent(MainActivity.this, HomePage.class);
            i.putExtra("mydata", data);
            i.putExtra("mypassword",passwrd);
            startActivity(i);
        }
    }
    public void SignUp(View view) {
        String data = et1.getText().toString();
        String passwrd = et2.getText().toString();
        if(data.isEmpty() && passwrd.isEmpty()){
            Intent i = new Intent(MainActivity.this, RegisterPage.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "You Already Have An Account. Please Login", Toast.LENGTH_SHORT).show();
        }
    }
}
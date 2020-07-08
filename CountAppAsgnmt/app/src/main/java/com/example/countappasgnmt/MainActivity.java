

package com.example.countappasgnmt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button b1, b2, b3;
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.add);
        tv = findViewById(R.id.textcount);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                tv.setText("" + a);
            }
        });
        b2 = findViewById(R.id.sub);
        tv = findViewById(R.id.textcount);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a==0) {
                    Toast.makeText(MainActivity.this, "Count cann't be less than zero", Toast.LENGTH_SHORT).show();
                }
                else {
                    a--;
                    tv.setText("" + a);
                }
            }
        });
        b3 = findViewById(R.id.reset);
        tv.findViewById(R.id.textcount);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = 0;
                tv.setText("" + a);
            }
        });
    }

    public void display(View view) {
        Toast.makeText(this, String.format("Your count is : %s", tv.getText()), Toast.LENGTH_LONG).show();
    }
}
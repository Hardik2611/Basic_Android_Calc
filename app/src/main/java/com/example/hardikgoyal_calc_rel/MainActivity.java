  package com.example.hardikgoyal_calc_rel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

  public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1,b2,b3,b4;
    TextView t1;
    ImageButton b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.editTextNumberDecimal);
        e2 = findViewById(R.id.editTextNumberDecimal2);
        b1 = findViewById(R.id.button2);
        b2 = findViewById(R.id.button);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        t1 = findViewById(R.id.Result);
        b5 = findViewById(R.id.imageButton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(e1.getText().toString());
                double b = Double.parseDouble(e2.getText().toString());
                double c = a + b;
                t1.setText("The sum of "+a+" & "+b+" yields "+c+" as result.");
                Toast.makeText(MainActivity.this,"Result : "+c,Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(e1.getText().toString());
                double b = Double.parseDouble(e2.getText().toString());
                double c = a - b;
                t1.setText("The subtraction of "+a+" & "+b+" yields "+c+" as result.");
                Toast.makeText(MainActivity.this, "Result : "+c, Toast.LENGTH_LONG).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(e1.getText().toString());
                double b = Double.parseDouble(e2.getText().toString());
                double c = a * b;
                t1.setText("The multiplication of "+a+" & "+b+" yields "+c+" as result.");
                Toast.makeText(MainActivity.this,"Result : "+c,Toast.LENGTH_LONG).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(e1.getText().toString());
                double b = Double.parseDouble(e2.getText().toString());
                double c = a / b;
                t1.setText("The divison of "+a+" & "+b+" yields "+c+" as result.");
                Toast.makeText(MainActivity.this,"Result : "+c,Toast.LENGTH_LONG).show();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("Made by Hardik Goyal");
                e1.setText("");
                e2.setText("");
            }
        });
    }
}
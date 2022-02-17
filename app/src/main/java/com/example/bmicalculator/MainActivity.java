package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText height03, weight2,agecc;
   Button calculatex;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height03= findViewById(R.id.height03);
        weight2 = findViewById(R.id.weight2);
        calculatex = findViewById(R.id.calculateBtn);
        agecc=findViewById(R.id.age2);

        Intent i=new Intent(this, second_activity.class);

            calculatex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(height03.getText().toString());
                double num2 = Double.parseDouble(weight2.getText().toString());
                String agex=agecc.getText().toString();
                double sum = num2/(num1*num1);
                String sr=String.format("%.2f",sum);
                i.putExtra("One",sr);
                i.putExtra("two",agex);
                startActivity(i);
            }
        });



    }
}
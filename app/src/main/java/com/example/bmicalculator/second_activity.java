package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {
    TextView resulty;
    Button buttony;

    public void restartActivity()
    {
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        resulty=findViewById(R.id.resulty);
        buttony=findViewById(R.id.resultBtn);

        Intent i=getIntent();
        String rv=i.getStringExtra("One");
        String rs=i.getStringExtra("two");
        double d=Double.parseDouble(rv);

        if (d<=18.5){
            resulty.setText("You are "+rs+" years old and Your BMI is "+d+". You are under weight.");
        }
        else if(d>18.5 && d<=24.9){
            resulty.setText("You are "+rs+" years old and Your BMI is "+d+". You have normal weight.");
        }
        else {
            resulty.setText("You are "+rs+" years old and Your BMI is "+d+". You are over weight.");
        }

        buttony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restartActivity();
            }
        });
    }
}
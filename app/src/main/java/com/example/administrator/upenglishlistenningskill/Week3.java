package com.example.administrator.upenglishlistenningskill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Week3 extends AppCompatActivity {
    Button btn13,btn14,btn15,btn16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week3);
        btn13 = findViewById(R.id.button13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn14 = findViewById(R.id.button14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn15 = findViewById(R.id.button15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn16 = findViewById(R.id.button16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

package com.example.administrator.upenglishlistenningskill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Week4 extends AppCompatActivity {
    Button btn17,btn18,btn19,btn20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4);
        btn17 = findViewById(R.id.button17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn18 = findViewById(R.id.button18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn19 = findViewById(R.id.button19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn20 = findViewById(R.id.button20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

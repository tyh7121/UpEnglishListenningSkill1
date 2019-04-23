package com.example.administrator.upenglishlistenningskill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Week2 extends AppCompatActivity {
    Button btn9,btn10,btn11,btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week2);
        btn9 = findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn10 = findViewById(R.id.button10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn11 = findViewById(R.id.button11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn12 = findViewById(R.id.button12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

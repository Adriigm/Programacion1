package com.example.testingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_= (Button) findViewById(R.id.botoncito);
        TextView textito = (TextView) findViewById(R.id.textito);

        button_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textito.setText("Buenas tardes");

            }
        });

    }
}
package com.example.testingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.nio.charset.Charset;


public class Calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        TextView texto = (TextView) findViewById(R.id.texto);
        Button num1= (Button) findViewById(R.id.num1);


        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = texto.getText().toString();

                texto.setText(texto.getText() + "1");

            }
        });

        Button num2= (Button) findViewById(R.id.num2);

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = texto.getText().toString();

                texto.setText(texto.getText() + "2");

            }
        });

        Button num3= (Button) findViewById(R.id.num3);

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = texto.getText().toString();

                texto.setText(texto.getText() + "3");

            }
        });

        Button num4= (Button) findViewById(R.id.num4);

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = texto.getText().toString();

                texto.setText(texto.getText() + "4");

            }
        });

        Button num5= (Button) findViewById(R.id.num5);

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = texto.getText().toString();

                texto.setText(texto.getText() + "5");

            }
        });

        Button num6= (Button) findViewById(R.id.num6);

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = texto.getText().toString();

                texto.setText(texto.getText() + "6");

            }
        });

        Button num7= (Button) findViewById(R.id.num7);

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = texto.getText().toString();

                texto.setText(texto.getText() + "7");

            }
        });

        Button num8= (Button) findViewById(R.id.num8);

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = texto.getText().toString();

                texto.setText(texto.getText() + "8");

            }
        });

        Button num9= (Button) findViewById(R.id.num9);

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = texto.getText().toString();

                texto.setText(texto.getText() + "9");

            }
        });

        Button num0= (Button) findViewById(R.id.num0);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = texto.getText().toString();
                texto.setText(texto.getText() + "0");
                Charset a = texto.getText()
            }
        });

        Button suma= (Button) findViewById(R.id.suma);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int numero = Integer.parseInt(s1);

            }
        });


    }
}
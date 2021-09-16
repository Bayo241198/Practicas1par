package com.example.practicas1par;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void practicaUno(View view){
        Intent intent = new Intent(MainActivity.this, PracticaUno.class);
        startActivity(intent);
    }

    public void practicaDos(View view){
        Intent intent = new Intent(MainActivity.this, PracticaDos.class);
        startActivity(intent);
    }

    public void practicaTres(View view){
        Intent intent = new Intent(MainActivity.this, PracticaTres.class);
        startActivity(intent);
    }

    public void practicaCuatro(View view){
        Intent intent = new Intent(MainActivity.this, PracticaCuatro.class);
        startActivity(intent);
    }

    public void practicaCinco(View view){
        Intent intent = new Intent(MainActivity.this, PracticaCinco.class);
        startActivity(intent);
    }
}
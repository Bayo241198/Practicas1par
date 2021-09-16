package com.example.practicas1par;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PracticaTres extends AppCompatActivity {

    private EditText etPrimer, etSegundo, etTercero;
    private TextView txtPromedio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica_tres);

        etPrimer = (EditText) findViewById(R.id.etPrimer);
        etSegundo = (EditText) findViewById(R.id.etSegundo);
        etTercero = (EditText) findViewById(R.id.etTercero);
        txtPromedio = (TextView) findViewById(R.id.txtPromedio);
    }

    public void promedio(View v){
        int primero, segundo, tercero, promedio;
        primero = Integer.parseInt(etPrimer.getText().toString());
        segundo = Integer.parseInt(etSegundo.getText().toString());
        tercero = Integer.parseInt(etTercero.getText().toString());
        promedio = (primero + segundo + tercero) / 3;
        if (promedio >= 51){
            txtPromedio.setText("Estudiante aprobado con " + promedio);
        }else{
            txtPromedio.setText("Estudiante reprobado con " + promedio);
        }
    }
}
package com.example.practicas1par;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class PracticaCinco extends AppCompatActivity {
    private EditText etSpinnerUno, etSpinnerDos;
    private Spinner spinner;
    private TextView txtSpinnerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica_cinco);

        etSpinnerUno = (EditText) findViewById(R.id.etSpinnerUno);
        etSpinnerDos = (EditText) findViewById(R.id.etSpinnerDos);
        txtSpinnerView = (TextView) findViewById(R.id.txtSpinnerView);
        spinner = (Spinner) findViewById(R.id.spnCalcular);
        String [] op ={"Sumar", "Restar", "Multiplicar", "Dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op);
        spinner.setAdapter(adapter);
    }

    public void calcular(View v){
        int valorUno, valorDos, suma, resta, multiplicacion, division;
        valorUno = Integer.parseInt(etSpinnerUno.getText().toString());
        valorDos = Integer.parseInt(etSpinnerDos.getText().toString());
        String seleccionar = spinner.getSelectedItem().toString();
        if (seleccionar.equals("Sumar")){
            suma = valorUno + valorDos;
            txtSpinnerView.setText(Integer.toString(suma));
        }if (seleccionar.equals("Restar")){
            resta = valorUno - valorDos;
            txtSpinnerView.setText(Integer.toString(resta));
        }if (seleccionar.equals("Multiplicar")){
            multiplicacion = valorUno * valorDos;
            txtSpinnerView.setText(Integer.toString(multiplicacion));
        }if (seleccionar.equals("Dividir")){
            if (valorDos == 0) {
                Toast.makeText(this, "Resultado Infinito", Toast.LENGTH_LONG).show();
            } else {
                division = valorUno / valorDos;
                txtSpinnerView.setText(Integer.toString(division));
            }
        }
    }
}
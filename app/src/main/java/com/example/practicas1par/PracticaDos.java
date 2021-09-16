package com.example.practicas1par;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PracticaDos extends AppCompatActivity {

    private EditText etUno, etDos;
    private TextView txtResultado;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica_dos);
        etUno = (EditText) findViewById(R.id.etNumeroUno);
        etDos = (EditText) findViewById(R.id.etNumeroDos);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
    }

    public void sumar(View v){
        int valorUno, valorDos, resultado;
        valorUno = Integer.parseInt(etUno.getText().toString());
        valorDos = Integer.parseInt(etDos.getText().toString());
        resultado = valorUno + valorDos;
        txtResultado.setText(Integer.toString(resultado));
    }

    public void restar(View v){
        int valorUno, valorDos, resultado;
        valorUno = Integer.parseInt(etUno.getText().toString());
        valorDos = Integer.parseInt(etDos.getText().toString());
        resultado = valorUno - valorDos;
        txtResultado.setText(Integer.toString(resultado));
    }

    public void multiplicar(View v){
        int valorUno, valorDos, resultado;
        valorUno = Integer.parseInt(etUno.getText().toString());
        valorDos = Integer.parseInt(etDos.getText().toString());
        resultado = valorUno * valorDos;
        txtResultado.setText(Integer.toString(resultado));
    }

    public void dividir(View v){
        int valorUno, valorDos, resultado;
        valorUno = Integer.parseInt(etUno.getText().toString());
        valorDos = Integer.parseInt(etDos.getText().toString());
        if (valorDos == 0){
            Toast.makeText(this, "Resultado Infinito", Toast.LENGTH_LONG).show();
        }else {
            resultado = valorUno / valorDos;
            txtResultado.setText(Integer.toString(resultado));
        }
    }
}
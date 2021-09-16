package com.example.practicas1par;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class PracticaCuatro extends AppCompatActivity {

    private EditText radioEtUno, radioEtDos;
    private RadioButton rbUno, rbDos, rbTres, rbCuatro;
    private TextView txtRadioRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica_cuatro);

        radioEtUno = (EditText) findViewById(R.id.etPracticaCuatroUno);
        radioEtDos = (EditText) findViewById(R.id.etPracticaCuatroDos);
        rbUno = (RadioButton) findViewById(R.id.rbSumar);
        rbDos = (RadioButton) findViewById(R.id.rbRestar);
        rbTres = (RadioButton) findViewById(R.id.rbMultiplicar);
        rbCuatro = (RadioButton) findViewById(R.id.rbDividir);
        txtRadioRes = (TextView) findViewById(R.id.txtRadioButton);
    }

    public void Calcular(View v){
        int valorUno, valorDos, suma, resta, multiplicacion, division;
        valorUno = Integer.parseInt(radioEtUno.getText().toString());
        valorDos = Integer.parseInt(radioEtDos.getText().toString());
        if(rbUno.isChecked() == true){
            suma = valorUno + valorDos;
            txtRadioRes.setText(Integer.toString(suma));
        }if(rbDos.isChecked() == true){
            resta = valorUno - valorDos;
            txtRadioRes.setText(Integer.toString(resta));
        }if(rbTres.isChecked() == true){
            multiplicacion = valorUno * valorDos;
            txtRadioRes.setText(Integer.toString(multiplicacion));
        }if(rbCuatro.isChecked() == true) {
            if (valorDos == 0) {
                Toast.makeText(this, "Resultado Infinito", Toast.LENGTH_LONG).show();
            } else {
                division = valorUno / valorDos;
                txtRadioRes.setText(Integer.toString(division));
            }
        }
    }
}
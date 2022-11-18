package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtResultado;
    private EditText editPeso;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
    }

    public void calcularimc(View view){
        Double peso = Double.parseDouble(editPeso.getText().toString());
        Double altura = Double.parseDouble(editAltura.getText().toString());

        Double resultado = peso / (altura * altura);

        if (resultado < 19){
            txtResultado.setText("Abaixo do Peso");
        } else if (resultado >= 19 && resultado < 25){
            txtResultado.setText("Peso Normal");
        } else if (resultado >= 25 && resultado < 30){
            txtResultado.setText("Sobrepeso");
        } else if (resultado >= 30 && resultado < 40){
            txtResultado.setText("Obesidade tipo 1");
        } else {
            txtResultado.setText("Obesidade tipo 2");
        }

    }

}
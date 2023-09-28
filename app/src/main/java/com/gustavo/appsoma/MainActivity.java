package com.gustavo.appsoma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarResultado (View view){
        TextView texto = findViewById(R.id.textResultado);

        EditText numero1 = findViewById(R.id.editNumber1);
        EditText numero2 = findViewById(R.id.editNumber2);

        int resultado;
        resultado = Integer.parseInt(String.valueOf(numero1.getText()))+Integer.parseInt(String.valueOf(numero2.getText()));
        texto.setText("Resultado da soma :" +resultado);
    }



}
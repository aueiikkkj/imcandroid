package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText caixapeso;
    private EditText caixaaltura;
    private TextView caixaresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        caixapeso = findViewById(R.id.caixapeso);
        caixaaltura = findViewById(R.id.caixaaltura);
        caixaresultado = findViewById(R.id.caixaresultado);

    }
    public void calcular(){
        int peso= Integer.parseInt(caixapeso.getText().toString());
        int altura = Integer.parseInt(caixaaltura.getText().toString());
        caixaresultado.setText(String.valueOf(peso/altura^2));
    }
}

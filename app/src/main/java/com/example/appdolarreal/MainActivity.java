package com.example.appdolarreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edtValorDolar, edtQuantidDolar;
    TextView txtValorReal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValorDolar = findViewById(R.id.edtValorDolar);
        edtQuantidDolar = findViewById(R.id.edtQuantidDolar);

        txtValorReal = findViewById(R.id.txtValorReal);

    }

    public void calcular(View view) {

        double quantDolar = Double.parseDouble(edtQuantidDolar.getText().toString());
        double valorDolar = Double.parseDouble(edtValorDolar.getText().toString());

        double totalReais = valorDolar * quantDolar;

        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(totalReais);

        txtValorReal.setText("R$: " + valorFormatado);


    }
}
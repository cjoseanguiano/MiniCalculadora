package com.minicalculadora.devix.minicalculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    Button btnSumar;
    Button btnRestar;
    Button btnDividir;
    Button btnMultiplicar;
    TextView txtResultado;
    double numero1;
    double numero2;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.edtUno);
        editText2 = (EditText) findViewById(R.id.edtDos);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnDividir = (Button) findViewById(R.id.btnDivicion);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

//        String strUno = editText1.getText().toString();
//        String strDos = editText2.getText().toString();

        if (editText1.getText().toString().equals("") || editText2.getText().toString().equals("")) {
            Toast.makeText(this, "Ingresa un valor", Toast.LENGTH_SHORT).show();
        }
    }

    public void Sumar(View view) {
        numero1 = Double.parseDouble(editText1.getText().toString());
        numero2 = Double.parseDouble(editText2.getText().toString());
        resultado = numero1 + numero2;
        txtResultado.setText(String.valueOf(resultado));

    }


    public void Restar(View view) {
        numero1 = Double.parseDouble(editText1.getText().toString());
        numero2 = Double.parseDouble(editText2.getText().toString());
        resultado = numero1 - numero2;
        txtResultado.setText(String.valueOf(resultado));
    }

    public void Multiplicar(View view) {
        numero1 = Double.parseDouble(editText1.getText().toString());
        numero2 = Double.parseDouble(editText2.getText().toString());
        resultado = numero1 * numero2;
        txtResultado.setText(String.valueOf(resultado));
    }

    public void Dividir(View view) {
        numero1 = Double.parseDouble(editText1.getText().toString());
        numero2 = Double.parseDouble(editText2.getText().toString());
        resultado = numero1 / numero2;
        txtResultado.setText(String.valueOf(resultado));
    }


}

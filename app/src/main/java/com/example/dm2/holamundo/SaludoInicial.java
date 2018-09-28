package com.example.dm2.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class SaludoInicial extends AppCompatActivity {

    private TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo_inicial);

        txtSaludo = (TextView) findViewById(R.id.txtSaludo);

        Bundle bundle = this.getIntent().getExtras();

        txtSaludo.setText("Hola "+ bundle.getString("NOMBRE"));
    }
}

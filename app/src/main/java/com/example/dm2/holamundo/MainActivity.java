package com.example.dm2.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnAceptar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos una referencia a los controles de la interfaz
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        btnAceptar = (Button) findViewById(R.id.btnaceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(MainActivity.this, SaludoInicial.class);

                Bundle b = new Bundle();
                b.putString("NOMBRE", txtNombre.getText().toString());

                intento.putExtras(b);

                startActivity(intento);
            }
        });
    }
}

package com.myapplication.demo.ventanas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Segunda extends AppCompatActivity {

    TextView textoSegunda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textoSegunda = (TextView)findViewById(R.id.textoSegunda);

        // me enlazo con un contextoi actual q tengo yo mismo es this
        Bundle b = this.getIntent().getExtras(); // con getExtras cojo las variables
        // seteamos el valor q fue enviado de la activity main
        textoSegunda.setText("Bienvenido "+b.getString("NOMBRE"));
    }
}

package com.myapplication.demo.ventanas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton;
    EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button)findViewById(R.id.button);
        texto = (EditText)findViewById(R.id.editText);

        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button:
                llamar_otra_activity();
                break;
        }
    }

    public void llamar_otra_activity(){
        // Creamos el intent
        Intent intent=
                new Intent(MainActivity.this,Segunda.class); // desde la ventana actual  (this) llamamos a la otra clase o ventana

        // Creamos la informacion para pasar entre actividades
        Bundle bundle = new Bundle();
        // recuperamos elvalor deleditText, Para recuperar este valor en otra activity se lo ahce por mediod e la clave,en este caso NOMBRE
        bundle.putString("NOMBRE",texto.getText().toString());

        // añadimos la informacion al intent
        intent.putExtras(bundle);
        // iniciamos lanueva activity
        startActivity(intent);
    }
}

package com.example.alumno.telefono;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Hola extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola);
        TextView txt = (TextView) findViewById(R.id.txtView);
        txt.setText("Otro texto papa");

        Button btn1 = (Button) findViewById(R.id.boton1);
        Button btn2 = (Button) findViewById(R.id.boton2);

        MyListener lester = new MyListener();
        btn1.setOnClickListener(lester);
        btn2.setOnClickListener(lester);

    }
}

package com.example.alumno.telefono;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola);

        Modelo model = new Modelo();
        Vista v = new Vista(this,model);
        Controlador c = new Controlador(new MyListener(v));
        v.asignarListener(c);


    }


}

package com.example.alumno.telefono;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alumno on 30/03/2017.
 */

public class Controlador {

    private MyListener lister = null;
    public  Controlador(MyListener lester)
    {
        this.lister = lester;
    }

    public MyListener getLister(){
        return this.lister;
    }





}

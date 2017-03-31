package com.example.alumno.telefono;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener
{
    IMostrarInfo hi = null;

    public MyListener(IMostrarInfo hola)
    {
        hi = hola;
    }

    @Override
    public void onClick(View v) {
        this.hi.mostrarInfo(v);
    }

}

package com.example.alumno.telefono;

import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener
{
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.boton1) {
            Log.d("Click", "Se hizo click en el boton 1 ..");
        }
        if(v.getId() == R.id.boton2) {
            Log.d("Click", "Se hizo click en el boton 2 ..");
        }


    }
}

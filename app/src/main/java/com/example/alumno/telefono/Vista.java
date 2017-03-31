package com.example.alumno.telefono;

/**
 * Created by alumno on 30/03/2017.
 */
import android.view.View;
import android.widget.Button;
import  android.widget.TextView;

public class Vista implements IMostrarInfo {

    private Activity acc = null;
    private Controlador ctrl = null;

    public  Vista(Activity act, Modelo model)
    {
        this.acc = act;
        TextView txt = (TextView) this.acc.findViewById(R.id.txtView);
        txt.setText(model.getTexto());


    }

    public void asignarListener(Controlador ctrl)
    {
        this.ctrl = ctrl;
        Button btn1 = (Button) this.acc.findViewById(R.id.boton1);
        Button btn2 = (Button) this.acc.findViewById(R.id.boton2);
        Button btn3 = (Button) this.acc.findViewById(R.id.boton3);


        btn1.setOnClickListener(this.ctrl.getLister());
        btn2.setOnClickListener(this.ctrl.getLister());
        btn3.setOnClickListener(this.ctrl.getLister());

    }


    @Override
    public void mostrarInfo(View v) {

        TextView tx = (TextView) this.acc.findViewById(R.id.txtView);

        if(v.getId() == R.id.boton1) {
            tx.setText("Se hizo click en el boton 1");
        }
        if(v.getId() == R.id.boton2) {
            tx.setText("Se hizo click en el boton 2");
        }
        if(v.getId() == R.id.boton3) {
            tx.setText("Se hizo click en el boton 3");
        }
    }


}

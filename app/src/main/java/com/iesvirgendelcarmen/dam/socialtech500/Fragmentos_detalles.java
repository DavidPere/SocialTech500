package com.iesvirgendelcarmen.dam.socialtech500;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

/**
 * Created by matinal on 04/12/2017.
 */

public class Fragmentos_detalles extends FragmentActivity {
    private EditText detallesNombre;
    private EditText detallesApellidos;
    private EditText detalleTelefono;
    private EditText detalleEmail;
    private EditText detalleFormacion;
    private EditText detalleProvincias;
    private EditText detalleEdad;
    private EditText detalleSexo;
    private Contacto con;

    public Fragmentos_detalles(){}

    public Fragmentos_detalles(Contacto c){
        this.con=c;
    }

    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmento_lista);

        detallesNombre = (EditText)findViewById(R.id.editNombre);
        detallesApellidos = (EditText)findViewById(R.id.editApellido);
        detalleTelefono = (EditText)findViewById(R.id.editTelefono);
        detalleEmail = (EditText)findViewById(R.id.editEmail);
        detalleFormacion = (MultiAutoCompleteTextView)findViewById(R.id.multi);
        detalleEdad = (EditText) findViewById(R.id.textVSeekBAR);


        detallesNombre.setText(con.getNombre());

    }
}

package com.iesvirgendelcarmen.dam.socialtech500;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;

import javax.microedition.khronos.egl.EGLDisplay;

/**
 * Created by matinal on 04/12/2017.
 */

public class Fragmentos_detalles extends Fragment {
    private TextView detallesNombre;
    private TextView detallesApellidos;
    private TextView detalleTelefono;
    private TextView detalleEmail;
    private TextView detalleFormacion;
    private TextView detalleProvincias;
    private TextView detalleEdad;
    private TextView detalleSexo;
    private Contacto con;

    public Fragmentos_detalles(){}

    @SuppressLint("ValidFragment")
    public Fragmentos_detalles(Contacto c){
        this.con=c;
    }

  /*  @SuppressLint("WrongViewCast")
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

    }*/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragmento_detalle, container, false);
      //  System.out.println("hola2"+con.getNombre());

        detallesNombre = (TextView) view.findViewById(R.id.DetallesNombre);
        detallesApellidos = (TextView) view.findViewById(R.id.DetallesApellidos);
        detalleTelefono = (TextView) view.findViewById(R.id.DetallesTelefono);
        detalleEmail = (TextView) view.findViewById(R.id.DetallesEmail);
        detalleFormacion = (TextView) view.findViewById(R.id.DetallesFormacion);
        detalleEdad = (TextView) view.findViewById(R.id.DetallesEdad);
        detalleProvincias = (TextView)view.findViewById(R.id.DetallesProvincia);
        detalleSexo = (TextView)view.findViewById(R.id.DetallesSexo);

      //  System.out.println("hola"+con.getNombre());

        detallesNombre.setText(con.getNombre());
        detallesApellidos.setText(con.getApellidos());
        detalleTelefono.setText(con.getTelefono());
        detalleEmail.setText(con.getEmail());
        detalleFormacion.setText(con.getFormacion());
        detalleEdad.setText(con.getEdad());
        detalleProvincias.setText(con.getProvincia());
        detalleSexo.setText(con.getSexo());

        return view;

    }
}

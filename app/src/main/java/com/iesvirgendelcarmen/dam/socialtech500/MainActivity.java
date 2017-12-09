package com.iesvirgendelcarmen.dam.socialtech500;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentos_main);



        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        Fragmento_Formulario f = new Fragmento_Formulario();
        FT.replace(R.id.contenedorPrincipal,f);
        FT.commit();




       /* FragmentManager FM3 = getSupportFragmentManager();
        FragmentTransaction FT3 = FM3.beginTransaction();

        Fragmento_detalles fragment3 = new Fragmento_detalles();
        FT3.replace(R.id.detalles,fragment3);
        FT3.commit();*/

    }

    public ArrayList<Contacto> getContactos() {
        return listaContactos ;
    }
}

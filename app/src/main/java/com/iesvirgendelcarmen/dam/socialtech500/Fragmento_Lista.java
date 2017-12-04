package com.iesvirgendelcarmen.dam.socialtech500;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by matinal on 04/12/2017.
 */

public class Fragmento_Lista extends FragmentActivity {
    private ListView lista;
    private ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
    private Contacto con;
    private Fragmentos_detalles detalle;
/*
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragmento_lista, container, false);


        lista = (ListView) view.findViewById(R.id.lista);
        AdapterContacto adaptador = new AdapterContacto(getActivity(), listaContactos);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                con = (Contacto) adapterView.getItemAtPosition(i);
                detalle = new Fragmentos_detalles(con);
            }
        });
        return view;
    }*/

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

package com.iesvirgendelcarmen.dam.socialtech500;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by matinal on 04/12/2017.
 */

public class Fragmento_Lista extends Fragment  {
    private ListView lista;
    private Contacto con;
    private Fragmentos_detalles detalle;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragmento_lista, container, false);


        lista = (ListView) view.findViewById(R.id.lista);
        AdapterContacto adaptador = new AdapterContacto(getActivity(), ((MainActivity)getActivity()).getContactos());
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                con = (Contacto) adapterView.getItemAtPosition(i);

                System.out.println(con);

                FragmentManager FM = getActivity().getSupportFragmentManager();
                FragmentTransaction FT = FM.beginTransaction();
                Fragmentos_detalles f = new Fragmentos_detalles(con);
                FT.replace(R.id.contenedorPrincipal,f);
                FT.commit();
            }
        });
        return view;
    }
}

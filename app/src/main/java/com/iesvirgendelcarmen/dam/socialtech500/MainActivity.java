package com.iesvirgendelcarmen.dam.socialtech500;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentos_main);


        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();

        FragmentManager FM2 = getSupportFragmentManager();
        FragmentTransaction FT2 = FM2.beginTransaction();




       /* FragmentManager FM3 = getSupportFragmentManager();
        FragmentTransaction FT3 = FM3.beginTransaction();

        Fragmento_detalles fragment3 = new Fragmento_detalles();
        FT3.replace(R.id.detalles,fragment3);
        FT3.commit();*/

    }
}

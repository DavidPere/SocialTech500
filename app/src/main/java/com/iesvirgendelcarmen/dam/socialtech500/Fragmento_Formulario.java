package com.iesvirgendelcarmen.dam.socialtech500;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by matinal on 04/12/2017.
 */

public class Fragmento_Formulario extends Fragment {
    private TextView textViewNombre;
    private TextView textViewApellidos;
    private TextView textViewTelefono;
    private TextView textViewEmail;
    private TextView textViewFormacion;
    private TextView textViewEdad;
    private TextView textViewProvincias;
    private TextView ContadorContactos;

    private Button button;


    private EditText editTextNombre;
    private EditText editTextApellidos;
    private EditText editTextTelefono;
    private EditText editTextEmail;

    private Spinner spinner;
    private Spinner spinnerProvincias;

    private SeekBar seekbar;
    private ListView lista;
    private MultiAutoCompleteTextView multiTexto;
    private RadioGroup rg;


    private Contacto contacto;
    private ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragmentos_formulario, container, false);


        if (savedInstanceState != null)
            listaContactos = (ArrayList<Contacto>) savedInstanceState.getSerializable("listaContactos");

        editTextNombre = (EditText) view.findViewById(R.id.editNombre);
        editTextApellidos = (EditText) view.findViewById(R.id.editApellido);
        editTextTelefono = (EditText) view.findViewById(R.id.editTelefono);
        editTextEmail = (EditText) view.findViewById(R.id.editEmail);
        textViewEdad = (TextView) view.findViewById(R.id.textVSeekBAR);
        seekbar = (SeekBar) view.findViewById(R.id.seekBar);
        rg = (RadioGroup) view.findViewById(R.id.radioGroup);
        ContadorContactos = (TextView) view.findViewById(R.id.ContadorContactos);
        button = (Button)view.findViewById(R.id.botonGuardar);
        textViewProvincias = (TextView)view.findViewById(R.id.provincias);


        spinner = (Spinner) view.findViewById(R.id.spinnerFormacion);
        spinnerProvincias = (Spinner) view.findViewById(R.id.spinnerProvincia);
        multiTexto = (MultiAutoCompleteTextView) view.findViewById(R.id.multi);


        seekbar.setProgress(0);
        seekbar.incrementProgressBy(1);
        seekbar.setMax(100);
        textViewEdad = (TextView) view.findViewById(R.id.textVSeekBAR);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewEdad.setText(String.valueOf(progress));
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        rellenarInformacionSpinner();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("Pueba","hola");
                guardarContacto(view);
                //Intent intent = new Intent(getActivity(), Fragmento_Lista.class);
                //startActivity(intent);
                //Log.v("Pueba","hola");
            }
        });



        return view;



    }



    private void rellenarInformacionSpinner() {
        String[] listaFormaciones = {"SMR", "DAM", "DAW", "ASIR", "Ingenieria tecnica informatica",
                "Ingenieria Informatica", "Grado", "Otros"};

        spinner.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listaFormaciones));
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_expandable_list_item_1, listaFormaciones);


        String[] listaProvincias = {"Jaen", "Granada", "Almeria", "Cordoba", "Sevilla",
                "Huelva", "Cadiz", "Malaga"};
        spinnerProvincias.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listaProvincias));


        multiTexto.setAdapter(adaptador);
        multiTexto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

      public void guardarContacto(View view) {

          String nombre = editTextNombre.getText().toString();
          String apellido = editTextApellidos.getText().toString();
          String telefono = editTextTelefono.getText().toString();
          String email = editTextEmail.getText().toString();
          String provincia = textViewProvincias.getText().toString();
          String edad = textViewEdad.getText().toString();
          String formacion = multiTexto.getText().toString();
          String sexo;


          //por defecto es mujer
          RadioButton radio = (RadioButton) getView().findViewById(R.id.hombre);

          if (radio.isChecked()) {
              sexo = "Hombre";
          } else {
              sexo = "Mujer";
          }

          contacto = new Contacto(nombre, apellido, telefono, email, edad, formacion, sexo,provincia);
          listaContactos.add(contacto);


          for (int i = 0; i < listaContactos.size(); i++) {
              int numero = listaContactos.size();
              ContadorContactos.setText("" + numero);

          }

      }
}

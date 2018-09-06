package com.ed2.lab0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NuevaPlaylist extends AppCompatActivity {

    Button btnAgregar;
    EditText tbxCancion;
    EditText tbxArtista;
    EditText tbxGenero;
    EditText tbxDuracion;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_playlist);


        cancion nuevaCancion = null;
        final ArrayList<cancion> playlist = new ArrayList<cancion>();

        btnAgregar = (Button) findViewById(R.id.btn3);
        tbxCancion = (EditText) findViewById(R.id.tbx2);
        tbxArtista = (EditText) findViewById(R.id.tbx3);
        tbxGenero = (EditText) findViewById(R.id.tbx4);
        tbxDuracion = (EditText) findViewById(R.id.tbx5);
        lista = (ListView) findViewById(R.id.playlist);
        final ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, playlist);


        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = tbxCancion.getText().toString();
                String artista = tbxArtista.getText().toString();
                String genero = tbxGenero.getText().toString();
                cancion nuevaCancion;


                if(nombre.equals("") || tbxDuracion.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Ingrese al menos el nombre de la canción y la duración!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Double duracion = Double.valueOf(tbxDuracion.getText().toString()).doubleValue();

                    nuevaCancion = new cancion(nombre, artista, genero, duracion);
                    playlist.add(nuevaCancion);

                    Toast.makeText(getApplicationContext(), "Canción agregada", Toast.LENGTH_LONG).show();

                    Integer tamaño = playlist.size();
                    lista.setAdapter(adaptador);



                }

            }
        });


    }
}

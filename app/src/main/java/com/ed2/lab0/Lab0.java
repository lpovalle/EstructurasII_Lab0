package com.ed2.lab0;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;


public class Lab0 extends AppCompatActivity {

    Button btnBuscar;
    Button btnNueva;
    TextView lbBuscar;
    EditText tbxBuscar;
    TextView lbMostrarCancion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lab0);

        btnBuscar = (Button) findViewById(R.id.btn1);
        btnNueva = (Button) findViewById(R.id.btn2);
        lbBuscar = (TextView) findViewById(R.id.lb1);
        tbxBuscar = (EditText) findViewById(R.id.tbx1);
        lbMostrarCancion = (TextView) findViewById(R.id.lb2);

        final HashMap<String, cancion> diccionario = new HashMap<String, cancion>();
        final cancion nuevaCancion = null;

        diccionario.put("When I'm gone", new cancion("When I'm gone","EMINEM", "Rap/Hip-Hop", 3.15));
        diccionario.put("99 problems", new cancion("99 problems","Jay Z", "Rap/Hip-Hop", 4.20));
        diccionario.put("Lose yourself", new cancion("Lose yourself","EMINEM", "Rap/Hip-Hop", 5.25));
        diccionario.put("Suga suga", new cancion("Suga suga","Baby Bash", "Rap/Hip-Hop", 6.30));
        diccionario.put("In da club", new cancion("In da club","50 cent", "Rap/Hip-Hop", 5.40));
        Intent CrearPlaylist = new Intent(getApplicationContext(), NuevaPlaylist.class);


        btnBuscar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               String cancionbuscada = tbxBuscar.getText().toString();
               cancion cancionencontrada;

                try
                {
                    if(diccionario.containsKey(cancionbuscada))
                    {
                        cancionencontrada = diccionario.get(cancionbuscada);
                        lbMostrarCancion.setText("Nombre de la canción: " + cancionencontrada.Nombre + "\n"
                                + "Autor: " + cancionencontrada.Artista + "\n"
                                + "Género: " + cancionencontrada.Genero + "\n"
                                + "Duración: " + cancionencontrada.Duracion.toString() + " minutos");

                        Toast.makeText(getApplicationContext(), "Encontrada" ,Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        lbMostrarCancion.setText("Nombre de la canción: -" + "\n"
                                + "Autor: -" + "\n"
                                + "Género: -" + "\n"
                                + "Duración: - minutos");
                        Toast.makeText(getApplicationContext(), "No existe",Toast.LENGTH_LONG).show();
                    }

                }catch (Exception ex){

                    Toast.makeText(getApplicationContext(), "Ocurrió un error" + ex, Toast.LENGTH_LONG).show();
                }
            }
        });

        btnNueva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent CrearPlaylist = new Intent(getApplicationContext(), NuevaPlaylist.class);

                startActivity(CrearPlaylist);

            }
        });

    }


}

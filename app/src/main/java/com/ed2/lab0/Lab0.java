package com.ed2.lab0;

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
    TextView lbBuscar;
    EditText tbxBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lab0);

        btnBuscar = (Button) findViewById(R.id.btn1);
        lbBuscar = (TextView) findViewById(R.id.lb1);
        tbxBuscar = (EditText) findViewById(R.id.tbx1);
        final HashMap<String, cancion> diccionario = new HashMap<String, cancion>();
        final cancion nuevaCancion = null;

        diccionario.put("When I'm gone", new cancion("When I'm gone","EMINEM", "Rap/Hip-Hop"));
        diccionario.put("99 problems", new cancion("99 problems","Jay Z", "Rap/Hip-Hop"));
        diccionario.put("Lose yourself", new cancion("Lose yourself","EMINEM", "Rap/Hip-Hop"));
        diccionario.put("Suga suga", new cancion("Suga suga","Baby Bash", "Rap/Hip-Hop"));
        diccionario.put("In da club", new cancion("In da club","50 cent", "Rap/Hip-Hop"));


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
                        Toast.makeText(getApplicationContext(), cancionencontrada.Artista ,Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "No existe",Toast.LENGTH_LONG).show();
                    }

                }catch (Exception ex){

                }
            }
        });

    }


}

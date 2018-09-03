package com.ed2.lab0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        HashMap<String, cancion> diccionario = new HashMap<String, cancion>();
        cancion nuevaCancion = null;

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Mensaje", Toast.LENGTH_LONG).show();
                lbBuscar.setText(tbxBuscar.getText());
            }
        });

    }


}

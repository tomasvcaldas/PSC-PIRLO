package com.example.utilizador.pirloit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class criarEvento extends AppCompatActivity {
    TextView campo;
    TextView hora;
    MenuCampos campos;
    MenuHora horas;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_evento);

        campo = (TextView) findViewById(R.id.campo);
        hora = (TextView) findViewById(R.id.hora);
        campos = new MenuCampos();
        horas = new MenuHora();



        Button menu = (Button) findViewById(R.id.button5);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                campos.show(getFragmentManager(), "seleciona_campo");
            }
        });

        Button menuHora = (Button) findViewById(R.id.button);
        menuHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                horas.show(getFragmentManager(), "seleciona_hora");
            }
        });

        switch(MenuCampos.getTest()){
            case 0:
                campo.setText("PAVILHAO");
                break;
            case 1:
                campo.setText("ipp");
                break;
            case 2:
                campo.setText("fadeup");
                break;
            case 3:
                campo.setText("dragao");
                break;
        }

    }

    /*public void onClick1 (View v){
        campos.show(getFragmentManager(), "seleciona_campo");
    }*/



}

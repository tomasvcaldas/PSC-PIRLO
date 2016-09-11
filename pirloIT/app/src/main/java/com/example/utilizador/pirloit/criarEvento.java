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

    MenuCampos campos;
    MenuHora horas;
    Button futsal;
    Button volleyball;
    Button basketball;
    static int escolha;
    static boolean pressed;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_evento);
        pressed = false;


        campos = new MenuCampos();
        horas = new MenuHora();
        futsal = (Button) findViewById(R.id.button2);
        volleyball = (Button) findViewById(R.id.button3);
        basketball = (Button) findViewById(R.id.button4);


        Button menu = (Button) findViewById(R.id.button5);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                campos.show(getFragmentManager(),"seleciona_campo");

            }
        });

        Button menuHora = (Button) findViewById(R.id.button);
        menuHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                horas.show(getFragmentManager(), "seleciona_hora");
            }
        });

    }

    public void onClick1 (View v1){
        escolha = 1;
        pressed  = true;
        Intent futebol = new Intent(criarEvento.this,escolherEvento.class);
        startActivity(futebol);
    }

    public void onClick2 (View v2){
        escolha = 2;
        pressed = true;
        Intent volley = new Intent(criarEvento.this,escolherEvento.class);
        startActivity(volley);
    }

    public void onClick3 (View v3){
        escolha = 3;
        pressed = true;
        Intent basket = new Intent(criarEvento.this,escolherEvento.class);
        startActivity(basket);
    }


    public static int getEscolha(){
        return escolha;
    }
    public static void setEscolha(int novo){
        escolha = novo;
    }

    public static boolean getPressed(){
        return pressed;
    }

    public static void setPressed(boolean novo){
        pressed = novo;
    }
}

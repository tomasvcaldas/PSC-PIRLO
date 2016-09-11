package com.example.utilizador.pirloit;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class escolherEvento extends AppCompatActivity {

    Button moreFutebol1;
    Button moreFutebol2;
    Button moreVolley;
    Button moreVolley2;
    Button moreBasket;
    static Button newButton;

    static ImageView imagem;
    static TextView titulo;
    static ScrollView nova;
    static TextView hora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher_evento);
        moreFutebol1 = (Button) findViewById(R.id.mais);
        moreFutebol2 = (Button) findViewById(R.id.mais2);
        moreVolley = (Button) findViewById(R.id.mais3);
        moreVolley2 = (Button) findViewById(R.id.mais4);
        moreBasket = (Button) findViewById(R.id.mais5);
        newButton = (Button) findViewById(R.id.mais6);
        nova = (ScrollView) findViewById(R.id.scrollView);

        imagem  = (ImageView) findViewById(R.id.newImage);
        titulo = (TextView) findViewById(R.id.titulo);
        hora = (TextView) findViewById(R.id.horaid);



        if(criarEvento.getPressed() == true){
            newButton.setVisibility(View.VISIBLE);
        }
        else newButton.setVisibility(View.GONE);

        switch(criarEvento.getEscolha()){
            case 1:
                imagem.setImageResource(R.drawable.football);
                break;
            case 2:
                imagem.setImageResource(R.drawable.volleyball);
                break;
            case 3:
                imagem.setImageResource(R.drawable.basketball);
                break;
            case 21:
                imagem.setImageDrawable(null);
                break;
        }

        switch(MenuCampos.getTest()){
            case 1:
                titulo.setText("PAVILHÃO LUIS FALCÃO");
                break;
            case 2:
                titulo.setText("CAMPO IPP");
                break;
            case 3:
                titulo.setText("CAMPO DA FADEUP");
                break;
            case 4:
                titulo.setText("DRAGÃO CAIXA");
                break;
            case 0:
                titulo.setText("");
                break;
        }

        switch (MenuHora.getHora()){
            case 10:
                hora.setText("10:00-11:00");
                break;

            case 11:
                hora.setText("11:00-12:00");
                break;

            case 12:
                hora.setText("12:00-13:00");
                break;

            case 13:
                hora.setText("13:00-14:00");
                break;

            case 14:
                hora.setText("14:00-15:00");
                break;

            case 15:
                hora.setText("15:00-16:00");
                break;

            case 16:
                hora.setText("16:00-17:00");
                break;

            case 17:
                hora.setText("17:00-18:00");
                break;
            case 18:
                hora.setText("18:00-19:00");
                break;

            case 19:
                hora.setText("19:00-20:00");
                break;

            case 20:
                hora.setText("20:00-21:00");
                break;
            case 21:
                hora.setText("");
                break;
        }

    }

    public void onClick1 (View v){
        Intent futebol1 = new Intent(escolherEvento.this,inscreverFutebol.class);
        startActivity(futebol1);
    }

    public void moreFutebol2 (View v1){
        Intent futebol2 = new Intent(escolherEvento.this,inscreverFutebol2.class);
        startActivity(futebol2);
    }

    public void moreVolley (View v2){
        Intent futebol3 = new Intent(escolherEvento.this,inscreverVolley.class);
        startActivity(futebol3);
    }

    public void moreVolley2 (View v3){
        Intent futebol4 = new Intent(escolherEvento.this,inscreverVolley2.class);
        startActivity(futebol4);

    }

    public void moreBasket (View v4){
        Intent futebol5 = new Intent(escolherEvento.this,inscreverBasket.class);
        startActivity(futebol5);
    }





}

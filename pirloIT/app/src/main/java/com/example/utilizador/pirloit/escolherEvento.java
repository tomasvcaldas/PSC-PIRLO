package com.example.utilizador.pirloit;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class escolherEvento extends AppCompatActivity {

    Button moreFutebol1;
    Button moreFutebol2;
    Button moreVolley;
    Button moreVolley2;
    Button moreBasket;

    static ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher_evento);
        moreFutebol1 = (Button) findViewById(R.id.mais);
        moreFutebol2 = (Button) findViewById(R.id.mais2);
        moreVolley = (Button) findViewById(R.id.mais3);
        moreVolley2 = (Button) findViewById(R.id.mais4);
        moreBasket = (Button) findViewById(R.id.mais5);

        imagem  = (ImageView) findViewById(R.id.newImage);



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

    public static void setImagem(){
        imagem.setImageResource(R.drawable.basketball);
    }



}

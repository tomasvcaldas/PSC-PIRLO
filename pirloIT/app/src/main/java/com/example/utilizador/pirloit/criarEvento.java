package com.example.utilizador.pirloit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class criarEvento extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_evento);



        Button confirmaCriar = (Button) findViewById(R.id.confirmaCriar);
        confirmaCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent confirmaCriarIntent = new Intent(criarEvento.this,EventoConfirmado.class);
                startActivity(confirmaCriarIntent);
            }
        });


        Button menu = (Button) findViewById(R.id.button5);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MenuCampos campo = new MenuCampos();
                campo.show(getFragmentManager(), "seleciona_campo");
            }
        });

    }

}

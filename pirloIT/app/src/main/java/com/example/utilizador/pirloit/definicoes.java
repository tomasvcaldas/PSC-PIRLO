package com.example.utilizador.pirloit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class definicoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definicoes);

        Button limpar = (Button) findViewById(R.id.limpar);
        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*criarEvento.setPressed(false);
                MenuCampos.setTest(0);
                MenuHora.setHora(0);
                criarEvento.setEscolha(0);
                escolherEvento.newButton.setVisibility(View.GONE);*/

            }
        });

    }


}

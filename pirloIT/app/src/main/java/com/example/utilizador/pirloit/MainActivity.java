package com.example.utilizador.pirloit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button inscreverActivity = (Button) findViewById(R.id.inscreverEvento);
        inscreverActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inscreverIntent = new Intent(MainActivity.this,escolherEvento.class);
                startActivity(inscreverIntent);
            }
        });

        Button criarActivity = (Button) findViewById(R.id.criarEvento);
        criarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent criarIntent = new Intent(MainActivity.this,criarEvento.class);
                startActivity(criarIntent);
            }
        });

        Button confirmaCriar = (Button) findViewById(R.id.defs);
        confirmaCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent defsIntent = new Intent(MainActivity.this,definicoes.class);
                startActivity(defsIntent);*/
                criarEvento.setPressed(false);
                MenuCampos.setTest(0);
                MenuHora.setHora(0);
                criarEvento.setEscolha(0);
                escolherEvento.newButton.setVisibility(View.GONE);

            }
        });

    }
}

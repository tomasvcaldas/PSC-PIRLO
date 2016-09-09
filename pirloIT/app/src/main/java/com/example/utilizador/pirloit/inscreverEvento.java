package com.example.utilizador.pirloit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inscreverEvento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscrever_evento);

        Button backInscrever = (Button) findViewById(R.id.backInscrever);
        backInscrever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backInscreverIntent = new Intent(inscreverEvento.this,MainActivity.class);
                startActivity(backInscreverIntent);
            }
        });
    }
}

package com.example.utilizador.pirloit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EventoConfirmado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento_confirmado);


    Button confirmado = (Button) findViewById(R.id.button4);
    confirmado.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent confirmadoIntent = new Intent(EventoConfirmado.this,MainActivity.class);
            startActivity(confirmadoIntent);
        }

    });
}
}
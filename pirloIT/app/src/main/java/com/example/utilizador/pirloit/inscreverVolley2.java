package com.example.utilizador.pirloit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class inscreverVolley2 extends AppCompatActivity {
    TextView output;
    Button increase;
    Button decrease;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscrever_volley2);
        increase = (Button) findViewById(R.id.ins);
        decrease = (Button) findViewById(R.id.des);

        output = (TextView) findViewById(R.id.output);
    }

    public void increase (View v) {
        int currentNumber  = Integer.parseInt(output.getText().toString());
        if(currentNumber == 12) {}
        else output.setText(currentNumber + 1 + "");
    }
    public void decrease (View v) {
        int currentNumber  = Integer.parseInt(output.getText().toString());
        if(currentNumber == 0) {} else output.setText(currentNumber - 1 + "");
    }



}
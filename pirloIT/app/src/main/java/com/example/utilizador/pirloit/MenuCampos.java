package com.example.utilizador.pirloit;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Morango on 10/09/2016.
 */
public class MenuCampos extends DialogFragment {
    final CharSequence[] items  = {"Pavilhao Luis Falcao",
    "Campo do IPP",
    "Campo da FADEUP",
    "Dragao Caixa"};

    String selection;
    String name;
    boolean ok = false;
    static int test;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Selecionar Campo").setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                switch (i) {
                    case 0: {
                        selection = (String) items[i];
                        test = 0;
                        break;
                    }
                    case 1: {
                        selection = (String) items[i];
                        test = 1;
                        break;
                    }
                    case 2: {
                        selection = (String) items[i];
                        test = 2;
                        break;
                    }
                    case 3: {
                        selection = (String) items[i];
                        test = 3;
                        break;
                    }
                }
            }
        }).setPositiveButton("OK" , new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int wich){
                ok = true;
                Toast.makeText(getActivity(), "Campo Selecionado : " + selection , Toast.LENGTH_LONG).show();
                if(selection.equals("Pavilhao Luis Falcao"))
                    name = "Pavilhao Luis Falcao";
                else if(selection.equals("Campo do IPP"))
                    name = "Campo do IPP";
                else if(selection.equals("Campo da FADEUP"))
                    name = "Campo da FADEUP";
                else if(selection.equals("Dragao Caixa"))
                    name = "Dragao Caixa";

            }
        });


        return builder.create();
    }

    public String getSelection(){
        return selection;
    }

    public String getName(){
        return name;
    }

    public boolean getOk(){
        return ok;
    }

    public static int getTest(){
        return test;
    }
}

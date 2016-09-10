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
    "Campo da FADEP",
    "Dragao Caixa"};

    String selection;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Selecionar Campo").setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                switch (i){
                    case 0:
                        selection = (String) items[i];

                        break;

                    case 1:
                        selection = (String) items[i];

                        break;

                    case 2:
                        selection = (String) items[i];

                        break;

                    case 3:
                        selection = (String) items[i];

                        break;
                }

            }
        }).setPositiveButton("OK" , new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int wich){
                Toast.makeText(getActivity(), "Campo Selecionado : " + selection , Toast.LENGTH_LONG).show();

            }
        });


        return builder.create();
    }
}

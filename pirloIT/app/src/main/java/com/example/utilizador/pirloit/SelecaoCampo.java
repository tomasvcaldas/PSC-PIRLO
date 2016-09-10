package com.example.utilizador.pirloit;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Morango on 10/09/2016.
 */
public class SelecaoCampo extends DialogFragment {

    ArrayList<String> list = new ArrayList<String>();

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] items = getResources().getStringArray(R.array.campo_selection);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Escolha o campo").setMultiChoiceItems(R.array.campo_selection, null, new DialogInterface.OnMultiChoiceClickListener() {

            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {

                if (b) {
                    list.add(items[i]);
                } else if (list.contains(items[i])) {
                    list.remove(items[i]);
                }

            }


        }).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String selections = "";
                for(String ms  : list)
                {
                    selections = selections + "\n" + ms;
                }
                Toast.makeText(getActivity(), "Campo Selecionado: " + selections, Toast.LENGTH_SHORT).show();


            }
        });

        return builder.create();
    }
}


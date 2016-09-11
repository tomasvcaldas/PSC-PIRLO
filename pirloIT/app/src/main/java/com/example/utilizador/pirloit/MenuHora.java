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
public class MenuHora extends DialogFragment {
    final CharSequence[] items  = {"10",
            "11",
            "12",
            "13",
    "14",
    "15",
    "16",
    "17",
    "18",
    "19",
    "20"};

    String selection;
    String time;
    boolean ok = false;

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

                    case 4:
                        selection = (String) items[i];

                        break;

                    case 5:
                        selection = (String) items[i];

                        break;

                    case 6:
                        selection = (String) items[i];

                        break;

                    case 7:
                        selection = (String) items[i];

                        break;

                    case 8:
                        selection = (String) items[i];

                        break;

                    case 9:
                        selection = (String) items[i];

                        break;

                    case 10:
                        selection = (String) items[i];

                        break;
                }

            }
        }).setPositiveButton("OK" , new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int wich){
                ok = true;
                Toast.makeText(getActivity(), "Hora Selecionada : " + selection , Toast.LENGTH_LONG).show();
                if(selection == "0")
                    time = "10";
                else if(selection == "1")
                    time = "11";
                else if(selection == "2")
                    time = "12";
                else if(selection == "3")
                    time = "13";
                else if(selection == "4")
                    time = "14";
                else if(selection == "5")
                    time = "15";
                else if(selection == "6")
                    time = "16";
                else if(selection == "7")
                    time = "17";
                else if(selection == "8")
                    time = "18";
                else if(selection == "9")
                    time = "19";
                else
                    time = "20";


            }
        });


        return builder.create();
    }

    public String getTime(){
        return time;
    }

    public boolean getOk(){
        return ok;
    }

}
package com.hugoguillin.dialogforalert;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder miAlerta = new AlertDialog.Builder(MainActivity.this);
        miAlerta.setTitle(R.string.alerta_titulo);
        miAlerta.setMessage(R.string.alerta_mensaje);
        miAlerta.setPositiveButton(R.string.boton_ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Botón OK pulsado",
                        Toast.LENGTH_SHORT).show();
            }
        });
        miAlerta.setNegativeButton(R.string.boton_cancelar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Botón Cancelar pulsado",
                        Toast.LENGTH_SHORT).show();
            }
        });
        miAlerta.show();
    }
}

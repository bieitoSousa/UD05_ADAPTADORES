package com.bieito_sousa.Ud04_Spinners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class UD04_04_Spinners extends AppCompatActivity {
    String datos[];
    int[] imagenes;

    private void cargarLista(){
        datos = getResources().getStringArray(R.array.planetas_spinner);
        imagenes = new int[datos.length];
        for(int cont=0;cont<datos.length;cont++){
            imagenes[cont]=R.drawable.icon_ok;
        }
        // Spinner lista = findViewById(R.id.txtTexto_UD04_04_Spinners);
        Spinner lista = findViewById(R.id.spnLista_UD04_04_Spinner);
        Adaptador_UD04_04_Spinner miAdaptador = new Adaptador_UD04_04_Spinner(this,this.imagenes,this.datos);
        lista.setAdapter(miAdaptador);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_d04_04__spinners);
        cargarLista();
    }
}
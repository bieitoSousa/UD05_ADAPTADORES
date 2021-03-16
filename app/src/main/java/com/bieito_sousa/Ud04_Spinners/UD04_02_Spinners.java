package com.bieito_sousa.Ud04_Spinners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
public class UD04_02_Spinners extends AppCompatActivity {
    private void cargarLista(){
        Spinner spinFrutas = (Spinner) findViewById(R.id.spnLista_UD04_02_Spinner);
        // Fuente de datos
        String[] frutas = new String[] { "Pera", "Manzana", "Plátano" };
        // Enlace del adaptador con los datos
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, frutas);
        // Opcional: layout usado para representar los datos en el Spinner
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Enlace del adaptador con Spinner del Layout.
        spinFrutas.setAdapter(adaptador);
        // Escuchador
        spinFrutas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                /*Toast.makeText(getBaseContext(), "Seleccionaste: " + parent.getItemAtPosition(pos),
                Toast.LENGTH_LONG).show();
                */
                Toast.makeText(getBaseContext(), "Seleccionaste: " + ((TextView) view).getText(), Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        }); // Fin da clase anónima
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_d04_02__spinners);
        cargarLista();
    }
}
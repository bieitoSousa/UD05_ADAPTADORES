package com.bieito_sousa.Ud04_Spinners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class UD04_01_Spinners extends AppCompatActivity {
    private void cargarLista() {
        Spinner lista = findViewById(R.id.spnLista_UD02_02_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        adapter.addAll(getResources().getStringArray(R.array.planetas_spinner));
        lista.setAdapter(adapter);
        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //String datoLista = (String)parent.getItemAtPosition(position);
                // Podríamos obtener el dato de esta forma (fijarse en el Cast)
                String datoLista = ((TextView) view).getText().toString(); // o de esta otra forma
                Toast.makeText(getApplicationContext(),"Elemento seleccionado:" + datoLista + " en posición "+ String.valueOf(position),Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_d04_01__spinners);
        cargarLista();
    }
}

package com.bieito_sousa.Ud04_Spinners;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class UD04_03_Spinners extends AppCompatActivity {
    private void cargarLista(){
        Spinner spinFroitas = (Spinner) findViewById(R.id.spnLista_UD04_03_Spinner);
        ArrayList<String> animais = new ArrayList<String>();
        animais.add("CABALLOS");
        animais.add("GATITOS");
        animais.add("PERROS");
        animais.add("RATONES");
        // Enlace del adaptador con los datos
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, animais);
        // Enlace del adaptador con el Spinner del Layout.
        spinFroitas.setAdapter(adaptador);
        // Escuchador
        spinFroitas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                //Toast.makeText(getBaseContext(), "Seleccionaches: " + parent.getItemAtPosition(pos),Toast.LENGTH_LONG).show();
                Toast.makeText(getBaseContext(), "Seleccionaste: " + ((TextView) view).getText(), Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        }); // Fin de la clase anónima
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_d04_03__spinners);
        cargarLista();
    }

}

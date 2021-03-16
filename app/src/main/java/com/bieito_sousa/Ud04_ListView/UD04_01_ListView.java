package com.bieito_sousa.Ud04_ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bieito_sousa.Ud04_Spinners.R;

public class UD04_01_ListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_d04_01_list_view);
        ListView lvFrutas = (ListView) findViewById(R.id.lv_frutas);
        //Fuente de datos
        String[] frutas = new String[] { "Pera", "Manzana", "Plátano" };
        //Enlace del adaptador con la fuente de datos
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.
                R.layout.simple_list_item_1, frutas);
        //Enlace del adaptador con ListView
        lvFrutas.setAdapter(adaptador);
        //Escuchador
        lvFrutas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // TODO Auto-generated method stub
        //Toast.makeText(getBaseContext(), "Seleccionaches: " + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), "Seleccionaste: " + ((TextView) view).getText(), Toast.
                        LENGTH_SHORT).show();
            }
        });
    }
}
package com.bieito_sousa.Ud04_Spinners;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Adaptador_UD04_04_Spinner extends ArrayAdapter {
    int[] imagenes; // Lista de imagenes a cargar. Recordar que en res todo son números Se fueran url podríamos cambiarlo por String[]
    String[] textos;
    Context mContext;
    public Adaptador_UD04_04_Spinner(@NonNull Context context, int resource) {
        super(context, R.layout.activity_u_d04_04__spinners);
        this.imagenes = imagenes;
        this.textos = textos;
        this.mContext = context;
    }

    public Adaptador_UD04_04_Spinner(@NonNull Context context, int[] imagenes, String[] datos) {
        super(context, R.layout.activity_u_d04_04__spinners);
        this.imagenes = imagenes;
        this.textos = datos;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return textos.length; // Podríamos poner también el número de imágenes.
    }
    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getView(position,convertView,parent);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.activity_u_d04_04__spinners, parent, false);
        }
        ((ImageView)convertView.findViewById(R.id.imgVImaxen_UD04_04_Spinners)).setImageResource(imagenes[position]);
        ((TextView) convertView.findViewById(R.id.txtTexto_UD04_04_Spinners)).setText(textos[position]);
        return convertView;



    }
}

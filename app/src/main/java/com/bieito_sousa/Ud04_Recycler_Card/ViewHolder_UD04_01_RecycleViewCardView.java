package com.bieito_sousa.Ud04_Recycler_Card;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bieito_sousa.Ud04_Spinners.R;

public class ViewHolder_UD04_01_RecycleViewCardView extends RecyclerView.ViewHolder {
    public ImageView itemImagen;
    public TextView itemTexto;
    public ViewHolder_UD04_01_RecycleViewCardView(@NonNull View itemView) {
        super(itemView);
        itemImagen = itemView.findViewById(R.id.imgImaxe_UD04_01_CardLayout);
        itemTexto = itemView.findViewById(R.id.tvTexto_UD04_01_CardView);
        itemImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Planeta_UD04_01_RecycleViewCardView planetaSeleccionado = (Planeta_UD04_01_RecycleViewCardView) v.getTag();
                Toast.makeText(v.getContext(), "Pulsado elemento " + getAdapterPosition() + " de la lista.",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}

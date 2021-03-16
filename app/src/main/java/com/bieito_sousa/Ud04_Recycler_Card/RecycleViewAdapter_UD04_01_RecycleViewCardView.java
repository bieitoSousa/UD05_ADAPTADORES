package com.bieito_sousa.Ud04_Recycler_Card;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bieito_sousa.Ud04_Spinners.R;

import java.util.ArrayList;

public class RecycleViewAdapter_UD04_01_RecycleViewCardView extends RecyclerView.Adapter {
    private ArrayList<Planeta_UD04_01_RecycleViewCardView> planetas
            = new ArrayList<Planeta_UD04_01_RecycleViewCardView>();
    public RecycleViewAdapter_UD04_01_RecycleViewCardView(
            ArrayList<Planeta_UD04_01_RecycleViewCardView>planetas){
        this.planetas = planetas;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater mInflater = (LayoutInflater) viewGroup.getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//View view = (LayoutInflater.from(viewGroup.getContext()))
        View v = mInflater.inflate(R.layout.card_layout_ud04_01_recycleviewcardview, viewGroup,
                false);
        RecyclerView.ViewHolder viewHolder = new ViewHolder_UD04_01_RecycleViewCardView(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder_UD04_01_RecycleViewCardView viewHolderMeu = (ViewHolder_UD04_01_RecycleViewCardView) viewHolder;
        viewHolderMeu.itemView.setTag(planetas.get(i));
        viewHolderMeu.itemImagen.setImageResource(planetas.get(i).getFotoId());
        viewHolderMeu.itemTexto.setText(planetas.get(i).getNombre());
    }
    @Override
    public int getItemCount() {
        return planetas.size();
    }
}
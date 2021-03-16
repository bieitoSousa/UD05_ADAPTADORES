package com.bieito_sousa.Ud04_Recycler_Card;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;

import com.bieito_sousa.Ud04_Spinners.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
public class UD04_01_RecycleViewCardView extends AppCompatActivity {
    private RecycleViewAdapter_UD04_01_RecycleViewCardView recycleAdapter;
    private ArrayList<Planeta_UD04_01_RecycleViewCardView> planetas;
    private void inicializarDatosPlanetas(){
        planetas = new ArrayList<>();
        planetas.add(new Planeta_UD04_01_RecycleViewCardView(1,"MERCURIO",false, R.drawable.mercurio));
        planetas.add(new Planeta_UD04_01_RecycleViewCardView(2,"VENUS",false,R.drawable.venus));
        planetas.add(new Planeta_UD04_01_RecycleViewCardView(3,"TIERRA",false,R.drawable.tierra));
        planetas.add(new Planeta_UD04_01_RecycleViewCardView(4,"JUPITER",false,R.drawable.jupiter));
        planetas.add(new Planeta_UD04_01_RecycleViewCardView(5,"SATURNO",false,R.drawable.saturno));
    }
    private void inicializarRecycleView(){
        recycleAdapter = new RecycleViewAdapter_UD04_01_RecycleViewCardView(planetas);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = findViewById(R.id.rvwRecycleView);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recycleAdapter);
    }
    private void xestionarEventos(){
        FloatingActionButton fab = findViewById(R.id.fabAdd_ud04_01_recyclecardview);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                planetas.add(new Planeta_UD04_01_RecycleViewCardView(6,"URANO",false,R.drawable.urano));
                recycleAdapter.notifyItemInserted(planetas.size());
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_d04_01_recycle_view_card_view);
        inicializarDatosPlanetas();
        inicializarRecycleView();
        xestionarEventos();
    }
}
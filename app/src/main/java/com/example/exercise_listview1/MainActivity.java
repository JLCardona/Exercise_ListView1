package com.example.exercise_listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listViewItems;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewItems = findViewById(R.id.listView);
        adaptador = new Adaptador(getArrayItems(), this);
        listViewItems.setAdapter(adaptador);


    }

    private ArrayList<Entidad> getArrayItems(){

        ArrayList<Entidad> listaItems = new ArrayList<>();
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Piña"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Tomates"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Papel"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Refrescos"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Patatas"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Huevos"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Limones"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Lechuga"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Arroz"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Garbanzos"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Carne"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Pescado"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Marisco"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Aperitivos"));

        return listaItems;

    }


}
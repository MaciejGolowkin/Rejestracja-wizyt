package com.example.maciek.rejestracjawizyt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recyclerViewkawy)
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        ArrayList<Lekarz> Lekarze_List = new ArrayList<>();
        Lekarze_List.add(new Lekarz("Maciej Młynarz","Dermatolog"));
        Lekarze_List.add(new Lekarz("Maciej Paprykarz","Rodzinny"));
        Lekarze_List.add(new Lekarz("Maciej Dekarz","Rodzinny"));
        Lekarze_List.add(new Lekarz("Maciej Tapeciarz","Rodzinny"));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        LekaAdapter placeAdapter = new LekaAdapter(Lekarze_List);
        recyclerView.setAdapter(placeAdapter);
    }

}

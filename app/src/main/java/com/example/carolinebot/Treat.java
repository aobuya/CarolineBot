package com.example.carolinebot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Treat extends AppCompatActivity {
    List<Diseases> productList;


    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treat);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //getting the recyclerview from xml
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Diseases(
                        1,
                        "Rashes",
                        "There are many differnt kinds of rash. Thay have a variety of causes such as diseases, allergies and fungal infections.",
                        "Very Common",
                        "High",
                        R.drawable.treat));

        productList.add(
                new Diseases(
                        1,
                        "Common Cold",
                        "Colds are minor infections of the nose and throat caused by more that 200 different viruses",
                        "Very Common",
                        "High",
                        R.drawable.treat));

        productList.add(
                new Diseases(
                        1,
                        "Fever",
                        "When should you call a doctor? Learn more from Caroline about the causes, symptoms, and treatments for fever.",
                        "Very Common",
                        "High",
                        R.drawable.treat));

        //creating recyclerview adapter
        DiseasesAdapter adapter = new DiseasesAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }

}

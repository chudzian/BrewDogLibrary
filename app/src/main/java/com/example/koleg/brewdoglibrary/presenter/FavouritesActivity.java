package com.example.koleg.brewdoglibrary.presenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.koleg.brewdoglibrary.R;
import com.example.koleg.brewdoglibrary.model.Beer;
import com.example.koleg.brewdoglibrary.model.BeerDAO;
import com.example.koleg.brewdoglibrary.utils.BeerRecyclerViewAdapter;

import java.util.List;

public class FavouritesActivity extends AppCompatActivity{
    private RecyclerView recyclerView;
    private BeerRecyclerViewAdapter beerRecyclerViewAdapter;
    private LinearLayoutManager linearLayoutManager;
    private List<Beer> beerList;
    private BeerDAO beerDAO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        beerDAO = new BeerDAO();
        beerList = beerDAO.getAllBeers();

        setUpRecyclerViewAndAdapter();




    }



    private void setUpRecyclerViewAndAdapter() {
        recyclerView = findViewById(R.id.favouritesRecyclerViewID);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        beerRecyclerViewAdapter = new BeerRecyclerViewAdapter(beerList, this);
        recyclerView.setAdapter(beerRecyclerViewAdapter);
    }
}

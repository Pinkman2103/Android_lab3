package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Auto> brands = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        DataAdapter adapter = new DataAdapter(this, brands);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData(){
        brands.add(new Auto("BMW", "X6", R.drawable.x6));
        brands.add(new Auto("Mercedes", "GLE", R.drawable.gle));
        brands.add(new Auto("Lada", "21099", R.drawable.lada));
        brands.add(new Auto("Mazda", "CX5", R.drawable.cx5));
        brands.add(new Auto("Volkswagen", "Passat-B7", R.drawable.b7));
    }
}
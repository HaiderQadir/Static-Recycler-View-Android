package com.example.staticrecyclerview01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.staticrecyclerview01.R;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.rcl);
        rv.setLayoutManager(new LinearLayoutManager(this));

        String countriesListA[] = {"Pakistan", "Australia", "Denmark", "England", "Russia", "New Zealand", "Finland", "Iceland", "USA", "UAE"+
                "Pakistan", "Australia", "Denmark", "England", "Russia", "New Zealand", "Finland", "Iceland", "USA", "UAE"+
                "Pakistan", "Australia", "Denmark", "England", "Russia", "New Zealand", "Finland", "Iceland", "USA", "UAE"};
        String countriesListB[] = {"Pakistan", "Australia", "Denmark", "England", "Russia", "New Zealand", "Finland", "Iceland", "USA", "UAE"+
                "Pakistan", "Australia", "Denmark", "England", "Russia", "New Zealand", "Finland", "Iceland", "USA", "UAE"+
                "Pakistan", "Australia", "Denmark", "England", "Russia", "New Zealand", "Finland", "Iceland", "USA", "UAE"};

        rv.setAdapter(new AdapterClass(countriesListA, countriesListB));



    }
}
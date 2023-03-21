package com.example.home_work_three;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.home_work_three.RecicleView.UsersAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> list;
    UsersAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
    }

    private void initList() {
        list = new ArrayList<>();
        list.add("Alex");
        list.add("Michael");
        list.add("Vector");
        list.add("Maik");
        list.add("Trevor");
        list.add("Layla");
        list.add("Fedor");
        list.add("Sasha");
        list.add("Alexsandr");
        list.add("Alexsey");

        adapter = new UsersAdapter(list);
        recyclerView = findViewById(R.id.recycle_view);
        recyclerView.setAdapter(adapter);


    }
}
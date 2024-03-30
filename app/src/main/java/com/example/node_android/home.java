package com.example.node_android;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Sample data for RecyclerView
        List<String> dataList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            dataList.add("Item " + i);
        }

        // Finding RecyclerView from layout
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Set layout manager for RecyclerView
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        // Create and set adapter for RecyclerView
        YourAdapter adapter = new YourAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }
}

package com.example.androgin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SingerAdapter singerAdapter;
    private List<SingerModel> singerModelList;
    private Button addBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        initializeList();
        setRecyclerView();
        addBtn = findViewById(R.id.btn_Add);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                singerModelList.add(new SingerModel("Rihanna","Umbrella"));
                singerAdapter.notifyItemRangeInserted(singerModelList.size() - 1, singerModelList.size());
            }
        });

    }



    private  void  initializeList(){
        singerModelList = new ArrayList<>();
        singerModelList.add(new SingerModel("Post Malone", "Rockstar"));
        singerModelList.add(new SingerModel("Drake", "God's plan"));
        singerModelList.add(new SingerModel("The Weeknd", "Sidewalks"));
    }

    private void setRecyclerView(){
        singerAdapter = new SingerAdapter(singerModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(singerAdapter);
    }

    private void initializeViews(){
        recyclerView = findViewById(R.id.rv_mainActivity);
    }

}
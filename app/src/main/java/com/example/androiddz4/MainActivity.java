package com.example.androiddz4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity /*implements Adapter.onClick*/ {
   /* private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> list = new ArrayList<>();*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
      /*  initRecyclerView();
        fillingList();*/

    }

/*
    private void fillingList() {
        list.add(new Model(getString(R.string.one),getString(R.string.Blank_Space),getString(R.string.Taylor_Swift),getString(R.string.time_1)));
        list.add(new Model(getString(R.string.two),getString(R.string.Watch_Me),getString(R.string.Silento),getString(R.string.time_2)));
        list.add(new Model(getString(R.string.three),getString(R.string.Earned_It),getString(R.string.The_Weekend),getString(R.string.time_3)));
        list.add(new Model(getString(R.string.four),getString(R.string.The_Hills),getString(R.string.The_Weekend),getString(R.string.time_4)));
        list.add(new Model(getString(R.string.five),getString(R.string.Writings_On_The_Wall),getString(R.string.Sam_Smith),getString(R.string.time_5)));

    }
*/

/*
    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new Adapter();
        adapter.updateData(list,this);
        recyclerView.setAdapter(adapter);
    }
*/

    private void initFragment() {
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_1, new FragmentOne()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_2, new FragmentTwo()).commit();
    }

   /* @Override
    public void onItemClick(Model model) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("key",model.getMusicName());
        startActivity(intent);

    }*/
}
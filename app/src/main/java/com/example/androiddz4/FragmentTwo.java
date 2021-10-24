package com.example.androiddz4;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentTwo extends Fragment implements Adapter.onClick {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_two, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fillingList();
        initRecyclerView(view);
    }

    private void initRecyclerView(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
        adapter = new Adapter();
        adapter.updateData(list,this);
        recyclerView.setAdapter(adapter);
    }

    private void fillingList() {
        list.add(new Model(1,getString(R.string.Blank_Space),getString(R.string.Taylor_Swift),getString(R.string.time_1)));
        list.add(new Model(2,getString(R.string.Watch_Me),getString(R.string.Silento),getString(R.string.time_2)));
        list.add(new Model(3,getString(R.string.Earned_It),getString(R.string.The_Weekend),getString(R.string.time_3)));
        list.add(new Model(4,getString(R.string.The_Hills),getString(R.string.The_Weekend),getString(R.string.time_4)));
        list.add(new Model(5,getString(R.string.Writings_On_The_Wall),getString(R.string.Sam_Smith),getString(R.string.time_5)));
    }




    @Override
    public void onItemClick(Model model) {
        Intent intent = new Intent(getActivity(),SecondActivity.class);
        intent.putExtra("key",model.getMusicName());
        startActivity(intent);
    }
}
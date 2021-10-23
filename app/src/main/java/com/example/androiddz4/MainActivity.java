package com.example.androiddz4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_1,new FragmentOne()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_2,new FragmentTwo()).commit();
    }
}
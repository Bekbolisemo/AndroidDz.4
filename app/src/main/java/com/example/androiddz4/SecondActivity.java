package com.example.androiddz4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        intent();
    }

    private void intent() {
        String textExtra =getIntent().getStringExtra("key");
        text.setText(textExtra);
    }

    private void initView() {
        text = findViewById(R.id.second_text);
    }
}
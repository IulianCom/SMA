package com.example.temasma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private String extraInfo;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        extraInfo = intent.getStringExtra("key1");
        textView=findViewById(R.id.tv_main_text_view);
        textView.setText(extraInfo);
    }
}
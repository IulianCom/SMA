package com.example.temasma;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mainBtn;
    private Button okBtn;
    private Button cancelBtn;
    private Button emptyActivityBtn;
    private RelativeLayout rv;
    private EditText rv_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        emptyActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rv.setVisibility(View.VISIBLE);
            }
        });

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = rv_et.getText().toString();
                if (!text.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                    intent.putExtra("key1", text);
                    startActivity(intent);
                    rv.setVisibility(View.INVISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "There is no text", Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Canceled", Toast.LENGTH_SHORT).show();
                rv.setVisibility(View.INVISIBLE);
            }
        });
    }

    private void initializeViews() {
        mainBtn = findViewById(R.id.dialog_button);
        rv = findViewById(R.id.hidden_rv);
        rv_et = findViewById(R.id.main_et);
        okBtn = findViewById(R.id.ok_btn);
        cancelBtn = findViewById(R.id.cancel_btn);
        emptyActivityBtn = findViewById(R.id.btn_empty_activity);
    }

}

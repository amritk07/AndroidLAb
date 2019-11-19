package com.example.exp6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {


    TextView textView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
       textView = findViewById(R.id.textView5);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText(name);

    }
}

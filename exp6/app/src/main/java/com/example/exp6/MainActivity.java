package com.example.exp6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    Button button1,button2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
    }
    public void next(View view)
    {

        Intent intent = new Intent(this,Display.class);
        intent.putExtra("name",editText.getText().toString());
        startActivity(intent);
    }
    public void browse(View view)
    {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com/"));
        startActivity(intent);


    }
}

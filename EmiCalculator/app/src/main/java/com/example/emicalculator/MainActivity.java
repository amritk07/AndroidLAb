package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;


public  class  MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
      private EditText e1;
      private EditText e2;
      private EditText e3;
      private Spinner s1;
      String spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        s1 = findViewById(R.id.s1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.type,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(this);
    }
    public  void onItemClick()
    {

    }
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
       spinner = arg0.getItemAtPosition(position).toString();


    }


    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
    public void reset(View v)
    {


        e1.setText("");
        e2.setText("");
        e3.setText("");


    }


    public void claculate(View v)
    {

        double loan = Double.parseDouble(e1.getText().toString());
        double interest = Double.parseDouble(e2.getText().toString());
        double time = Double.parseDouble(e3.getText().toString());

        Intent intent = new Intent(this,Calculate.class);
        intent.putExtra("loan",loan);
        intent.putExtra("interest",interest);
        intent.putExtra("time",time);
        intent.putExtra("spinner",spinner);
        startActivity(intent);

    }
}

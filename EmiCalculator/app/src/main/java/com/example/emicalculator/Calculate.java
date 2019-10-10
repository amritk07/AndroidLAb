package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import static java.lang.Math.pow;
import static java.lang.Math.round;

public class Calculate extends AppCompatActivity {


    private TextView principle;
    private  TextView emi;
    private TextView type;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        type = findViewById(R.id.type);
        principle = findViewById(R.id.principle);

        emi = findViewById(R.id.emi);
        Intent in = getIntent();
        String s1 = in.getStringExtra("spinner");
        double d1 = in.getDoubleExtra("loan",0);
        double d2 = in.getDoubleExtra("interest",0);
        double d3 = in.getDoubleExtra("time",0);
         //set type of loan

          type.setText(s1);

        //set principle amount
        String principl = String.valueOf(d1);
        principle.setText("Rs"+" "+principl);
        //calculate and set EMI
        double cal_emi;
        double roi = d2/(12*100);
        d3 = d3*12;
        cal_emi=d1 * roi *pow((1+roi),d3)/(pow(1+roi,d3)-1);

        String set_emi = String.valueOf(round(cal_emi));
        emi.setText("Rs" +" "+set_emi);






    }
}

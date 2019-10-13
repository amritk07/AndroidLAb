package com.example.incometax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create references for both buttons---------
        Button cal =(Button)findViewById(R.id.button);


        //Setting up the cal Button---------
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });

    }
    private void calculate(){

        EditText Age =(EditText)findViewById(R.id.editTextAge);
        EditText Income =(EditText)findViewById(R.id.editTextIncome);
        EditText Cal =(EditText)findViewById(R.id.editTextCal);

        String personAge = Age.getText().toString();
        String personIncome = Income.getText().toString();

        //Converting String to float
        int P = Integer.parseInt(personAge);
        float I = Float.parseFloat(personIncome);
        float taxAmount = 0;
        //Calculation of Tax
        if ( P < 60){
            if (I <= 250000){
                taxAmount = I;
            }

            if (I > 250000 &&  I <= 500000){
                taxAmount = (float) (I * 0.1);
            }

            if (I > 500000 &&  I <= 1000000){
                taxAmount = (float) (I * 0.2);
            }

            if (I > 1000000){
                taxAmount = (float) (I * 0.3);
            }
        }
        else {

            if (I <= 300000){
                taxAmount = I;
            }

            if (I > 300000 &&  I <= 500000){
                taxAmount = (float) (I * 0.1);
            }

            if (I > 500000 &&  I <= 1000000){
                taxAmount = (float) (I * 0.2);
            }

            if (I > 1000000){
                taxAmount = (float) (I * 0.3);
            }

        }

        String totalCalTax = Float.toString(taxAmount);

        Cal.setText(totalCalTax);
    }
}
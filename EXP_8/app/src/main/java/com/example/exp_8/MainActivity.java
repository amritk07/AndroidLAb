package com.example.exp_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    static final String mypreference = "mypref";
    static final String Name = "namekey";
    static final String Sap = "sapkey";
    static final String Course = "coursekey";
    static final String Batch = "batchkey";


    EditText name;
    EditText sap;
    EditText course;
    EditText batch;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.edit_name);
        sap = findViewById(R.id.edit_sap);
        course= findViewById(R.id.edit_course);
        batch= findViewById(R.id.edit_batch);




    }

    public  void saveData(View v)
    {
        String name1 = name.getText().toString();
        String sap1 = sap.getText().toString();
        String course1 = course.getText().toString();
        String batch1 = batch.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Name,name1);
        editor.putString(Sap,sap1);
        editor.putString(Course,course1);
        editor.putString(Batch,batch1);
        editor.commit();
        Toast.makeText(this,"Data Saved",Toast.LENGTH_SHORT).show();



    }
    public  void displayData(View v)
    {

      sharedPreferences = getSharedPreferences(mypreference ,Context.MODE_PRIVATE);
      if(sharedPreferences.contains(Name))
      {
          name.setText(sharedPreferences.getString(Name,""));
      }
        if(sharedPreferences.contains(Sap))
        {
            sap.setText(sharedPreferences.getString(Sap,""));
        }
        if(sharedPreferences.contains(Course))
        {
            course.setText(sharedPreferences.getString(Course,""));
        }
        if(sharedPreferences.contains(Batch))
        {
            batch.setText(sharedPreferences.getString(Batch,""));
        }


    }
    public  void clearData(View v)
    {

           name.setText(" ");
           sap.setText(" ");
           course.setText(" ");
           batch.setText(" ");




    }

}

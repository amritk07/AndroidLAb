package com.example.exp_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView;
import com.example.exp_7.MyListAdapter;

public class MainActivity extends AppCompatActivity {
    ListView list;

    public String[] coutry_name ={"India","New Zealand","England","South Africa","Pakistan"};
    String[] caption_name ={"Ms Dhoni","KaneWilliamson","Eoin Morgan","Faf Du Plessis","Sarfaraz Ahmed"};

    int[] imgid={
            R.drawable.indian,R.drawable.newz,
            R.drawable.england,R.drawable.southafrica,
            R.drawable.pakistan
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    MyListAdapter adapter = new MyListAdapter(this,coutry_name,caption_name,imgid);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


    }



}


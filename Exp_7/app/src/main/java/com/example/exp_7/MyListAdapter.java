package com.example.exp_7;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.exp_7.R;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private  String[] country_name;
    private  String[] caption_name;
    private  int[] imgid;

    public MyListAdapter(Activity context, String[] country_name, String[] caption_name, int[] imgid) {
        super(context, R.layout.list_layout,country_name );
        // TODO Auto-generated constructor stub

        this.context=context;
        this.country_name=country_name;
        this.caption_name=caption_name;
        this.imgid=imgid;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_layout, null,true);

        TextView countryText = (TextView) rowView.findViewById(R.id.country_name);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView captionText = (TextView) rowView.findViewById(R.id.caption_name);

        countryText.setText(country_name[position]);
        imageView.setImageResource(imgid[position]);
        captionText.setText(caption_name[position]);

        return rowView;

    };
}
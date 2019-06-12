package com.example.tutorial03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ImageAdapter extends ArrayAdapter {

    public ImageAdapter(Context context, String[] items) {
        super(context, R.layout.image_layout, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater imageInflater = LayoutInflater.from(getContext());
        View view = imageInflater.inflate(R.layout.image_layout, parent, false);
        String item = (String) getItem(position);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        textView.setText(item);
        imageView.setImageResource(R.mipmap.ic_launcher);
        return view;
    }
}

package com.example.kinoabsolute;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kinoabsolute.R;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter <com.example.customlistview.ListData> {
    public ListAdapter(Context context, ArrayList<com.example.customlistview.ListData> dataArrayList) {
        super(context, R.layout.fragment_movie_agenda, dataArrayList);
    }
    @NonNls
    @Override
    public View getView(int position, @Nullable View view,@NonNls ViewGroup parent) {
        com.example.customlistview.ListData listData = getItem(position);

        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_movie_agenda, parent, false);
        }
        ImageView listImage = view.findViewById(R.id.listImage);
        TextView listName = view.findViewById(R.id.listName);
        TextView listTime = view.findViewById(R.id.listTime);
        listImage.setImageResource(listData.image);
        listName.setText(listData.name);
        listTime.setText(listData.time);
        return view;
    }
}
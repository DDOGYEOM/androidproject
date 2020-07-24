package com.example.androidproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class PlannerHolder extends RecyclerView.ViewHolder {
    CardView cardView;
    ImageView image;
    TextView title;
    TextView content;
    TextView date;

    public PlannerHolder(View root){
        super(root);
        cardView = root.findViewById(R.id.cardview);
        image = (ImageView)root.findViewById(R.id.icon);
        title = (TextView)root.findViewById(R.id.title);
        content = (TextView)root.findViewById(R.id.content);
        date = (TextView)root.findViewById(R.id.date);
    }

}

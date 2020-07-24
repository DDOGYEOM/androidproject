package com.example.androidproject;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlannerAdapter extends RecyclerView.Adapter<PlannerHolder>{
    Context context;
    int resId;
    ArrayList<PlannerVO> datas;
    private int cardPos = 0; //목록의 위치

    public PlannerAdapter(Context context, int resId, ArrayList<PlannerVO> datas) {
        this.context = context;
        this.resId = resId;
        this.datas = datas;
    }

    @NonNull
    @Override
    public PlannerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PlannerHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}

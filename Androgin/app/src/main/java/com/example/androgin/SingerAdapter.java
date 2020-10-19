package com.example.androgin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SingerAdapter extends RecyclerView.Adapter<SingerViewHolder> {
    private Context context;
    private List<SingerModel> singersList;

    @NonNull
    @Override
    public SingerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.activity_singer_view_holder, parent, false);
        SingerViewHolder viewHolder = new SingerViewHolder(contactView);
        return viewHolder;
    }

    public SingerAdapter(List<SingerModel> singersList) {
        this.singersList = singersList;
    }

    @Override
    public void onBindViewHolder(@NonNull final SingerViewHolder holder, int position) {
        SingerModel singerModel= singersList.get(position);
        holder.setValues(singerModel.getSingerName(),singerModel.getSong());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                singersList.remove(holder.getAdapterPosition());
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return singersList.size();
    }
}

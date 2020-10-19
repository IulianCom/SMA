package com.example.androgin;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SingerViewHolder extends RecyclerView.ViewHolder {
    private TextView singerName;
    private TextView song;


    public SingerViewHolder(@NonNull View itemView) {
        super(itemView);
        initializeViews();
    }

    private void initializeViews(){
        singerName = itemView.findViewById(R.id.tv_first);
        song = itemView.findViewById(R.id.tv_second);
    }

    public void setValues(String singer, String music){
        singerName.setText(singer);
        song.setText(music);
    }
}

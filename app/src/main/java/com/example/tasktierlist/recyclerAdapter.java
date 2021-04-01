package com.example.tasktierlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder>{
    private String[] taskLists;

    public recyclerAdapter (String[] taskLists){
        this.taskLists = taskLists;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView nameTxt;

        public MyViewHolder (final View view){
            super(view);
            nameTxt = view.findViewById(R.id.matakuliah);
        }
    }
    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {
        String task = taskLists[position];
        holder.nameTxt.setText(task);
    }

    @Override
    public int getItemCount() {
        return taskLists.length;
    }
}

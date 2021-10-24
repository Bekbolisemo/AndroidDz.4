package com.example.androiddz4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Model> list;
    private onClick click;

    public void updateData (ArrayList<Model> list , onClick onClick){
        this.list = new ArrayList<>();
        this.list.addAll(list);
        click = onClick;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView number , musicName, executor,time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.number);
            musicName = itemView.findViewById(R.id.musicName);
            executor = itemView.findViewById(R.id.executor);
            time = itemView.findViewById(R.id.time);
        }
          public void bind(Model model){
            number.setText(String.valueOf(model.getNumber()));
            musicName.setText(String.valueOf(model.getMusicName()));
            executor.setText(String.valueOf(model.getExecutor()));
            time.setText(String.valueOf(model.getTime()));
            itemView.setOnClickListener(view ->{
                click.onItemClick(model);
            });
        }
    }

    interface onClick {
      void onItemClick(Model model);
    }
}

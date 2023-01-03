package com.example.homeworkout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;

public class ChoiseAdapter extends RecyclerView.Adapter<ChoiseAdapter.ViewHolder> {

    Context context;
    ArrayList<ChoiseClass> arrlist;

    public  ChoiseAdapter(Context context,ArrayList<ChoiseClass> arrlist)
    {
        this.context = context;
        this.arrlist = arrlist;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.choise,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.image.setAnimation(arrlist.get(position).image);
        holder.name.setText(arrlist.get(position).name);
        holder.time.setText(arrlist.get(position).time);
    }

    @Override
    public int getItemCount() {
        return arrlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name,time;
        LottieAnimationView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            name =itemView.findViewById(R.id.name);
            time = itemView.findViewById(R.id.time);
        }
    }
}

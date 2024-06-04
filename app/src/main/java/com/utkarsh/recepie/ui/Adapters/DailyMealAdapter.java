package com.utkarsh.recepie.ui.Adapters;

import static androidx.core.content.ContextCompat.startActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.utkarsh.recepie.R;
import com.utkarsh.recepie.ui.Models.DailyMealModel;
import com.utkarsh.recepie.ui.activities.DetailedDailyMeal;

import java.util.ArrayList;

public class DailyMealAdapter extends RecyclerView.Adapter<DailyMealAdapter.ViewHolder> {
    ArrayList<DailyMealModel>dailyMealList;
    Activity context;

    public DailyMealAdapter(ArrayList<DailyMealModel> dailyMealList, Activity context) {
        this.dailyMealList = dailyMealList;
        this.context = context;
    }

    @NonNull
    @Override
    public DailyMealAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_meal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DailyMealAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.img_type.setImageResource(dailyMealList.get(position).getImage());
        holder.foodType.setText(dailyMealList.get(position).getName());
        holder.description.setText(dailyMealList.get(position).getDescription());
        holder.discount.setText(dailyMealList.get(position).getDiscount());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, DetailedDailyMeal.class);
               intent.putExtra("type",dailyMealList.get(position).getType());
               context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dailyMealList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView foodType,description,discount;
        private ImageView img_type;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodType=itemView.findViewById(R.id.foodType);
            description=itemView.findViewById(R.id.description);
            discount=itemView.findViewById(R.id.discount);
            img_type=itemView.findViewById(R.id.img_type);
        }
    }
}

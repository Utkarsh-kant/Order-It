package com.utkarsh.recepie.ui.Adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.utkarsh.recepie.R;
import com.utkarsh.recepie.ui.Models.HomeHorModel;
import com.utkarsh.recepie.ui.Models.HomeVerModel;

import java.util.ArrayList;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {
    UpdateVerticalRec updateVerticalRec;
    Activity context;
    ArrayList<HomeHorModel> list;
    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity context, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HomeHorAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHorAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza1", "10:00-23:00", "4.9", "Min-35$"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza2", "10:00-23:00", "4.9", "Min-35$"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza3", "10:00-23:00", "4.9", "Min-35$"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pizza4", "10:00-23:00", "4.9", "Min-35$"));
            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row_index = position;
                notifyDataSetChanged();
                ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                switch (position) {
                    case 0:
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza1", "10:00-23:00", "4.9", "Min-35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza2", "10:00-23:00", "4.9", "Min-35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza3", "10:00-23:00", "4.9", "Min-35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pizza4", "10:00-23:00", "4.9", "Min-35$"));
                        break;
                    case 1:
                        homeVerModels.add(new HomeVerModel(R.drawable.burger1, "burger1", "10:00-23:00", "4.9", "Min-35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger2, "Burger 2", "10:00-23:00", "4.9", "Min-35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4, "Burger 3", "10:00-23:00", "4.9", "Min-35$"));
                        break;
                    case 2:
                        homeVerModels.add(new HomeVerModel(R.drawable.fries1, "fries1", "10:00-23:00", "4.9", "Min-35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2, "fries 2", "10:00-23:00", "4.9", "Min-35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3, "fries 3", "10:00-23:00", "4.9", "Min-35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4, "fries 4", "10:00-23:00", "4.9", "Min-35$"));
                        break;
                    case 3:
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream1, "icecream1", "10:00-23:00", "4.9", "Min-35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream2, "icecream 2", "10:00-23:00", "4.9", "Min-35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream3, "icecream 3", "10:00-23:00", "4.9", "Min-35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream4, "icecream 4", "10:00-23:00", "4.9", "Min-35$"));
                        break;
                    case 4:
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1, "sandwich1", "10:00-23:00", "4.9", "Min-35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2, "sandwich 2", "10:00-23:00", "4.9", "Min-35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3, "sandwich 3", "10:00-23:00", "4.9", "Min-35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich4, "sandwich 4", "10:00-23:00", "4.9", "Min-35$"));
                        break;
                }
                updateVerticalRec.callBack(position, homeVerModels);
            }
        });

        if (select && position == 0) {
            holder.cardView.setBackgroundResource(R.drawable.change_bg);
            select = false;
        } else {
            holder.cardView.setBackgroundResource(row_index == position ? R.drawable.change_bg : R.drawable.default_bg);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.txtFoodName);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}

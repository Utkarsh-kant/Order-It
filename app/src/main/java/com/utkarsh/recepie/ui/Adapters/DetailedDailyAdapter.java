package com.utkarsh.recepie.ui.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.utkarsh.recepie.R;
import com.utkarsh.recepie.ui.Models.DeatledDailyModel;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailedDailyAdapter extends RecyclerView.Adapter<DetailedDailyAdapter.ViewHolder> {
    ArrayList<DeatledDailyModel>detaiedDailylist;
    Activity context;

    public DetailedDailyAdapter(ArrayList<DeatledDailyModel> detaiedDailylist, Activity context) {
        this.detaiedDailylist = detaiedDailylist;
        this.context = context;
    }


    @NonNull
    @Override
    public DetailedDailyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.detailed_daily_meal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DetailedDailyAdapter.ViewHolder holder, int position) {
        holder.profile_image.setImageResource(detaiedDailylist.get(position).getImg());
        holder.detailed_name.setText(detaiedDailylist.get(position).getName());
        holder.detailed_description.setText(detaiedDailylist.get(position).getDescription());
        holder.detailed_rating.setText(detaiedDailylist.get(position).getRating());
        holder.timing.setText(detaiedDailylist.get(position).getTiming());
        holder.detailed_price.setText(detaiedDailylist.get(position).getPrice());


    }

    @Override
    public int getItemCount() {
        return detaiedDailylist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
    CircleImageView profile_image;
        private TextView detailed_name,detailed_description,detailed_rating,timing,detailed_price;
        private Button add_to_cart;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profile_image = itemView.findViewById(R.id.profile_image);
            detailed_name = itemView.findViewById(R.id.detailed_name);
            detailed_description = itemView.findViewById(R.id.detailed_description);
            detailed_rating = itemView.findViewById(R.id.detailed_rating);
            timing = itemView.findViewById(R.id.timing);
            detailed_price = itemView.findViewById(R.id.detailed_price);
            add_to_cart = itemView.findViewById(R.id.add_to_cart);

        }
    }
}

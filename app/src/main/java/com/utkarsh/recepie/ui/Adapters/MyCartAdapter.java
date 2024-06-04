package com.utkarsh.recepie.ui.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.utkarsh.recepie.R;
import com.utkarsh.recepie.ui.Models.MyCartModel;

import java.util.List;

public class MyCartAdapter extends RecyclerView.Adapter<MyCartAdapter.ViewHolder>{
    List<MyCartModel>myCartModels;

    public MyCartAdapter(List<MyCartModel> myCartModels) {
        this.myCartModels = myCartModels;
    }

    @NonNull
    @Override
    public MyCartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.my_cart_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyCartAdapter.ViewHolder holder, int position) {
        holder.detailed_name.setText(myCartModels.get(position).getName());
        holder.detailed_rating.setText(myCartModels.get(position).getRating());
        holder.price.setText(myCartModels.get(position).getPrice());
        holder.profile_image.setImageResource(myCartModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return myCartModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView profile_image;
        TextView detailed_name,detailed_rating,price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profile_image=itemView.findViewById(R.id.profile_image);
            detailed_name=itemView.findViewById(R.id.detailed_name);
            detailed_rating=itemView.findViewById(R.id.detailed_rating);
            price=itemView.findViewById(R.id.price);
        }
    }
}

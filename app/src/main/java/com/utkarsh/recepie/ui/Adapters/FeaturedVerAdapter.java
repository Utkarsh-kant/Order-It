package com.utkarsh.recepie.ui.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.utkarsh.recepie.R;
import com.utkarsh.recepie.ui.Models.FeaturedVerModel;

import java.util.List;

public class FeaturedVerAdapter extends RecyclerView.Adapter<FeaturedVerAdapter.ViewHolder> {
    List<FeaturedVerModel>featuredVerModels;

    public FeaturedVerAdapter(List<FeaturedVerModel> featuredVerModels) {
        this.featuredVerModels = featuredVerModels;
    }

    @NonNull
    @Override
    public FeaturedVerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_ver_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedVerAdapter.ViewHolder holder, int position) {
        holder.profile_image.setImageResource(featuredVerModels.get(position).getImage());
        holder.detailed_name.setText(featuredVerModels.get(position).getName());
        holder.detailed_description.setText(featuredVerModels.get(position).getDescription());
        holder.detailed_rating.setText(featuredVerModels.get(position).getRating());
        holder.timing.setText(featuredVerModels.get(position).getTiming());

    }

    @Override
    public int getItemCount() {
        return featuredVerModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       private RoundedImageView profile_image;
       private TextView detailed_name,detailed_description,detailed_rating,timing;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profile_image = itemView.findViewById(R.id.profile_image);
            detailed_name = itemView.findViewById(R.id.detailed_name);
            detailed_description = itemView.findViewById(R.id.detailed_description);
            detailed_rating = itemView.findViewById(R.id.detailed_rating);
            timing = itemView.findViewById(R.id.timing);
        }
    }
}

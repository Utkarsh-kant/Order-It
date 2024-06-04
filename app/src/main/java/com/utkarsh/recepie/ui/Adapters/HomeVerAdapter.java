package com.utkarsh.recepie.ui.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.utkarsh.recepie.R;
import com.utkarsh.recepie.ui.Models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeVerAdapter extends RecyclerView.Adapter<HomeVerAdapter.ViewHolder> {
    private BottomSheetDialog bottomSheetDialog;
    private ArrayList<HomeVerModel> list;
    Context context;

    public HomeVerAdapter(ArrayList<HomeVerModel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public HomeVerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.home_vertical_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeVerAdapter.ViewHolder holder, int position) {
        final String mName=list.get(position).getName();
        final String mPrice=list.get(position).getPrice();
        final String mRating=list.get(position).getRating();
        final String mTime=list.get(position).getTiming();
        final int image=list.get(position).getImage();
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.txtPrice.setText(list.get(position).getPrice());
        holder.txtRating.setText(list.get(position).getRating());
        holder.txtTime.setText(list.get(position).getTiming());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingInflatedId")
            @Override
            public void onClick(View v) {
               bottomSheetDialog=new BottomSheetDialog(context,R.style.bottomSheetTheme);
               View sheetView=LayoutInflater.from(context).inflate(R.layout.bottom_sheet_layout,null);
               sheetView.findViewById(R.id.add_to_cart).setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Toast.makeText(context, "Item Added to cart", Toast.LENGTH_SHORT).show();
                       bottomSheetDialog.dismiss();
                   }
               });
               ImageView bottomImg=sheetView.findViewById(R.id.bottomImg);
               TextView bottom_detailed=sheetView.findViewById(R.id.bottom_detailed);
               TextView bottom_description=sheetView.findViewById(R.id.bottom_description);
               TextView bottom_rating =sheetView.findViewById(R.id.bottom_rating);
               TextView bottom_timing=sheetView.findViewById(R.id.bottom_timing);
               TextView bottom_price =sheetView.findViewById(R.id.bottom_price);
               bottom_detailed.setText(mName);
               bottom_description.setText(mPrice);
               bottom_rating.setText(mRating);
               bottom_timing.setText(mTime);
               bottom_price.setText(mPrice);
               bottomImg.setImageResource(image);
               bottomSheetDialog.setContentView(sheetView);
               bottomSheetDialog.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name,txtPrice,txtRating,txtTime ;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            txtRating = itemView.findViewById(R.id.txtRating);
            txtTime = itemView.findViewById(R.id.txtTime);
            imageView = itemView.findViewById(R.id.ver_img);
        }
    }
}

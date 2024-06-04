package com.utkarsh.recepie.ui.activities;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.utkarsh.recepie.R;
import com.utkarsh.recepie.ui.Adapters.DetailedDailyAdapter;
import com.utkarsh.recepie.ui.Models.DeatledDailyModel;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailedDailyMeal extends AppCompatActivity {
    private RecyclerView recyclerView;
    ArrayList<DeatledDailyModel> detaiedDailylist;
    private DetailedDailyAdapter detailedDailyAdapter;
   CircleImageView profile_image;
   ImageView img_detail_food;
   CollapsingToolbarLayout collapsing;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detailed_daily_meal);
        String type=getIntent().getStringExtra("type");
        recyclerView = findViewById(R.id.detailed_rec);
        profile_image = findViewById(R.id.profile_image);
        img_detail_food=findViewById(R.id.img_detail_food);
        collapsing=findViewById(R.id.collapsing);
        detaiedDailylist = new ArrayList<>();
        detailedDailyAdapter = new DetailedDailyAdapter(detaiedDailylist,this);
        recyclerView.setAdapter(detailedDailyAdapter);
        if (type!=null && type.equalsIgnoreCase("breakfast")){
            collapsing.setTitle("Breakfast");
            detaiedDailylist.add(new DeatledDailyModel(R.drawable.fav1,"Brteakfast","Description","4.4","40","10am to 9pm"));
            detaiedDailylist.add(new DeatledDailyModel(R.drawable.fav2,"Brteakfast","Description","4.4","40","10am to 9pm"));
            detaiedDailylist.add(new DeatledDailyModel(R.drawable.fav3,"Brteakfast","Description","4.4","40","10am to 9pm"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if (type!=null && type.equalsIgnoreCase("sweet")){
            collapsing.setTitle("Sweet");
            img_detail_food.setImageResource(R.drawable.sweets);
          
            detaiedDailylist.add(new DeatledDailyModel(R.drawable.s1,"Sweet1","Description","4.4","40","10am to 9pm"));
            detaiedDailylist.add(new DeatledDailyModel(R.drawable.s2,"Sweet2","Description","4.4","40","10am to 9pm"));
            detaiedDailylist.add(new DeatledDailyModel(R.drawable.s3,"Sweet3","Description","4.4","40","10am to 9pm"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if (type!=null && type.equalsIgnoreCase("lunch")){
            img_detail_food.setImageResource(R.drawable.lunch);
            collapsing.setTitle("Lunch");

            detaiedDailylist.add(new DeatledDailyModel(R.drawable.s1,"lunch1","Description","4.4","40","10am to 9pm"));
            detaiedDailylist.add(new DeatledDailyModel(R.drawable.s2,"lunch2","Description","4.4","40","10am to 9pm"));
            detaiedDailylist.add(new DeatledDailyModel(R.drawable.s3,"lunch3","Description","4.4","40","10am to 9pm"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if (type!=null && type.equalsIgnoreCase("dinner")){
            img_detail_food.setImageResource(R.drawable.dinner);
            collapsing.setTitle("Dinner");

            detaiedDailylist.add(new DeatledDailyModel(R.drawable.s1,"dinner1","Description","4.4","40","10am to 9pm"));
            detaiedDailylist.add(new DeatledDailyModel(R.drawable.s2,"dinner2","Description","4.4","40","10am to 9pm"));
            detaiedDailylist.add(new DeatledDailyModel(R.drawable.s3,"dinner3","Description","4.4","40","10am to 9pm"));
            detailedDailyAdapter.notifyDataSetChanged();
        }
        if (type!=null && type.equalsIgnoreCase("coffee")){
            img_detail_food.setImageResource(R.drawable.coffe);
            collapsing.setTitle("Coffee");

            detaiedDailylist.add(new DeatledDailyModel(R.drawable.s1,"coffee1","Description","4.4","40","10am to 9pm"));
            detaiedDailylist.add(new DeatledDailyModel(R.drawable.s2,"coffee2","Description","4.4","40","10am to 9pm"));
            detaiedDailylist.add(new DeatledDailyModel(R.drawable.s3,"coffee3","Description","4.4","40","10am to 9pm"));
            detailedDailyAdapter.notifyDataSetChanged();
        }

    }
}

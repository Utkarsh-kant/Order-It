package com.utkarsh.recepie.ui.dailyMeal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.utkarsh.recepie.R;
import com.utkarsh.recepie.ui.Adapters.DailyMealAdapter;
import com.utkarsh.recepie.ui.Models.DailyMealModel;

import java.util.ArrayList;


public class DailyMealfragment extends Fragment {
    private RecyclerView daily_meal_rec;
    private DailyMealAdapter dailyMealAdapter;
    private ArrayList<DailyMealModel> dailyMealList;



    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root =inflater.inflate(R.layout.daily_meal_fragment, container, false);
        daily_meal_rec=root.findViewById(R.id.daily_meal_rec);
        dailyMealList=new ArrayList<>();
        dailyMealList.add(new DailyMealModel(R.drawable.breakfast,"Breakfast","30%","breakfast is ready","breakfast")) ;
        dailyMealList.add(new DailyMealModel(R.drawable.lunch,"Lunch","20%","Lunch is no  is ready","lunch")) ;
        dailyMealList.add(new DailyMealModel(R.drawable.dinner,"Dinner","30%","Dinner is ready","dinner")) ;
        dailyMealList.add(new DailyMealModel(R.drawable.sweets,"Sweets","10%","Sweets is ready","sweet")) ;
        dailyMealList.add(new DailyMealModel(R.drawable.coffe,"Coffee","20%","Coffee is ready","coffee")) ;
        dailyMealAdapter=new DailyMealAdapter(dailyMealList,getActivity());
        daily_meal_rec.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();



       
        return root;
    }

}

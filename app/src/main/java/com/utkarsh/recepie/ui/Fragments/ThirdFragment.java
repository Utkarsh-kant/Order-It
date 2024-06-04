package com.utkarsh.recepie.ui.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.utkarsh.recepie.R;
import com.utkarsh.recepie.ui.Adapters.FeaturedAdapter;
import com.utkarsh.recepie.ui.Adapters.FeaturedVerAdapter;
import com.utkarsh.recepie.ui.Models.FeatureModel;
import com.utkarsh.recepie.ui.Models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;


public class ThirdFragment extends Fragment {
    List<FeatureModel> list;
    FeaturedAdapter adapter;
    RecyclerView recyclerViewhor,Recy_ver_item;
    //For vertical Recycler View
    List<FeaturedVerModel>featuredVerModels;
    FeaturedVerAdapter featuredVerAdapter;



    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_third, container, false);
        recyclerViewhor =view.findViewById(R.id.Recy_hor_item);
        Recy_ver_item=view.findViewById(R.id.Recy_ver_item);
        list=new ArrayList<>();
        adapter=new FeaturedAdapter(list);
        list.add(new FeatureModel(R.drawable.fav1,"Custard ","Custard with some fruits"));
        list.add(new FeatureModel(R.drawable.fav2,"Burger","Cheese Burger with extra toppins"));
        list.add(new FeatureModel(R.drawable.fav3,"Noodles","White sauce noodles"));
        recyclerViewhor.setAdapter(adapter);
        featuredVerModels=new ArrayList<>();
        featuredVerAdapter=new FeaturedVerAdapter(featuredVerModels);
        featuredVerModels.add(new FeaturedVerModel(R.drawable.ver1,"Foode ver 1 ","Custard with some fruits","4","10"));
        featuredVerModels.add(new FeaturedVerModel(R.drawable.ver2,"Foode ver 1 ","Custard with some fruits","4","10"));
        featuredVerModels.add(new FeaturedVerModel(R.drawable.ver3,"Foode ver 1 ","Custard with some fruits","4","10"));
        Recy_ver_item.setAdapter(featuredVerAdapter);
        return view;
    }
}

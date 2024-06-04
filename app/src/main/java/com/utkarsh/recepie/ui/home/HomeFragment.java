package com.utkarsh.recepie.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.utkarsh.recepie.R;
import com.utkarsh.recepie.ui.Adapters.HomeHorAdapter;
import com.utkarsh.recepie.ui.Adapters.HomeVerAdapter;
import com.utkarsh.recepie.ui.Adapters.UpdateVerticalRec;
import com.utkarsh.recepie.ui.Models.HomeHorModel;
import com.utkarsh.recepie.ui.Models.HomeVerModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements UpdateVerticalRec {
    private ArrayList<HomeHorModel> homehorlist;
    private ArrayList<HomeVerModel> homeVerList;
    private HomeHorAdapter homeHorAdapter;
    private HomeVerAdapter homeVerAdapter;
    private RecyclerView home_hor_recy, home_ver_recy;

    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialize RecyclerViews
        home_hor_recy = root.findViewById(R.id.home_hor_recy);
        home_ver_recy = root.findViewById(R.id.home_ver_recy);

     

        // Initialize horizontal list
        homehorlist = new ArrayList<>();
        homehorlist.add(new HomeHorModel(R.drawable.pizza, "Pizza"));
        homehorlist.add(new HomeHorModel(R.drawable.hamburger, "HamBurger"));
        homehorlist.add(new HomeHorModel(R.drawable.fried_potatoes, "Fries"));
        homehorlist.add(new HomeHorModel(R.drawable.ice_cream, "Ice cream"));
        homehorlist.add(new HomeHorModel(R.drawable.sandwich, "Sandwich"));

        // Set up horizontal adapter
        homeHorAdapter = new HomeHorAdapter(this, getActivity(), homehorlist);
        home_hor_recy.setAdapter(homeHorAdapter);

        // Initialize vertical list
        homeVerList = new ArrayList<>();

        // Set up vertical adapter
        homeVerAdapter = new HomeVerAdapter(homeVerList, getContext());
        home_ver_recy.setAdapter(homeVerAdapter);

        return root;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {
    
        homeVerList.clear();
        homeVerList.addAll(list);
        homeVerAdapter.notifyDataSetChanged();
    }
}

package com.utkarsh.recepie.ui.myCart;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.utkarsh.recepie.R;
import com.utkarsh.recepie.ui.Adapters.MyCartAdapter;
import com.utkarsh.recepie.ui.Models.MyCartModel;

import java.util.ArrayList;
import java.util.List;


public class MyCartFragment extends Fragment {
    List<MyCartModel>myCartModelList;
    MyCartAdapter myCartAdapter;
    RecyclerView Recy_mycart;


    public MyCartFragment() {
        // Required empty public constructor
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
   View view=inflater.inflate(R.layout.fragment_my_cart, container, false);
   Recy_mycart=view.findViewById(R.id.Recy_mycart);
   myCartModelList=new ArrayList<>();
   myCartAdapter=new MyCartAdapter(myCartModelList);
   myCartModelList.add(new MyCartModel(R.drawable.s1,"Order ","40","4.5"));
        myCartModelList.add(new MyCartModel(R.drawable.s2,"Order ","40","4.5"));
        myCartModelList.add(new MyCartModel(R.drawable.s3,"Order ","40","4.5"));
        myCartModelList.add(new MyCartModel(R.drawable.s1,"Order ","40","4.5"));
        myCartModelList.add(new MyCartModel(R.drawable.s2,"Order ","40","4.5"));
        myCartModelList.add(new MyCartModel(R.drawable.s3,"Order ","40","4.5"));
        myCartModelList.add(new MyCartModel(R.drawable.s1,"Order ","40","4.5"));
        myCartModelList.add(new MyCartModel(R.drawable.s2,"Order ","40","4.5"));
        myCartModelList.add(new MyCartModel(R.drawable.s3,"Order ","40","4.5"));
        myCartModelList.add(new MyCartModel(R.drawable.s1,"Order ","40","4.5"));
        myCartModelList.add(new MyCartModel(R.drawable.s2,"Order ","40","4.5"));
        myCartModelList.add(new MyCartModel(R.drawable.s3,"Order ","40","4.5"));
        Recy_mycart.setAdapter(myCartAdapter);
   return view;
    }
}

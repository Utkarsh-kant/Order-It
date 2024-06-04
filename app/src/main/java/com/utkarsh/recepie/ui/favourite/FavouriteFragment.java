package com.utkarsh.recepie.ui.favourite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.utkarsh.recepie.R;
import com.utkarsh.recepie.ui.Fragments.FragmentAdapter;
import com.utkarsh.recepie.ui.activities.MainActivity;


public class FavouriteFragment extends Fragment {
    TabLayout tab_layout;
    ViewPager2 fav_viewpager;
    FragmentAdapter fragmentAdapter;
   private FragmentActivity fragmentActivity;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


       View root = inflater.inflate(R.layout.favourite_fragment, container, false);
        tab_layout = root.findViewById(R.id.tab_layout);
        fav_viewpager = root.findViewById(R.id.fav_viewpager);
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        fragmentAdapter=new FragmentAdapter(fragmentManager,getLifecycle());
        fav_viewpager.setAdapter(fragmentAdapter);
         tab_layout.addTab(tab_layout.newTab().setText("Featured"));
        tab_layout.addTab(tab_layout.newTab().setText("Popular"));
        tab_layout.addTab(tab_layout.newTab().setText("New"));
        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                fav_viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        fav_viewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tab_layout.selectTab(tab_layout.getTabAt(position));
            }
        });

        return root;
    }


}

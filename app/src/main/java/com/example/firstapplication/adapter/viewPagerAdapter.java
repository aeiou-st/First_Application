package com.example.firstapplication.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.firstapplication.ui.Tab1Fragment;
import com.example.firstapplication.ui.Tab2Fragment;
import com.example.firstapplication.ui.Tab3Fragment;

public class viewPagerAdapter extends FragmentPagerAdapter {


    private final int tabno;

    public viewPagerAdapter(@NonNull FragmentManager fm, int behaviorSetUserVisibleHint, int tabno) {

        super(fm, tabno);
        this.tabno = tabno;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new Tab1Fragment();
            case 1 : return new Tab2Fragment();
            case 2 : return new Tab3Fragment();
            default: return new Tab1Fragment();
        }
    }

    @Override
    public int getCount() {
        return tabno;
    }
}

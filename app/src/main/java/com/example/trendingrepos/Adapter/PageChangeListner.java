package com.example.trendingrepos.Adapter;

import androidx.viewpager.widget.ViewPager;

import com.example.trendingrepos.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PageChangeListner implements ViewPager.OnPageChangeListener {

    private BottomNavigationView navigation ;
    public PageChangeListner(BottomNavigationView navigation){this.navigation=navigation ;}
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }
    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                navigation.setSelectedItemId(R.id.navigation_trending);
                break;
            case 1:
                navigation.setSelectedItemId(R.id.navigation_settings);
                break;
        }
    }
    @Override
    public void onPageScrollStateChanged(int state) {
    }
}

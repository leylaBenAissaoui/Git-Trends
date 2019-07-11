package com.example.trendingrepos.Adapter;

import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;


import com.example.trendingrepos.R;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;

public class MyOnNavigationItemSelectedListener implements OnNavigationItemSelectedListener {
    private ViewPager viewPager ;

    public MyOnNavigationItemSelectedListener(ViewPager viewPager) {
        this.viewPager=viewPager ;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.navigation_trending:
                viewPager.setCurrentItem(0);
                return true;

            case R.id.navigation_settings:
                viewPager.setCurrentItem(1);
                return true;

        }
        return false;
    }
}

package com.example.trendingrepos;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;


import com.example.trendingrepos.Adapter.FragmentAdapter;
import com.example.trendingrepos.Adapter.MyOnNavigationItemSelectedListener;
import com.example.trendingrepos.Adapter.PageChangeListner;
import com.example.trendingrepos.Fragments.SettingFragment;
import com.example.trendingrepos.Fragments.TrendingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
   private  ViewPager viewPager;
    //BottomNavigationView navigation;
   private  Fragment trending_Fragment =new TrendingFragment() ;
   private  Fragment Setting_Fragment =new SettingFragment()  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);

        viewPager = findViewById(R.id.viewpager); //Init Viewpager
        setupFragment(getSupportFragmentManager(), viewPager);
        viewPager.setCurrentItem(0);
        viewPager.setOnPageChangeListener(new PageChangeListner(navView));
        navView.setOnNavigationItemSelectedListener(new MyOnNavigationItemSelectedListener(viewPager));
        //navView.setVisibility(View.GONE);
    }

    public static void setupFragment(FragmentManager fragmentManager, ViewPager viewPager){

        FragmentAdapter Adapter = new FragmentAdapter(fragmentManager);
        //Add All Fragment To List
        Adapter.add(new TrendingFragment(), "Trendings");
        Adapter.add(new SettingFragment(), "Setting");
        viewPager.setAdapter(Adapter);
    }

}

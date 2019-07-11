package com.example.trendingrepos;

import android.os.Bundle;

import com.example.trendingrepos.Adapter.FragmentAdapter;
import com.example.trendingrepos.Adapter.MyOnNavigationItemSelectedListener;
import com.example.trendingrepos.Adapter.PageChangeListner;
import com.example.trendingrepos.Fragments.SettingFragment;
import com.example.trendingrepos.Fragments.TrendingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
   private  ViewPager viewPager;
    //BottomNavigationView navigation;
   private  Fragment trending_Fragment =new TrendingFragment() ;
   private  Fragment Setting_Fragment =new SettingFragment()  ;

    //private OnNavigationItemSelectedListener mOnNavigationItemSelectedListener =  ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);

        viewPager = findViewById(R.id.viewpager); //Init Viewpager
        setupFragment(getSupportFragmentManager(), viewPager);
        viewPager.setCurrentItem(0); //Set Currrent Item When Activity Start
        viewPager.setOnPageChangeListener(new PageChangeListner(navView));
        navView.setOnNavigationItemSelectedListener(new MyOnNavigationItemSelectedListener(viewPager));

        // Fragment selectedFragment = new TrendingFragment() ;

        //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container ,selectedFragment).commit() ;



    }

    public static void setupFragment(FragmentManager fragmentManager, ViewPager viewPager){

        FragmentAdapter Adapter = new FragmentAdapter(fragmentManager);
        //Add All Fragment To List
        Adapter.add(new TrendingFragment(), "Trendings");
        Adapter.add(new SettingFragment(), "Setting");
        viewPager.setAdapter(Adapter);
    }

}

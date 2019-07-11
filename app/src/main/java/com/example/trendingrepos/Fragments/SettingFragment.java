package com.example.trendingrepos.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


import com.example.trendingrepos.R;
import com.jaredrummler.android.widget.AnimatedSvgView;

public class SettingFragment extends Fragment {
    View v ;
    AnimatedSvgView svgView ;

 @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_setting, container, false);



           return v ;
    }








}

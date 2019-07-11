package com.example.trendingrepos.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trendingrepos.Adapter.MAdapter;
import com.example.trendingrepos.Adapter.MyOnScrollListener;
import com.example.trendingrepos.Pojo.Repo;
import com.example.trendingrepos.R;
import com.example.trendingrepos.Util.Constants;
import com.example.trendingrepos.Util.SVG;
import com.example.trendingrepos.ViewModel.RepoViewModel;
import com.jaredrummler.android.widget.AnimatedSvgView;

import java.util.List;

public class TrendingFragment extends Fragment {

    View v ;
    private  AnimatedSvgView svgView ;
    private RecyclerView mRecyclerView;
        private MAdapter adapter ;
    private LinearLayoutManager mLayoutManager ;

    private RepoViewModel mViewModel ;

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
         v=inflater.inflate(R.layout.fragment_trending, container, false);

        DividerItemDecoration itemDecor = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL );
        mRecyclerView =v.findViewById(R.id.Recycler_view);

        if(Constants.firstLoad==true)mRecyclerView.setVisibility(View.GONE);

        mRecyclerView.addItemDecoration(itemDecor);
        adapter = new MAdapter(getContext() );
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager =new LinearLayoutManager(getActivity()) ;

        mRecyclerView.setLayoutManager( mLayoutManager);
        mRecyclerView.addOnScrollListener(new MyOnScrollListener(mLayoutManager) {
            @Override
            public boolean isLastPage() {
                return false;
            }

            @Override
            public boolean isLoading() {
                return false;
            }

            @Override
            public void LoadMore() {
                Toast toast = Toast.makeText(getContext(), "loading.... ", Toast.LENGTH_LONG);
                toast.show();
                mViewModel.FetchMoreData() ;  }

        });

        svgView = (AnimatedSvgView) v.findViewById(R.id.animated_svg_view);

        if(Constants.firstLoad==false){svgView .setVisibility(View.GONE);};
        setSvg(SVG.values()[0]);
        svgView.setOnStateChangeListener(new AnimatedSvgView.OnStateChangeListener() {

            @Override public void onStateChange(@AnimatedSvgView.State int state) {
                if (state == AnimatedSvgView.STATE_TRACE_STARTED) {

                } else if (state == AnimatedSvgView.STATE_FINISHED ) {
                    if (  Constants.firstLoad==true) setSvg(SVG.values()[0]);
                    else{
                        svgView.setVisibility(View.GONE);
                        mRecyclerView.setVisibility(View.VISIBLE);
                    }
                }
            }
        });

        return v ;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel= ViewModelProviders.of(getActivity()).get(RepoViewModel.class) ;

        mViewModel.init() ;
        mViewModel.getmLiveRepos().removeObservers(getViewLifecycleOwner());
        mViewModel.getmLiveRepos().observe(this, new Observer<List<Repo>>() {
            @Override
            public void onChanged(List<Repo> repos) {
                adapter.SetRepos(repos);
                adapter.notifyDataSetChanged();

            }
        }) ;



    }

    private void setSvg(SVG svg) {
        svgView.setGlyphStrings(svg.glyphs);
        svgView.setFillColors(svg.colors);
        svgView.setViewportSize(svg.width, svg.height);
        svgView.setTraceResidueColor(0x32000000);
        svgView.setTraceColors(svg.colors);
        svgView.rebuildGlyphData();
        svgView.postDelayed(new Runnable() { @Override public void run() {svgView.start();}}, 500);
    }



}

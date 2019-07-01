package com.example.trendingrepos.Activity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.trendingrepos.Adapter.MAdapter;
import com.example.trendingrepos.Adapter.MyOnScrollListener;
import com.example.trendingrepos.RestService.GitHubAPI;
import com.example.trendingrepos.Pojo.Item;
import com.example.trendingrepos.Pojo.Repo;
import com.example.trendingrepos.Pojo.Reponse;
import com.example.trendingrepos.R;
import com.example.trendingrepos.RestService.RetrofitClient;
import com.example.trendingrepos.ViewModel.RepoViewModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity  {
//implements SwipeRefreshLayout.OnRefreshListener
    private static final String TAG = "MainActivity";
    // RecyclerView
    private RecyclerView mRecyclerView;
    private MAdapter adapter ;
     private LinearLayoutManager mLayoutManager ;

    //UI Event
    public static boolean isLoading= true ;
    public static boolean  isLastPage =false;
    //paging
    public static int page ;
    private RepoViewModel mViewModel ;

    private ArrayList<Reponse> listReponses;
    private ArrayList<Repo> listRepos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // Recycler View
        InitRecyclerView() ;
        //ViewModel
        mViewModel= ViewModelProviders.of(this).get(RepoViewModel.class) ;
        mViewModel.init() ;
        mViewModel.getmLiveRepos().observe(this, new Observer<List<Repo>>() {
            @Override
            public void onChanged(List<Repo> repos) {
                adapter.SetRepos(repos);

            }
        });

        mRecyclerView.addOnScrollListener(new MyOnScrollListener(mLayoutManager) {
            @Override
            public void onLoadMore(int current_page) {
                mViewModel.FetchMoreData( current_page) ;
            }



        });





    }

    private void InitRecyclerView(){


      //  recyclerView.addOnScrollListener(recyclerViewOnScrollListener);
        DividerItemDecoration itemDecor = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL );
        // SwipeRefreshLayout swipeRefresh= ;
        mRecyclerView =findViewById(R.id.Recycler_view);
        mRecyclerView.addItemDecoration(itemDecor);
        adapter = new MAdapter(this );
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager =new LinearLayoutManager(this) ;
        mRecyclerView.setLayoutManager( mLayoutManager);
        Log.d(TAG, "InitRecyclerView");
       }




}








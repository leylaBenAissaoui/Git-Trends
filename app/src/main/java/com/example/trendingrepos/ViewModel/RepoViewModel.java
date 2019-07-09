package com.example.trendingrepos.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;


import com.example.trendingrepos.Pojo.Repo;
import com.example.trendingrepos.Repository.RepoRepository;

import java.util.List;

public class RepoViewModel  extends AndroidViewModel {


 private RepoRepository mRepoRepository;

 private MediatorLiveData<List<Repo>> mLiveRepos = new MediatorLiveData<>();

 public RepoViewModel(@NonNull Application application) {
  super(application);
 }


 public void init() {
     mRepoRepository = RepoRepository.getInstance();
     mRepoRepository.init();
     mLiveRepos.addSource(mRepoRepository.getRepos() ,new Observer<List<Repo>>() {
         @Override
         public void onChanged( List<Repo> repos) {
             mLiveRepos.setValue(repos);
         }
     });
 }

    public MutableLiveData<List<Repo>> getmLiveRepos() { return mLiveRepos; }

    public void  FetchMoreData(){  mRepoRepository.FetchMoreData();}















    public void  FetchMockData( int page){
         switch (page%4){
            case  0 :  mRepoRepository.ProvideMockdata0() ; break ;
            case  1 :  mRepoRepository.ProvideMockdata1() ; break ;
            case  2 :  mRepoRepository.ProvideMockdata2() ; break ;
            case  3 :  mRepoRepository.ProvideMockdata3() ; break ;
         }
    }




}
package com.example.trendingrepos.Repository;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;


import com.example.trendingrepos.Pojo.Repo;
import com.example.trendingrepos.RestService.GitService;

import java.util.ArrayList;
import java.util.List;


public class RepoRepository {

    private static RepoRepository instance;
    private GitService mGitService;

    private List<Repo> DisplayedData = new ArrayList<>() ;
    private MediatorLiveData<List<Repo>> mLiveRepos = new MediatorLiveData<>();

//Constructeur
    private RepoRepository(){
        mGitService= GitService.getInstance() ;
    }
    public static RepoRepository getInstance(){
        if(instance == null){
            instance = new RepoRepository();
        }
        return instance;

    }


   public MutableLiveData<List<Repo>> getRepos(){ return mLiveRepos; }

    public void init() {
        mGitService = GitService.getInstance();
        mGitService.Init();
        mLiveRepos.addSource(mGitService.getRepos() ,new Observer<List<Repo>>() {
            @Override
            public void onChanged( List<Repo> repos) {
                if (repos!= null){
                    mLiveRepos.setValue(repos);
                }
                else  ProvideMockdata0() ;

            }
        });
    }


 public void FetchMoreData(  ){
        mGitService.FetchMoreData();

    }

    public void ProvideMockdata0(){

       ArrayList<Repo> listRepos = new ArrayList<>() ;

       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));

       DisplayedData.addAll(listRepos );
        mLiveRepos.setValue(DisplayedData);
   }
    public void ProvideMockdata1(){

       ArrayList<Repo> listRepos = new ArrayList<>() ;

       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars2.githubusercontent.com/u/21976395?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars2.githubusercontent.com/u/21976395?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars2.githubusercontent.com/u/21976395?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars2.githubusercontent.com/u/21976395?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars2.githubusercontent.com/u/21976395?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars2.githubusercontent.com/u/21976395?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars2.githubusercontent.com/u/21976395?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars2.githubusercontent.com/u/21976395?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars2.githubusercontent.com/u/21976395?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
       listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars2.githubusercontent.com/u/21976395?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));

       DisplayedData.addAll(listRepos );
        mLiveRepos.setValue(DisplayedData);
   }
    public void ProvideMockdata2(){

        ArrayList<Repo> listRepos = new ArrayList<>() ;

        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/359870?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/359870?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/359870?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/359870?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/359870?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/359870?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/359870?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/359870?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/359870?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/359870?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));

        DisplayedData.addAll(listRepos );
        mLiveRepos.setValue(DisplayedData);
    }
    public void ProvideMockdata3(){

        ArrayList<Repo> listRepos = new ArrayList<>() ;

        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/35402248?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/35402248?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/35402248?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/35402248?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/35402248?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/35402248?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/35402248?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/35402248?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/35402248?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/35402248?v=4","111","https://avatars3.githubusercontent.com/u/48942249?v=4"));

        DisplayedData.addAll(listRepos );
        mLiveRepos.setValue(DisplayedData);
    }




}

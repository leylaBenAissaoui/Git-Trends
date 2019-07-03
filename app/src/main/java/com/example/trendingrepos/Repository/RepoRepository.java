package com.example.trendingrepos.Repository;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import com.example.trendingrepos.Activity.MainActivity;
import com.example.trendingrepos.Pojo.Repo;
import com.example.trendingrepos.RestService.GitService;

import java.util.ArrayList;
import java.util.List;

public class RepoRepository {

    private static RepoRepository instance;
    public static  int page =1;

    private GitService mGitService;
   private MutableLiveData<List<Repo>> mRepos = new MutableLiveData<>();
   private List<Repo> DisplayedData = new ArrayList<>() ;

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


    public MutableLiveData<List<Repo>> getRepos(){ return mRepos; } //

    //public List<Repo> getRepos(){ return Array ; }





    public void FetchInitData(){
        List<Repo> Data = new ArrayList<>( );

        Data =mGitService.FetchData(1) ;

        if (Data!= null){
            DisplayedData.addAll(Data );// Ajouter
            mRepos.setValue(DisplayedData);//Notifier le Repo de la nouvelle liste
        }
       else  ProvideMockdata0() ;
    }



   // public void FetchMoreData(int page){  ProvideMockdata2() ;  }
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
       mRepos.setValue(DisplayedData);
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
       mRepos.setValue(DisplayedData);
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
        mRepos.setValue(DisplayedData);
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
        mRepos.setValue(DisplayedData);
    }//avatar a changer






}

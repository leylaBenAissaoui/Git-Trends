package com.example.trendingrepos.RestService;

import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.example.trendingrepos.Activity.MainActivity;
import com.example.trendingrepos.Pojo.Item;
import com.example.trendingrepos.Pojo.Repo;
import com.example.trendingrepos.Pojo.Reponse;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class GitService {
    private static GitService instance ;

    private GitHubAPI  service;
    private List<Repo> listRepos = new ArrayList<>();
    private MutableLiveData<List<Repo>> mRepos = new MutableLiveData<>();
    private MutableLiveData<Integer> responseCode = new MutableLiveData<>();



    public List<Repo> getListRepos() {  return listRepos; }


    //Constructeur
    private GitService(){
        this.service =  RetrofitClient.getRetrofitInstance().create(GitHubAPI.class) ;

    }
    public static  GitService getInstance(){
        if(instance == null){
            instance = new GitService();
        }
            return instance;
    }

    public MutableLiveData<List<Repo>> getRepos(){ return mRepos; }

    public void Init() {
        service = RetrofitClient.getRetrofitInstance().create(GitHubAPI.class) ;
        GitHubAPI service = RetrofitClient.getRetrofitInstance().create(GitHubAPI.class);
        FetchMoreData() ;
    }


  public void FetchMoreData( ){
      Call<Reponse> call = service.getResponse(++MainActivity.page);
      // Call<Reponse> call = service.getResponse(34);//page 35 ==>code 422
      //MainActivity.isLoading=true ;
      call.enqueue(new Callback<Reponse>() {
          @Override
          public void onResponse(Call<Reponse> call, Response<Reponse> response) {
             // if (response.isSuccessful()) {

                  List<Item> list = response.body().getItems();
                  for (Item i : list) {
                      listRepos.add(new Repo(i.getName(), i.getDescription(), i.getOwner().getLogin(), i.getOwner().getAvatarUrl(), i.getStargazersCount().toString(), i.getHtmlUrl()));
                  }
                      mRepos.setValue(listRepos);
                      responseCode.setValue(response.code());//}

          }
          @Override
          public void onFailure(Call<Reponse> call, Throwable t) { Log.e(TAG, "ereeeeeeur"+t.toString()); }
      });

  }



}

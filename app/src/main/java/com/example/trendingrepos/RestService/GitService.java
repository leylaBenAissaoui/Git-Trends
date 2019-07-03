package com.example.trendingrepos.RestService;

import android.util.Log;

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


    public List<Repo> FetchData(int page) {
        service = RetrofitClient.getRetrofitInstance().create(GitHubAPI.class) ;
        GitHubAPI service = RetrofitClient.getRetrofitInstance().create(GitHubAPI.class);

        //asynchrone
        Call<Reponse> call = service.getResponse(page);

       call.enqueue(new Callback<Reponse>() {


            @Override
            public void onResponse(Call<Reponse> call, Response<Reponse> response) {
                if (response.isSuccessful()) {
                    //Reponse rep = response.body();
                    List<Item> list = response.body().getItems();
                        for (Item i : list) {
                            listRepos.add(new Repo(i.getName(), i.getDescription(), i.getOwner().getLogin(), i.getOwner().getAvatarUrl(), i.getStargazersCount().toString(), i.getHtmlUrl()));
                        }

                   }
                }
            @Override
            public void onFailure(Call<Reponse> call, Throwable t) { Log.e(TAG, "ereeeeeeur"+t.toString()); }
        });
        return null; //pour tester avec les mocks
        //return listRepos;//pour tester les donnéess reçues Via l'API
    }


}

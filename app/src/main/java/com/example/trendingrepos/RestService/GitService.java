package com.example.trendingrepos.RestService;


import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.trendingrepos.Pojo.Item;
import com.example.trendingrepos.Pojo.Repo;
import com.example.trendingrepos.Pojo.Reponse;
import com.example.trendingrepos.Util.Constants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
    private String dateMinus30 ;


    public List<Repo> getListRepos() {  return listRepos; }


    //Constructeur
    private GitService(){
        this.service =  RetrofitClient.getRetrofitInstance().create(GitHubAPI.class) ;
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -30);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");//2019-06-22
        //cal.set(year,months,day);
        dateFormat.format(cal.getTime());

        System.out.println("Date = " + cal.getTime());
       // dateMinus30 =cal.getTime().toString() ;

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

        FetchMoreData() ;//makhas'haach teb9a hna
    }


  public void FetchMoreData( ){
      Call<Reponse> call = service.getResponse(++Constants.page);
      // Call<Reponse> call = service.getResponse(34);//page 35 ==>code 422
      //MainActivity.isLoading=true ;
      call.enqueue(new Callback<Reponse>() {
          @Override
          public void onResponse(Call<Reponse> call, Response<Reponse> response) {
             if (response.isSuccessful()) {

                  List<Item> list = response.body().getItems();
                  for (Item i : list) {
                      listRepos.add(new Repo(i.getName(), i.getDescription(), i.getOwner().getLogin(), i.getOwner().getAvatarUrl(), i.getStargazersCount().toString(), i.getHtmlUrl()));
                  }
                      mRepos.setValue(listRepos);
                      responseCode.setValue(response.code());
                 Constants.firstLoad = false ;
             }

          }
          @Override
          public void onFailure(Call<Reponse> call, Throwable t) { Log.e(TAG, "ereeeeeeur"+t.toString()); }
      });

  }



}

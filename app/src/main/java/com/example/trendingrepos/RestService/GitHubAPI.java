package com.example.trendingrepos.RestService;

import com.example.trendingrepos.Pojo.Reponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GitHubAPI {

    @GET("search/repositories?q=created:>2019-06-22&sort=stars&order=desc")
    Call<Reponse> getResponse() ;
}

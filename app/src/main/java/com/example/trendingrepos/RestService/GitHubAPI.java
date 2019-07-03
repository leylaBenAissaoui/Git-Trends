package com.example.trendingrepos.RestService;

import com.example.trendingrepos.Pojo.Reponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GitHubAPI {

    @GET("search/repositories")
    Call<Reponse> getResponse(@Query("q") String created ,@Query("sort") String stars ,@Query("order") String desc ,@Query("page") Integer page) ;

    @GET("search/repositories?q=created:>2019-06-22&sort=stars&order=desc")
    Call<Reponse> getResponse(@Query("page") Integer page);
}

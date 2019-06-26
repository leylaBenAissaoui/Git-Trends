package com.example.trendingrepos.Activity;


import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trendingrepos.Adapter.MAdapter;
import com.example.trendingrepos.RestService.GitHubAPI;
import com.example.trendingrepos.Pojo.Item;
import com.example.trendingrepos.Pojo.Repo;
import com.example.trendingrepos.Pojo.Reponse;
import com.example.trendingrepos.R;
import com.example.trendingrepos.RestService.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    //private static final String URL_DATA = "https://api.github.com/search/repositories?q=created:%3E2017-10-22&sort=stars&order=desc";


    private static final String TAG = "MainActivity";
    private ArrayList<Repo> listRepos = new ArrayList<>();
    private ArrayList<Reponse> listReponses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FetchingData() ;
        String mots="kkkkkkk";
        setContentView(R.layout.main);
        // InitMock() ;


    }





   /* public void InitMock(){

        listRepos = new ArrayList<>() ;
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
        listRepos.add(new Repo("smcsystem","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor.","s57445560","https://avatars3.githubusercontent.com/u/48942249?v=4","111"));
       InitRecyclerView() ;

    }*/



    private void InitRecyclerView(){

        DividerItemDecoration itemDecor = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL );
        RecyclerView recyclerView =findViewById(R.id.Recycler_view);
        recyclerView.addItemDecoration(itemDecor);
        MAdapter adapter = new MAdapter(this ,listRepos );
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        Log.d(TAG, "InitRecyclerView");
    }



    public void FetchingData(){
        //final Reponse reponse;
        GitHubAPI service = RetrofitClient.getRetrofitInstance().create(GitHubAPI.class);
        Call<Reponse> call = service.getResponse();
         call.enqueue(new Callback<Reponse>() {


             @Override
             public void onResponse(Call<Reponse> call, Response<Reponse> response) {
                 Toast.makeText(MainActivity.this, "Succes", Toast.LENGTH_SHORT).show();

                Reponse rep = response.body() ;
                List<Item> list = rep.getItems();
                for (Item i : list){

                    listRepos.add(new Repo(i.getName() ,i.getDescription() ,i.getOwner().getLogin() ,i.getOwner().getAvatarUrl(),i.getStargazersCount().toString(),i.getHtmlUrl())) ;



                }

                 Toast.makeText(MainActivity.this, response.body().toString() , Toast.LENGTH_SHORT).show();

                // }
                 InitRecyclerView();
             }

             @Override
            public void onFailure(Call<Reponse> call, Throwable t) {
                //Toast.makeText(MainActivity.this, "Unable to load repos", Toast.LENGTH_SHORT).show();

                     Toast.makeText(MainActivity.this, "Unable to load repos"+t.toString(), Toast.LENGTH_SHORT).show();
                 Log.e(TAG,t.toString());
                 //InitMock();
             }
        } );







}



}





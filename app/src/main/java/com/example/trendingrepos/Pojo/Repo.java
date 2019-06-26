package com.example.trendingrepos.Pojo;


import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;



public class Repo {

    private String repo_name;
    private String repo_desc;
    private String repo_owner_name;
    private String owner_pic;
    private String num_star;
    private String Repo_url;



    public Repo(String repo_name, String repo_desc, String repo_owner_name, String owner_pic, String num_star  , String Repo_url) {
        this.repo_name = repo_name;
        this.repo_desc = repo_desc;
        this.repo_owner_name = repo_owner_name;
        this.owner_pic = owner_pic;
        this.num_star = num_star;
        this.Repo_url = Repo_url;

    }

    public String getRepo_name() {
        return repo_name;
    }

    public void setRepo_name(String repo_name) {
        this.repo_name = repo_name;
    }

    public String getRepo_desc() {
        return repo_desc;
    }

    public void setRepo_desc(String repo_desc) {
        this.repo_desc = repo_desc;
    }

    public String getRepo_owner_name() {
        return repo_owner_name;
    }

    public void setRepo_owner_name(String repo_owner_name) {
        this.repo_owner_name = repo_owner_name;
    }

    public String getOwner_pic() {
        return owner_pic;
    }

    public void setOwner_pic(String owner_pic) {
        this.owner_pic = owner_pic;
    }

    public String getNum_star() {
        return num_star;
    }

    public void setNum_star(String num_star) {
        this.num_star = num_star;
    }

    public String getRepo_url() {     return Repo_url;   }

    public void setRepo_url(String repo_url) {  Repo_url = repo_url;  }

}




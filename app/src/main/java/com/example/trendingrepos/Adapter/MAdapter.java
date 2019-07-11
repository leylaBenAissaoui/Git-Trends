package com.example.trendingrepos.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.trendingrepos.Pojo.Repo;
import com.example.trendingrepos.R;


import java.util.ArrayList;
import java.util.List;

public class MAdapter extends RecyclerView.Adapter<MAdapter.ViewHolder>  {

    private static final String TAG = "MyAdapter";

    private Context mcontext ;
    private List<Repo> Repos = new ArrayList<>();


    public MAdapter(Context mcontext ) {
        this.mcontext = mcontext;

    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.repo_layout,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(mcontext).asBitmap().load(Repos.get(position).getOwner_pic()).into(holder.owner_pic);
        holder.repo_name.setText(Repos.get(position).getRepo_name());
        holder.repo_desc.setText(Repos.get(position).getRepo_desc());
        holder.repo_owner_name.setText(Repos.get(position).getRepo_owner_name());
        holder.num_star.setText(Repos.get(position).getNum_star().toString());
        holder.parentlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on :"+Repos.get(position).getRepo_name());
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(Repos.get(position).getRepo_url() ));
                mcontext. startActivity(intent);
                //  Toast.makeText(context ,Etabs.get(position).getLabel(),Toast.LENGTH_SHORT).show();

            }
        });
    }



    @Override
    public int getItemCount() {

        return Repos.size() ;
    }


    public void SetRepos(List<Repo> repos){this.Repos =repos ;}

    //private void NotifyDataSetChanged() {
        //Updating the Adapter
    //}


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView repo_name;
        TextView repo_desc;
        TextView repo_owner_name;
        ImageView owner_pic;
        TextView num_star;
        RelativeLayout parentlayout ;


        public ViewHolder(View itemView) {
            super(itemView);
            owner_pic=itemView.findViewById(R.id.owner_pic);
            repo_name =itemView.findViewById(R.id.repo_name);
            repo_desc =itemView.findViewById(R.id.repo_desc);
            repo_owner_name =itemView.findViewById(R.id.owner_name);
            num_star =itemView.findViewById(R.id.num_star);
            parentlayout=itemView.findViewById(R.id.wrap);
        }


    }


}

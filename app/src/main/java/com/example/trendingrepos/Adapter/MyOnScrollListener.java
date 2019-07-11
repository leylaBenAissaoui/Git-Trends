package com.example.trendingrepos.Adapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trendingrepos.Util.Constants;


public abstract class MyOnScrollListener extends RecyclerView.OnScrollListener {
    private int previousTotal = 0;
    private boolean loading = true;
    private int visibleThreshold = 0;
    int firstVisibleItem, visibleItemCount, totalItemCount ;

    private static final int PAGE_SIZE = 30;
    private LinearLayoutManager mLinearLayoutManager;

    public MyOnScrollListener(LinearLayoutManager mLinearLayoutManager) {
        this.mLinearLayoutManager = mLinearLayoutManager;
    }


    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);


        visibleItemCount = recyclerView.getChildCount();
        totalItemCount = mLinearLayoutManager.getItemCount();
        firstVisibleItem = mLinearLayoutManager.findFirstVisibleItemPosition();

        if (!isLoading() && !isLastPage()) {
            if ((visibleItemCount + firstVisibleItem) >= totalItemCount
                    && firstVisibleItem >= 0
            //&&totalItemCount >= PAGE_SIZE) {
                   &&totalItemCount >= PAGE_SIZE* Constants.page) {
                LoadMore();
            }
        }
    }


    public abstract boolean isLastPage();

    public abstract boolean isLoading();

    public abstract void LoadMore();
}



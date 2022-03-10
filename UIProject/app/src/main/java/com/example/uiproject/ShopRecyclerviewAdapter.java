package com.example.uiproject;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShopRecyclerviewAdapter extends RecyclerView.Adapter<ShopRecyclerviewAdapter.ShopViewHolder>{

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ShopViewHolder extends RecyclerView.ViewHolder{


        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

package com.example.home_work_three.RecicleView;

import android.content.pm.LabeledIntent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.home_work_three.R;

import java.util.ArrayList;

public class UsersAdapter extends RecyclerView.Adapter<UsersViewHolder> {

    ArrayList<String> listSecond;

    public UsersAdapter(ArrayList<String> listFirst){
        this.listSecond = listFirst;
    }
    @NonNull
    @Override
    public UsersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UsersViewHolder(LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_users,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UsersViewHolder holder, int position) {
        holder.onBind(listSecond.get(position));
    }

    @Override
    public int getItemCount() {
        return listSecond.size();
    }
}

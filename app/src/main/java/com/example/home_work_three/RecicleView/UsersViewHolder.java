package com.example.home_work_three.RecicleView;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.home_work_three.R;

public class UsersViewHolder extends RecyclerView.ViewHolder {

    TextView name,status,age;


    public UsersViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String userNames){
        name = itemView.findViewById(R.id.text_name);
        status = itemView.findViewById(R.id.text_online);
        age = itemView.findViewById(R.id.text_age);

        name.setText(userNames);
        status.setText(userNames);
        age.setText(userNames);
    }
}

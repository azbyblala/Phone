package com.example.onlyone.phone;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 张连芳 on 2016/12/2.
 */

public class Adapter extends RecyclerView.Adapter<com.example.onlyone.phone.Adapter.MyViewHolder>{
    List<Contact> mContact;

    public Adapter(List<Contact> contacts){
        mContact = contacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        MyViewHolder holder = new MyViewHolder(itemView);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv1.setText(mContact.get(position).getName());
        holder.tv2.setText(mContact.get(position).getNumber());
    }

    @Override
    public int getItemCount() {
        return mContact.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv1;
        TextView tv2;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv1 = (TextView) itemView.findViewById(R.id.textView);
            tv2= (TextView) itemView.findViewById(R.id.textView1);

        }
    }
}

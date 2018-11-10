package com.example.rajnikantpandey.emailandpass;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rajnikant Pandey on 11/10/2018.
 */

public class FragOneAdapter extends RecyclerView.Adapter<FragOneAdapter.MyHandler> {
    ArrayList list=new ArrayList();
    int i=1;
    public FragOneAdapter(ArrayList arrayList)
    {
        this.list=arrayList;
    }
    @Override
    public MyHandler onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=(LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.firstrow,parent,false);
        MyHandler handler=new MyHandler(view);
        return handler;
    }
    public void onBindViewHolder(MyHandler holder, int position) {
        FragOneDataProvidr fragOneDataProvidr= (FragOneDataProvidr) list.get(position);
        if(i==9){
        holder.image.setImageResource(fragOneDataProvidr.getImage());
       // holder.text.setText(fragOneDataProvidr.getNumber());
        //holder.text.setBackgroundColor(Color.parseColor("#3F51B5"));
        }
        else
        {
            holder.image.setImageResource(fragOneDataProvidr.getImage());
            holder.text.setText(fragOneDataProvidr.getNumber());
        }
        i++;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class MyHandler extends RecyclerView.ViewHolder {
        ImageView image;
        TextView text;
        MyHandler(View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.imageView);
            text=itemView.findViewById(R.id.textView2);
        }
    }
}

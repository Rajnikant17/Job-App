package com.example.rajnikantpandey.emailandpass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {
    int image[]={R.drawable.cart,R.drawable.cart,R.drawable.cart,R.drawable.cart,R.drawable.cart,R.drawable.cart,R.drawable.cart
            ,R.drawable.cart,R.drawable.cart};
    String ar[]={"10","10","10","10","10","10","10","10","10",};
    int i=0;
    RecyclerView recyclerView;
    FragOneAdapter fragOneAdapter;
    ArrayList<FragOneDataProvidr> arrayList;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        recyclerView=findViewById(R.id.recyclerview);
        arrayList=new ArrayList<>();
        for ( i=0;i<9;i++) {
            FragOneDataProvidr fragOneDataProvidr = new  FragOneDataProvidr(image[i],ar[i]);
            arrayList.add(fragOneDataProvidr);
        }
        fragOneAdapter=new FragOneAdapter(arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(fragOneAdapter);
    }
    public void click(View view) {
        String str="12";
        arrayList.get(0).setNumber(str);
        fragOneAdapter.notifyItemChanged(0);
    }


}

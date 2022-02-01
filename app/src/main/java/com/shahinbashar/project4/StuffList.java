package com.shahinbashar.project4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.shahinbashar.project4.adapter.MyAdapter;
import com.shahinbashar.project4.model.Model;

import java.util.ArrayList;
import java.util.List;

public class StuffList extends AppCompatActivity {
    int[] pic={R.drawable.stuff1,R.drawable.stuff2,R.drawable.stuff3,R.drawable.stuff4,R.drawable.stuff5,R.drawable.stuff6,R.drawable.stuff7,R.drawable.stuff8,R.drawable.stuff9,R.drawable.stuff10};
    List<Model> list;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stuff_list);
        recyclerView=findViewById(R.id.stuffRecyclerView);
        list=new ArrayList<>();
        Model stuff1=new Model("Shamim","01512762838");
        Model stuff2=new Model("Mofiz","01512762838");
        Model stuff3=new Model("Abul","01512762838");
        Model stuff4=new Model("Ikram","01512762838");
        Model stuff5=new Model("Josim","01512762838");
        Model stuff6=new Model("Zayed Khan","01512762838");
        Model stuff7=new Model("Aladdin Ahmed","01512762838");
        Model stuff8=new Model("Shakib Khan","01512762838");
        Model stuff9=new Model("Rubel","01512762838");
        Model stuff10=new Model("Hero Alam","01512762838");
        list=new ArrayList<>();
        list.add(stuff1);
        list.add(stuff2);
        list.add(stuff3);
        list.add(stuff4);
        list.add(stuff5);
        list.add(stuff6);
        list.add(stuff7);
        list.add(stuff8);
        list.add(stuff9);
        list.add(stuff10);
        MyAdapter myAdapter=new MyAdapter(list,pic,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(myAdapter);
    }
}
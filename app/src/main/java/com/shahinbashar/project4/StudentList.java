package com.shahinbashar.project4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shahinbashar.project4.adapter.MyAdapter;
import com.shahinbashar.project4.model.Model;

import java.util.ArrayList;
import java.util.List;

public class StudentList extends AppCompatActivity {
    int[] pic={R.drawable.sojib,R.drawable.sithi,R.drawable.bhabna,R.drawable.nusiba,R.drawable.shahin};
    List<Model> list;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        recyclerView=findViewById(R.id.studentListView);
        Model sojib=new Model("Nuruzzaman Sojib","01996507877");
        Model fabliha_noshin_sithi=new Model("Fabliha Noshin Sithi","01910878558");
        Model bhabnaMukherjee=new Model("Bhabna Mukherjee","01819438077");
        Model nusaiba_kalam=new Model("Nusaiba Kalam","01784384177");
        Model shahin_bashar=new Model("Shahin Bashar","01613162522");
        list=new ArrayList<>();
        list.add(sojib);
        list.add(fabliha_noshin_sithi);
        list.add(bhabnaMukherjee);
        list.add(nusaiba_kalam);
        list.add(shahin_bashar);
        MyAdapter myAdapter=new MyAdapter(list,pic,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(myAdapter);
    }
}
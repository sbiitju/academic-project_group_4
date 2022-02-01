package com.shahinbashar.project4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.shahinbashar.project4.adapter.MyAdapter;
import com.shahinbashar.project4.model.Model;

import java.util.ArrayList;
import java.util.List;

public class TeacherList extends AppCompatActivity {
    List<Model> list;
    int[] pic={R.drawable.kaisar,R.drawable.sam,R.drawable.mesbah,R.drawable.sazzad,R.drawable.jesmin,R.drawable.manan,R.drawable.risala,R.drawable.sohel,R.drawable.fahima,R.drawable.rashed,R.drawable.patowary};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_list);
        list=new ArrayList<>();
        recyclerView=findViewById(R.id.teacherRecyclerView);
        Model kaisar=new Model("Shamim Kaisar","01728748989");
        Model shamim_al_mamun=new Model("Shamim Al Mamun","01728748989");
        Model mesbah=new Model("Dr. MesbahUddin Sarker","01728748989");
        Model sazzadur_rahman=new Model("Sazzadur Rahman","01728748989");
        Model jesmin_akhter=new Model("Jesmin Akhter","01728748989");
        Model manan_bint_taz_noor=new Model("Manan Bint Taz Noor","01728748989");
        Model risala_khan=new Model("Risala Khan","01728748989");
        Model sohidul_islam=new Model("Sohidul Islam","01728748989");
        Model fahima_tabassum=new Model("Fahima Tabassum","01728748989");
        Model rashed_mazumdar=new Model("Rashed Mazumdar","01728748989");
        Model fazlul_karim_patowary=new Model("Fazlul Karim Patowary","01728748989");
        MyAdapter myAdapter=new MyAdapter(list,pic,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(myAdapter);
    }
}
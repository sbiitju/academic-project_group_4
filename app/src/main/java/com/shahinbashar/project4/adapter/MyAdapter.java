package com.shahinbashar.project4.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shahinbashar.project4.R;
import com.shahinbashar.project4.model.Student;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<Student> studentList;
    private int[] pictureList;
    private Context context;

    public MyAdapter(List<Student> studentList, int[] pictureList, Context context) {
        this.studentList = studentList;
        this.pictureList = pictureList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.student_card,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.studentImg.setImageResource(pictureList[position]);
        holder.studentNumber.setText(studentList.get(position).getNumber());
        holder.studentName.setText(studentList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}

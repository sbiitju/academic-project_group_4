package com.shahinbashar.project4.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shahinbashar.project4.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView studentImg;
    TextView studentName,studentNumber;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        studentImg=itemView.findViewById(R.id.studentImage);
        studentName=itemView.findViewById(R.id.studentName);
        studentNumber=itemView.findViewById(R.id.studentNumber);
    }
}

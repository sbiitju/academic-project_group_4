package com.shahinbashar.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shahinbashar.project4.model.Student;

import java.util.ArrayList;
import java.util.List;

public class TeacherList extends AppCompatActivity {
    List<Student> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_list);
        list=new ArrayList<>();
        Student student=new Student("Mesbah","832744");
        Student student1=new Student("Mesbah","832744");
        Student student2=new Student("Mesbah","832744");
        Student student3=new Student("Mesbah","832744");
        list.add(student);
    }
}
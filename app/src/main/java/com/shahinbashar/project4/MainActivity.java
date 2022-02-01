package com.shahinbashar.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shahinbashar.project4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Button teacherBtn,studentBtn,stffBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teacherBtn=findViewById(R.id.teacher);
        studentBtn=findViewById(R.id.student);
        stffBtn=findViewById(R.id.stuff);


        stffBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        teacherBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,TeacherList.class));
                finish();
            }
        });
        studentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,StudentList.class));
                finish();
            }
        });
    }
}
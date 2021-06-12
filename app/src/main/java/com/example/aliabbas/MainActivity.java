package com.example.aliabbas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.aliabbas.Model.Adapter.RecyclerViewAdapter;
import com.example.aliabbas.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Student> studentList = new ArrayList<>();
    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rView);
        studentList.add(new Student("Ali Abbas","191178"));
        studentList.add(new Student("Abdul Samad","191187"));
        studentList.add(new Student("Noman Tasif","191175"));
        studentList.add(new Student("Abdullah Qaisar","191162"));
        studentList.add(new Student("Salman Alvi","191168"));
        studentList.add(new Student("Ali Abbas","191178"));
        studentList.add(new Student("Abdul Samad","191187"));
        studentList.add(new Student("Noman Tasif","191175"));
        studentList.add(new Student("Abdullah Qaisar","191162"));
        studentList.add(new Student("Salman Alvi","191168"));
        studentList.add(new Student("Ali Abbas","191178"));
        studentList.add(new Student("Abdul Samad","191187"));
        studentList.add(new Student("Noman Tasif","191175"));
        studentList.add(new Student("Abdullah Qaisar","191162"));
        studentList.add(new Student("Salman Alvi","191168"));
        studentList.add(new Student("Ali Abbas","191178"));
        studentList.add(new Student("Abdul Samad","191187"));
        studentList.add(new Student("Noman Tasif","191175"));
        studentList.add(new Student("Abdullah Qaisar","191162"));
        studentList.add(new Student("Salman Alvi","191168"));

        recyclerViewAdapter = new RecyclerViewAdapter(studentList,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
package com.example.recyclerview_i;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<modelclass> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        buildStudentList();
        setRecyclerView();
    }

    private void initviews() {
        recyclerView = findViewById(R.id.recyclerview);
    }
    private void buildStudentList(){
        studentList=new ArrayList<modelclass>();
        modelclass student1=new modelclass(R.drawable.photo_1545291200_dfd334fcda76,R.drawable._200px_long_exposure_of_cable_bridge_on_durgam_cheruvu,
                "Blue Ocean","Waves Crash","Sea the beautiful ocean of the Pacific coast where the water is so clean you can see the nature",
                "Long Exposer over bridge","Long exposure photography when you leave the shutter open  longer then usual to pick up more light");
        studentList.add(student1);


        for (int i=0;i<12;i++){
            modelclass student=new modelclass(R.drawable.photo_1545291200_dfd334fcda76,R.drawable._200px_long_exposure_of_cable_bridge_on_durgam_cheruvu,
                    "Blue Ocean","Waves Crash","Sea the beautiful ocean of the Pacific coast where the water is so clean you can see the nature","Long Exposer over bridge","Long exposure photography when you leave the shutter open  longer then usual to pick up more light");
            studentList.add(student);
        }

    }
    private void setRecyclerView(){
        com.example.recyclerview_i.studentAdapter sstudentAdapter=new com.example.recyclerview_i.studentAdapter(studentList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(sstudentAdapter);
    }

}

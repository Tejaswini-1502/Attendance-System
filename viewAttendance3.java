package com.example.attendancesystem;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class viewAttendance3 extends ActivityLogin{
    ArrayList<StudentModel> res;
    ListView list;
    ArrayAdapter<StudentModel> adap;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewattendance);
        res = db.viewAttendence3();
        list = findViewById(R.id.listView);
        adap = new ArrayAdapter<StudentModel>(getApplicationContext(), android.R.layout.simple_list_item_1,res);
        list.setAdapter(adap);
    }
}


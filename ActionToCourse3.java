package com.example.attendancesystem;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActionToCourse3 extends AppCompatActivity {
    TextView course_name;
    Button take_attendance;
    Button view_attendance;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actiontocourse);
        Intent intent1 = getIntent();
        String course = intent1.getStringExtra("course3");

        course_name = findViewById(R.id.course_name);
        take_attendance = findViewById(R.id.btn_takeAttendance);
        view_attendance = findViewById(R.id.btn_viewAttendance);

        course_name.setText(course);
        Toast.makeText(getApplicationContext(),course,Toast.LENGTH_SHORT).show();
    }
}


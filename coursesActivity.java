package com.example.attendancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class coursesActivity extends ActivityLogin {
    //references to buttons and other controls on the layout
    Button course1,course2,course3;
    ArrayList<String> res;
    //Database db;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        Intent intent1 = getIntent();
        String username = intent1.getStringExtra("user-key");
        Toast.makeText(getApplicationContext(),username,Toast.LENGTH_SHORT).show();
        //db = new Database(getApplicationContext());
        course1 = findViewById(R.id.course1);
        course2 = findViewById(R.id.course2);
        course3 = findViewById(R.id.course3);
        res = db.retrieveCourses(username);
        course1.setText(res.get(0));
        course2.setText(res.get(1));
        course3.setText(res.get(2));

        course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getBaseContext(),ActionToCourse1.class);
                intent2.putExtra("course1", res.get(0));
                startActivity(intent2);
            }
        });

        course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getBaseContext(), ActionToCourse2.class);
                intent3.putExtra("course2", course2.getText().toString());
                startActivity(intent3);
            }
        });

        course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getBaseContext(), ActionToCourse3.class);
                intent4.putExtra("course3", course3.getText().toString());
                startActivity(intent4);
            }
        });

    }
}
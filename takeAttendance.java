package com.example.attendancesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class takeAttendance extends ActivityLogin {


    CheckBox ch1;
    CheckBox ch2;
    CheckBox ch3;
    CheckBox ch4;
    CheckBox ch5;
    CheckBox ch6;
    CheckBox ch7;
    CheckBox ch8;
    CheckBox ch9;
    CheckBox ch10;
    CheckBox ch11;
    CheckBox ch12;
    Button submit;

    StudentModel studentmodel1 = null;
    StudentModel studentmodel2 = null;
    StudentModel studentmodel3 = null;
    StudentModel studentmodel4 = null;
    StudentModel studentmodel5 = null;
    StudentModel studentmodel6 = null;
    StudentModel studentmodel7 = null;
    StudentModel studentmodel8 = null;
    StudentModel studentmodel9 = null;
    StudentModel studentmodel10 = null;
    StudentModel studentmodel11 = null;
    StudentModel studentmodel12 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sttudents_android);

        db = new Database(getApplicationContext());
        ch1=(CheckBox)findViewById(R.id.Aashna);
        ch2=(CheckBox)findViewById(R.id.Abhi);
        ch3=(CheckBox)findViewById(R.id.Ayush);
        ch4=(CheckBox)findViewById(R.id.Dhanvin);
        ch5=(CheckBox)findViewById(R.id.Dharthi);
        ch6=(CheckBox)findViewById(R.id.Kushi);
        ch7=(CheckBox)findViewById(R.id.Milana);
        ch8=(CheckBox)findViewById(R.id.Prajaktha);
        ch9=(CheckBox)findViewById(R.id.Sejal);
        ch10=(CheckBox)findViewById(R.id.Siddharth);
        ch11=(CheckBox)findViewById(R.id.Suhas);
        ch12=(CheckBox)findViewById(R.id.Yohana);

        submit=findViewById(R.id.submit);

        studentmodel1 = new StudentModel(1, "Aashna", 0, 0);
        studentmodel2 = new StudentModel(2, "Abhi", 0, 0);
        studentmodel3 = new StudentModel(3, "Ayush", 0, 0);
        studentmodel4 = new StudentModel(4, "Dhanvin", 0, 0);
        studentmodel5 = new StudentModel(5, "Dharthi", 0, 0);
        studentmodel6 = new StudentModel(6, "Kushi", 0, 0);
        studentmodel7 = new StudentModel(7, "Milana", 0, 0);
        studentmodel8 = new StudentModel(8, "Prajaktha", 0, 0);
        studentmodel9 = new StudentModel(9, "Sejal", 0, 0);
        studentmodel10 = new StudentModel(10, "Siddharth", 0, 0);
        studentmodel11 = new StudentModel(11, "Suhas", 0, 0);
        studentmodel12 = new StudentModel(12, "Yohana", 0, 0);

        db.addOne(studentmodel1);
        db.addOne(studentmodel2);
        db.addOne(studentmodel3);
        db.addOne(studentmodel4);
        db.addOne(studentmodel5);
        db.addOne(studentmodel6);
        db.addOne(studentmodel7);
        db.addOne(studentmodel8);
        db.addOne(studentmodel9);
        db.addOne(studentmodel10);
        db.addOne(studentmodel11);
        db.addOne(studentmodel12);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.updateClassHeld();
                if(ch1.isChecked()){
                    db.updateAttendance(1);
                }
                if(ch2.isChecked()){
                    db.updateAttendance(2);
                }
                if(ch3.isChecked()){
                    db.updateAttendance(3);
                }
                if(ch4.isChecked()){
                    db.updateAttendance(4);
                }
                if(ch5.isChecked()){
                    db.updateAttendance(5);
                }
                if(ch6.isChecked()){
                    db.updateAttendance(6);
                }
                if(ch7.isChecked()){
                    db.updateAttendance(7);
                }
                if(ch8.isChecked()){
                    db.updateAttendance(8);
                }
                if(ch9.isChecked()){
                    db.updateAttendance(9);
                }
                if(ch10.isChecked()){
                    db.updateAttendance(10);
                }
                if(ch11.isChecked()){
                    db.updateAttendance(11);
                }
                if(ch12.isChecked()){
                    db.updateAttendance(12);
                }
            }
        });

    }
}
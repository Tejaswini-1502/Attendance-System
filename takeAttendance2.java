package com.example.attendancesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class takeAttendance2 extends ActivityLogin {


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

        db.addOneNET(studentmodel1);
        db.addOneNET(studentmodel2);
        db.addOneNET(studentmodel3);
        db.addOneNET(studentmodel4);
        db.addOneNET(studentmodel5);
        db.addOneNET(studentmodel6);
        db.addOneNET(studentmodel7);
        db.addOneNET(studentmodel8);
        db.addOneNET(studentmodel9);
        db.addOneNET(studentmodel10);
        db.addOneNET(studentmodel11);
        db.addOneNET(studentmodel12);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.updateClassHeldNET();
                if(ch1.isChecked()){
                    db.updateAttendanceNET(1);
                }
                if(ch2.isChecked()){
                    db.updateAttendanceNET(2);
                }
                if(ch3.isChecked()){
                    db.updateAttendanceNET(3);
                }
                if(ch4.isChecked()){
                    db.updateAttendanceNET(4);
                }
                if(ch5.isChecked()){
                    db.updateAttendanceNET(5);
                }
                if(ch6.isChecked()){
                    db.updateAttendanceNET(6);
                }
                if(ch7.isChecked()){
                    db.updateAttendanceNET(7);
                }
                if(ch8.isChecked()){
                    db.updateAttendanceNET(8);
                }
                if(ch9.isChecked()){
                    db.updateAttendanceNET(9);
                }
                if(ch10.isChecked()){
                    db.updateAttendanceNET(10);
                }
                if(ch11.isChecked()){
                    db.updateAttendanceNET(11);
                }
                if(ch12.isChecked()){
                    db.updateAttendanceNET(12);
                }
            }
        });

    }
}

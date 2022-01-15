package com.example.attendancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLogin extends AppCompatActivity {
    //references to buttons and other controls on the layout
    EditText username;
    EditText password;
    Button login;
    public Database db;
    courses c1,c2,c3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.btn_login);

        db = new Database(getApplicationContext());
        //db.delete();
        login l1 = new login("Jennifer","jen@123");
        //login l2 = new login("Yashasvi","yash@123");
        boolean success = db.insert(l1);
        //db.insert(l2);
        Toast.makeText(getApplicationContext(),"Success: "+success,Toast.LENGTH_SHORT).show();
        c1 = new courses(1,"ANDROID","Jennifer");
        c2 = new courses(2,"NETWORKS","Jennifer");
        c3 = new courses(3,"DBMS","Jennifer");
        db.insertCourses(c1);
        db.insertCourses(c2);
        db.insertCourses(c3);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("") || pass.equals("")){
                    Toast.makeText(getApplicationContext(),"Please enter all fields",Toast.LENGTH_SHORT).show();
                }
                else{
                    boolean checkuser = db.checkUsername(user);
                    if(checkuser==true){
                        boolean checkuserpwd = db.checkUsernamePwd(user,pass);
                        if(checkuserpwd==true){
                            Toast.makeText(getApplicationContext(),"Successful Login",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getBaseContext(), coursesActivity.class);
                            intent.putExtra("user-key", user);
                            startActivity(intent);

                        }else{
                            Toast.makeText(getApplicationContext(),"Wrong Password",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Unsuccessful Login",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}


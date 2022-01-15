package com.example.attendancesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class welcomeTeacher extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welteacher);

        Button conti = findViewById(R.id.button);
        Animation bounce_anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        conti.startAnimation(bounce_anim);

        getSupportActionBar().hide();

        conti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),ActivityLogin.class);
                startActivity(intent);
            }
        });

    }
}

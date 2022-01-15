package com.example.welcome_teacher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button conti = findViewById(R.id.button);
        Animation bounce_anim = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move);
        conti.startAnimation(bounce_anim);

        getSupportActionBar().hide();
    }
}
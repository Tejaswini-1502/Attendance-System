package com.example.presence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView pres = findViewById(R.id.presence);
        Animation bounce_anim = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);
        pres.startAnimation(bounce_anim);

        getSupportActionBar().hide();

       /* new Handler().postDelayed(new Runnable() {

// Using handler with postDelayed called runnable run method

            @Override

            public void run() {

                Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);

                startActivity(i);

                // close this activity

                finish();

            }

        }, 5*1000); // wait for 5 seconds
*/

    }
}
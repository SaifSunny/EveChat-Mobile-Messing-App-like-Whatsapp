package com.example.evechat.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.evechat.R;

public class Opening extends AppCompatActivity {

    Animation topAnim, bottomAnim;
    ImageView logo;
    TextView appName;

    private static int TIMER = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);
        getSupportActionBar().hide();

        topAnim= AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        logo =findViewById(R.id.app_logo);
        appName =findViewById(R.id.app_name);

        logo.setAnimation(topAnim);
        appName.setAnimation(bottomAnim);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Opening.this, PhoneNumber.class);
                startActivity(intent);
                finish();
            }
        },TIMER);

    }
}
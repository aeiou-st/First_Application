package com.example.firstapplication.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.example.firstapplication.MainActivity;
import com.example.firstapplication.R;

public class SplashActivity extends AppCompatActivity {
    TextView textView;
//    private int SPLASH_TIMER = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        textView = (TextView)findViewById(R.id.splashTv1);
//  Handler for delay splash
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));;
                finish();
            }
        },3000);
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);

    }
}
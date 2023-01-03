package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplachScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);

        if(getActionBar()!= null)
        {
            getActionBar().hide();
        }


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splach = new Intent(SplachScreen.this,Dashboard.class);
                startActivity(splach);
                finish();
            }
        },3000);

    }
}
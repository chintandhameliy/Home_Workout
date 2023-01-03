package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class Workout extends AppCompatActivity {

    CardView fullBody,arm,abs,chest,leg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        fullBody=findViewById(R.id.fullBody);
        arm = findViewById(R.id.arm);
        abs = findViewById(R.id.abs);
        chest = findViewById(R.id.chest);
        leg = findViewById(R.id.leg);
        Intent setImages=getIntent();
       int a= setImages.getIntExtra("integer",0);
       if (a==2){
           fullBody.setBackgroundResource(R.drawable.female_fullbody);
           arm.setBackgroundResource(R.drawable.female_arm);
           chest.setBackgroundResource(R.drawable.female_butt);
           abs.setBackgroundResource(R.drawable.female_abs);
           leg.setBackgroundResource(R.drawable.female_leg);
       }
       else if (a==1){
               fullBody.setBackgroundResource(R.drawable.male_fullbody);
               arm.setBackgroundResource(R.drawable.male_arm);
               chest.setBackgroundResource(R.drawable.male_chest);
               abs.setBackgroundResource(R.drawable.male_abs);
               leg.setBackgroundResource(R.drawable.male_leg);
       }


    }
}
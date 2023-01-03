package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    CardView male,female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent maleworkout = new Intent(Dashboard.this,Workout.class);
                maleworkout.putExtra("FullBody",R.drawable.male_fullbody);
                maleworkout.putExtra("Arm",R.drawable.male_arm);
                maleworkout.putExtra("Chest",R.drawable.male_chest);
                maleworkout.putExtra("Abs",R.drawable.male_abs);
                maleworkout.putExtra("Leg",R.drawable.male_leg);
                startActivity(maleworkout);
            }
        });


        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent femaleworkout = new Intent(Dashboard.this,Workout.class);
                femaleworkout.putExtra("FullBody",R.drawable.female_fullbody);
                femaleworkout.putExtra("Arm",R.drawable.female_arm);
                femaleworkout.putExtra("Abs",R.drawable.female_abs);
                femaleworkout.putExtra("Butt",R.drawable.female_butt);
                femaleworkout.putExtra("Leg",R.drawable.female_leg);
                startActivity(femaleworkout);
            }
        });

    }

}
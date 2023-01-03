package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    CardView male,female;
    private int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent maleWorkout = new Intent(Dashboard.this,Workout.class);
                a=1;
                maleWorkout.putExtra("integer",a);
                startActivity(maleWorkout);
            }
        });


        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent femaleWorkout = new Intent(Dashboard.this,Workout.class);
                a=2;
                femaleWorkout.putExtra("integer",a);

                startActivity(femaleWorkout);
            }
        });

    }

}
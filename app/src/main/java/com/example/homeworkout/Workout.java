package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Workout extends AppCompatActivity {

    CardView fullbody,arm,abs,chest,leg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        fullbody = findViewById(R.id.fullbody);
        arm = findViewById(R.id.arm);
        abs = findViewById(R.id.abs);
        chest = findViewById(R.id.chest);
        leg = findViewById(R.id.leg);

        fullbody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Workout.this,AllExercise.class);
                startActivity(i);
            }
        });

        arm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Workout.this,AllExercise.class);
                startActivity(i);
            }
        });

        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Workout.this,AllExercise.class);
                startActivity(i);
            }
        });
        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Workout.this,AllExercise.class);
                startActivity(i);
            }
        });
        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Workout.this,AllExercise.class);
                startActivity(i);
            }
        });




    }
}
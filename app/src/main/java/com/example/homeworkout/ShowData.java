package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class ShowData extends AppCompatActivity {
    Toolbar toolbar;
    TextView name,desc;
    LottieAnimationView animation;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        toolbar=findViewById(R.id.toolbar);
        animation=findViewById(R.id.animation);
        name=findViewById(R.id.name);
        desc=findViewById(R.id.desc);
        back=findViewById(R.id.back);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            toolbar.setTitle("All Exercise");
        }
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Intent intent=getIntent();
       animation.setAnimation(intent.getIntExtra("Animation",0));
       name.setText(intent.getStringExtra("Name"));
       desc.setText(intent.getIntExtra("Description",0));
    }
}
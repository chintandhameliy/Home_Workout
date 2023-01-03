package com.example.homeworkout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;

public class AllExercise extends AppCompatActivity {
    RecyclerView recyclerView;
    Toolbar toolbar;
    ArrayList<ChoiseClass> arrayList = new ArrayList<>();
    ArrayList<ChoiseClass> arrayList1 = new ArrayList<>();
    ArrayList<ChoiseClass> arrayList2 = new ArrayList<>();
    ArrayList<ChoiseClass> arrayList3 = new ArrayList<>();
    ArrayList<ChoiseClass> arrayList4 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_exercise);

        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setTitle("All Exercise");
        }

        //toolbar.setTitle("All Exercise");

        arrayList.add(new ChoiseClass(R.raw.jumpingjacks,"JUMPING JACK","00:20",R.string.jumingjack));
        arrayList.add(new ChoiseClass(R.raw.inclinepushups,"INCLINE PUSH-UPS","X16",R.string.inclinepushup));
        arrayList.add(new ChoiseClass(R.raw.kneepushups,"KNEE PUSH-UPS","X10",R.string.kneepushup));
        arrayList.add(new ChoiseClass(R.raw.pushups,"PUSH-UPS","X8",R.string.pushup));
        arrayList.add(new ChoiseClass(R.raw.widearmpushups,"WIDE ARM PUSH-UPS","X8",R.string.widearmpushup));
        arrayList.add(new ChoiseClass(R.raw.inclinepushups,"INCLINE PUSH-UPS","X16",R.string.inclinepushup));
        arrayList.add(new ChoiseClass(R.raw.kneepushups,"KNEE PUSH-UPS","X10",R.string.kneepushup));
        arrayList.add(new ChoiseClass(R.raw.pushups,"PUSH-UPS","X8",R.string.pushup));
        arrayList.add(new ChoiseClass(R.raw.widearmpushups,"WIDE ARM PUSH-UPS","X8",R.string.widearmpushup));
        arrayList.add(new ChoiseClass(R.raw.cobrastretch,"COBRA STRETCH","00:20",R.string.cobrastrecth));
        arrayList.add(new ChoiseClass(R.raw.cheststretch,"CHEST STRETCH","00:20",R.string.cheststretch));
        ChoiseAdapter adapter = new ChoiseAdapter(this,arrayList);
        recyclerView.setAdapter(adapter);


        arrayList1.add(new ChoiseClass(R.raw.sidehop,"SIDE HOP","00:30",R.string.sidehop));
        arrayList1.add(new ChoiseClass(R.raw.squats,"SQUATS","X12",R.string.squats));
        arrayList1.add(new ChoiseClass(R.raw.squats,"SQUATS","X12",R.string.squats));
        arrayList1.add(new ChoiseClass(R.raw.sidelyinglegliftleft,"SIDE-LYING LEG LIFT LEFT","X12",R.string.sidelayinglegliftleft));
        arrayList1.add(new ChoiseClass(R.raw.sidelyinglegliftright,"SIDE-LYING LEG LIFT RIGHT","X12",R.string.sidelayinglegliftright));
        arrayList1.add(new ChoiseClass(R.raw.sidelyinglegliftleft,"SIDE-LYING LEG LIFT LEFT","X12",R.string.sidelayinglegliftleft));
        arrayList1.add(new ChoiseClass(R.raw.kneepushups,"SIDE-LYING LEG LIFT RIGHT","X12",R.string.sidelayinglegliftright));
        arrayList1.add(new ChoiseClass(R.raw.backwardlunge,"BACKWARD LUNGE","X14",R.string.backwarglunge));
        arrayList1.add(new ChoiseClass(R.raw.backwardlunge,"BACKWARD LUNGE","X14",R.string.backwarglunge));
        arrayList1.add(new ChoiseClass(R.raw.donkeykicksleft,"DONKEY KICK LEFT","X16",R.string.donkeykicksleft));
        arrayList1.add(new ChoiseClass(R.raw.donkeykicksright,"DONKEY KICK RIGHT","X16",R.string.donkeykicksright));
        arrayList1.add(new ChoiseClass(R.raw.donkeykicksleft,"DONKEY KICK LEFT","X16",R.string.donkeykicksleft));
        arrayList1.add(new ChoiseClass(R.raw.donkeykicksright,"DONKEY KICK RIGHT","X16",R.string.donkeykicksright));


    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemId = item.getItemId();

        if(itemId == android.R.id.home)
        {
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
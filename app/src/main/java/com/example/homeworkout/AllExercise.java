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
        ChoiseAdapter adapter1 = new ChoiseAdapter(this,arrayList1);
        recyclerView.setAdapter(adapter1);


        arrayList2.add(new ChoiseClass(R.raw.jumpingjacks,"JUMPING JACK","00:20",R.string.jumingjack));
        arrayList2.add(new ChoiseClass(R.raw.abdominalcrunches,"ABODOMINAL CRUNCHES","X16",R.string.abodominalcrunches));
        arrayList2.add(new ChoiseClass(R.raw.russiantwist,"RUSSIAN TWIST","X20",R.string.russiantwist));
        arrayList2.add(new ChoiseClass(R.raw.mountainclimber,"MOUNTAIN CLIMBER","X16",R.string.mountainclimber));
        arrayList2.add(new ChoiseClass(R.raw.heeltouch,"HEEL TOUCH","X20",R.string.heeltouch));
        arrayList2.add(new ChoiseClass(R.raw.legraises,"LEG RAISES","X16",R.string.plank));
        arrayList2.add(new ChoiseClass(R.raw.plank,"PLANK","00:20",R.string.armraises));
        arrayList2.add(new ChoiseClass(R.raw.abdominalcrunches,"ABODOMINAL CRUNCHES","X12",R.string.abodominalcrunches));
        arrayList2.add(new ChoiseClass(R.raw.russiantwist,"RUSSIAN TWIST","X32",R.string.russiantwist));
        arrayList2.add(new ChoiseClass(R.raw.mountainclimber,"MOUNTAIN CLIMBER","X12",R.string.mountainclimber));
        arrayList2.add(new ChoiseClass(R.raw.heeltouch,"HEEL TOUCH","X20",R.string.heeltouch));
        arrayList2.add(new ChoiseClass(R.raw.legraises,"LEG RAISES","X14",R.string.legraises));
        arrayList2.add(new ChoiseClass(R.raw.plank,"PLANK","00:30",R.string.plank));
        arrayList2.add(new ChoiseClass(R.raw.cobrastretch,"COBRA STRETCH","00:30",R.string.cobrastrecth));
        arrayList2.add(new ChoiseClass(R.raw.spinelumbartwiststretchleleft,"SPINE LUMBER TWIST STRETCH LEFT","00:30",R.string.spinelumbertwiststretchleft));
        arrayList2.add(new ChoiseClass(R.raw.spinelumbartwiststretchleright,"SPINE LUMBER TWIST STRETCH RIGHT","00:30",R.string.spinelumbertwiststretchright));
        ChoiseAdapter adapter2 = new ChoiseAdapter(this,arrayList2);
        recyclerView.setAdapter(adapter2);


        arrayList3.add(new ChoiseClass(R.raw.armrises,"ARM RAISES","00:30",R.string.armraises));
        arrayList3.add(new ChoiseClass(R.raw.sidearmraises,"SIDE ARM RAISE","00:30",R.string.sidearmraises));
        arrayList3.add(new ChoiseClass(R.raw.tricepsdips,"TRICEPS DIPS","X10",R.string.tricepsdips));
        arrayList3.add(new ChoiseClass(R.raw.armcirclesclickwise,"ARM CIRCLES CLOCKWISE","00:30",R.string.armcirclesclickwise));
        arrayList3.add(new ChoiseClass(R.raw.armcirclescounterclickwise,"ARM CIRCLES COUNTERCLOCKWISE","00:30",R.string.armcirclescounterclickwise));
        arrayList3.add(new ChoiseClass(R.raw.diamondpushups,"DIAMOND PUSH-UPS","X6",R.string.diamondpushups));
        arrayList3.add(new ChoiseClass(R.raw.jumpingjacks,"JUMPING JACK","00:30",R.string.jumingjack));
        arrayList3.add(new ChoiseClass(R.raw.chestpresspulse,"CHEST PRESS PULSE","00:16",R.string.chestpresspulse));
        arrayList3.add(new ChoiseClass(R.raw.legbrbellcurlleft,"LEG BARBELL CURL LEFT","X8",R.string.legbrbellcurlleft));
        arrayList3.add(new ChoiseClass(R.raw.legbrbellcurlright,"LEG BARBELL CURL RIGHT","X8",R.string.legbrbellcurlright));
        arrayList3.add(new ChoiseClass(R.raw.diagonalplank,"DIAGONAL PLANK","X10",R.string.diagonalplank));
        arrayList3.add(new ChoiseClass(R.raw.punches,"PUNCHES","00:30",R.string.punches));
        arrayList3.add(new ChoiseClass(R.raw.pushups,"PUSH-UPS","X10",R.string.pushup));
        arrayList3.add(new ChoiseClass(R.raw.inchworms,"INCHWORMS","X8",R.string.inchworms));
        arrayList3.add(new ChoiseClass(R.raw.wallpushups,"WALL PUSH-UPS","X12",R.string.wallpushups));
        arrayList3.add(new ChoiseClass(R.raw.tricepsstretchleft,"TRICEPS STRETCH LEFT","00:30",R.string.tricepsstretchleft));
        arrayList3.add(new ChoiseClass(R.raw.tricepsstretchright,"TRICEPS STRETCH RIGHT","00:30",R.string.tricepsstretchright));
        arrayList3.add(new ChoiseClass(R.raw.standingbicepsstretchleft,"STANDING BICEPS STRETCH LEFT","00:30",R.string.standingbicepsstretchleft));
        arrayList3.add(new ChoiseClass(R.raw.standingbicepsstretchright,"STANDING BICEPS STRETCH RIGHT","00:30",R.string.standingbicepsstretchright));
        ChoiseAdapter adapter3 = new ChoiseAdapter(this,arrayList3);
        recyclerView.setAdapter(adapter3);


        arrayList4.add(new ChoiseClass(R.raw.jumpingjacks,"JUMPING JACK","00:30",R.string.jumingjack));
        arrayList4.add(new ChoiseClass(R.raw.inclinepushups,"INCLINE PUSH-UPS","X6",R.string.inclinepushup));
        arrayList4.add(new ChoiseClass(R.raw.pushups,"PUSH-UPS","X4",R.string.pushup));
        arrayList4.add(new ChoiseClass(R.raw.widearmpushups,"WIDE ARM PUSH-UPS","X4",R.string.widearmpushup));
        arrayList4.add(new ChoiseClass(R.raw.tricepsdips,"TRICEPS DIPS","X6",R.string.tricepsdips));
        arrayList4.add(new ChoiseClass(R.raw.widearmpushups,"WIDE ARM PUSH-UPS","X4",R.string.widearmpushup));
        arrayList4.add(new ChoiseClass(R.raw.inclinepushups,"INCLINE PUSH-UPS","X4",R.string.inclinepushup));
        arrayList4.add(new ChoiseClass(R.raw.tricepsdips,"TRICEPS DIPS","X4",R.string.tricepsdips));
        arrayList4.add(new ChoiseClass(R.raw.kneepushups,"KNEE PUSH-UPS","X4",R.string.kneepushup));
        arrayList4.add(new ChoiseClass(R.raw.cobrastretch,"COBRA STRETCH","00:20",R.string.cobrastrecth));
        arrayList4.add(new ChoiseClass(R.raw.cheststretch,"CHEST STRETCH","00:20",R.string.cheststretch));
        ChoiseAdapter adapter4 = new ChoiseAdapter(this,arrayList4);
        recyclerView.setAdapter(adapter4);

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
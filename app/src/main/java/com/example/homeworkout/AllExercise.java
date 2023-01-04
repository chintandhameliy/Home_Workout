package com.example.homeworkout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class AllExercise extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageView back;
    int a,b;
    Toolbar toolbar;
    int [] resources;
    String [] duration;
    String [] name;
    MaterialButton button;
    TextView toolbarTitle;
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
        back=findViewById(R.id.back);
        button=findViewById(R.id.button);
        toolbarTitle=findViewById(R.id.toolbarTitle);
        Intent send=new Intent(this,Exercise.class);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        Intent integer=getIntent();
        setSupportActionBar(toolbar);
       a= integer.getIntExtra("integer1",0);
        toolbarTitle.setText(integer.getStringExtra("toolbarText"));
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
        //toolbar.setTitle("All Exercise");
if (a==1) {
    arrayList.add(new ChoiseClass(R.raw.jumpingjacks, "JUMPING JACK", "00:20", R.string.jumingjack));
    arrayList.add(new ChoiseClass(R.raw.inclinepushups, "INCLINE PUSH-UPS", "X16", R.string.inclinepushup));
    arrayList.add(new ChoiseClass(R.raw.kneepushups, "KNEE PUSH-UPS", "X10", R.string.kneepushup));
    arrayList.add(new ChoiseClass(R.raw.pushups, "PUSH-UPS", "X8", R.string.pushup));
    arrayList.add(new ChoiseClass(R.raw.widearmpushups, "WIDE ARM PUSH-UPS", "X8", R.string.widearmpushup));
    arrayList.add(new ChoiseClass(R.raw.inclinepushups, "INCLINE PUSH-UPS", "X16", R.string.inclinepushup));
    arrayList.add(new ChoiseClass(R.raw.kneepushups, "BOX PUSH-UPS", "X10", R.string.kneepushup));
    arrayList.add(new ChoiseClass(R.raw.widearmpushups, "WIDE ARM PUSH-UPS", "X8", R.string.widearmpushup));
    arrayList.add(new ChoiseClass(R.raw.pushups, "HINDU PUSH-UPS", "X8", R.string.pushup));
    arrayList.add(new ChoiseClass(R.raw.cobrastretch, "COBRA STRETCH", "00:20", R.string.cobrastrecth));
    arrayList.add(new ChoiseClass(R.raw.cheststretch, "CHEST STRETCH", "00:20", R.string.cheststretch));
    resources= new int[]{R.raw.jumpingjacks, R.raw.inclinepushups, R.raw.kneepushups, R.raw.pushups, R.raw.widearmpushups, R.raw.inclinepushups, R.raw.boxpushups, R.raw.widearmpushups, R.raw.hindupushups, R.raw.cobrastretch, R.raw.cheststretch};
    name= new String[]{"JUMPING JACK", "INCLINE PUSH-UPS", "KNEE PUSH-UPS", "PUSH-UPS", "WIDE ARM PUSH-UPS", "INCLINE PUSH-UPS", "BOX PUSH-UPS", "WIDE ARM PUSH-UPS", "HINDU PUSH-UPS", "COBRA STRETCH", "CHEST STRETCH"};
    duration= new String[]{"00:30", "X6", "X4", "X4", "X6", "X4", "X4", "X4", "X4", "00:20", "00:20"};
    ChoiseAdapter adapter = new ChoiseAdapter(this, arrayList);
    recyclerView.setAdapter(adapter);
}
else if (a==2) {
    arrayList1.add(new ChoiseClass(R.raw.sidehop, "SIDE HOP", "00:30", R.string.sidehop));
    arrayList1.add(new ChoiseClass(R.raw.squats, "SQUATS", "X12", R.string.squats));
    arrayList1.add(new ChoiseClass(R.raw.squats, "SQUATS", "X12", R.string.squats));
    arrayList1.add(new ChoiseClass(R.raw.sidelyinglegliftleft, "SIDE-LYING LEG LIFT LEFT", "X12", R.string.sidelayinglegliftleft));
    arrayList1.add(new ChoiseClass(R.raw.sidelyinglegliftright, "SIDE-LYING LEG LIFT RIGHT", "X12", R.string.sidelayinglegliftright));
    arrayList1.add(new ChoiseClass(R.raw.sidelyinglegliftleft, "SIDE-LYING LEG LIFT LEFT", "X12", R.string.sidelayinglegliftleft));
    arrayList1.add(new ChoiseClass(R.raw.kneepushups, "SIDE-LYING LEG LIFT RIGHT", "X12", R.string.sidelayinglegliftright));
    arrayList1.add(new ChoiseClass(R.raw.backwardlunge, "BACKWARD LUNGE", "X14", R.string.backwarglunge));
    arrayList1.add(new ChoiseClass(R.raw.backwardlunge, "BACKWARD LUNGE", "X14", R.string.backwarglunge));
    arrayList1.add(new ChoiseClass(R.raw.donkeykicksleft, "DONKEY KICK LEFT", "X16", R.string.donkeykicksleft));
    arrayList1.add(new ChoiseClass(R.raw.donkeykicksright, "DONKEY KICK RIGHT", "X16", R.string.donkeykicksright));
    arrayList1.add(new ChoiseClass(R.raw.donkeykicksleft, "DONKEY KICK LEFT", "X16", R.string.donkeykicksleft));
    arrayList1.add(new ChoiseClass(R.raw.donkeykicksright, "DONKEY KICK RIGHT", "X16", R.string.donkeykicksright));

    resources=new int[]{R.raw.sidehop, R.raw.squats,R.raw.squats,R.raw.sidelyinglegliftleft, R.raw.sidelyinglegliftright, R.raw.sidelyinglegliftleft, R.raw.kneepushups, R.raw.backwardlunge, R.raw.backwardlunge, R.raw.donkeykickleft, R.raw.donkeykicksright, R.raw.donkeykickleft, R.raw.donkeykicksright};
    name= new String[]{"SIDE HOP", "SQUATS", "SQUATS", "SIDE-LYING LEG LIFT LEFT", "SIDE-LYING LEG LIFT RIGHT", "SIDE-LYING LEG LIFT LEFT", "SIDE-LYING LEG LIFT RIGHT", "BACKWARD LUNGE", "BACKWARD LUNGE", "DONKEY KICK LEFT", "DONKEY KICK RIGHT", "DONKEY KICK LEFT", "DONKEY KICK RIGHT"};
     duration= new String[]{"00:30", "X12", "X12", "X12", "X12", "X12", "X12", "X14", "X14", "X16", "X16", "X16", "X16"};
    ChoiseAdapter adapter1 = new ChoiseAdapter(this, arrayList1);
    recyclerView.setAdapter(adapter1);
}
else if(a==3) {
    arrayList2.add(new ChoiseClass(R.raw.jumpingjacks, "JUMPING JACK", "00:20", R.string.jumingjack));
    arrayList2.add(new ChoiseClass(R.raw.abdominalcrunches, "ABODOMINAL CRUNCHES", "X16", R.string.abodominalcrunches));
    arrayList2.add(new ChoiseClass(R.raw.russiantwist, "RUSSIAN TWIST", "X20", R.string.russiantwist));
    arrayList2.add(new ChoiseClass(R.raw.mountainclimber, "MOUNTAIN CLIMBER", "X16", R.string.mountainclimber));
    arrayList2.add(new ChoiseClass(R.raw.heeltouch, "HEEL TOUCH", "X20", R.string.heeltouch));
    arrayList2.add(new ChoiseClass(R.raw.legraises, "LEG RAISES", "X16", R.string.plank));
    arrayList2.add(new ChoiseClass(R.raw.plank, "PLANK", "00:20", R.string.armraises));
    arrayList2.add(new ChoiseClass(R.raw.abdominalcrunches, "ABODOMINAL CRUNCHES", "X12", R.string.abodominalcrunches));
    arrayList2.add(new ChoiseClass(R.raw.russiantwist, "RUSSIAN TWIST", "X32", R.string.russiantwist));
    arrayList2.add(new ChoiseClass(R.raw.mountainclimber, "MOUNTAIN CLIMBER", "X12", R.string.mountainclimber));
    arrayList2.add(new ChoiseClass(R.raw.heeltouch, "HEEL TOUCH", "X20", R.string.heeltouch));
    arrayList2.add(new ChoiseClass(R.raw.legraises, "LEG RAISES", "X14", R.string.legraises));
    arrayList2.add(new ChoiseClass(R.raw.plank, "PLANK", "00:30", R.string.plank));
    arrayList2.add(new ChoiseClass(R.raw.cobrastretch, "COBRA STRETCH", "00:30", R.string.cobrastrecth));
    arrayList2.add(new ChoiseClass(R.raw.spinelumbartwiststretchleleft, "SPINE LUMBER TWIST STRETCH LEFT", "00:30", R.string.spinelumbertwiststretchleft));
    arrayList2.add(new ChoiseClass(R.raw.spinelumbartwiststretchleright, "SPINE LUMBER TWIST STRETCH RIGHT", "00:30", R.string.spinelumbertwiststretchright));
    resources= new int[]{R.raw.jumpingjacks, R.raw.abdominalcrunches, R.raw.russiantwist, R.raw.mountainclimber, R.raw.heeltouch, R.raw.legraises, R.raw.plank, R.raw.abdominalcrunches, R.raw.russiantwist, R.raw.mountainclimber, R.raw.heeltouch, R.raw.legraises, R.raw.plank, R.raw.cobrastretch, R.raw.spinelumbartwiststretchleleft, R.raw.spinelumbartwiststretchleright};
    name= new String[]{"JUMPING JACK", "ABODOMINAL CRUNCHES", "RUSSIAN TWIST", "MOUNTAIN CLIMBER", "HEEL TOUCH", "LEG RAISES", "PLANK", "ABODOMINAL CRUNCHES", "RUSSIAN TWIST", "MOUNTAIN CLIMBER", "HEEL TOUCH", "LEG RAISES", "PLANK", "COBRA STRETCH", "SPINE LUMBER TWIST STRETCH LEFT", "SPINE LUMBER TWIST STRETCH RIGHT"};
     duration= new String[]{"00:20", "X16", "X20", "X16", "X20", "X16", "00:20", "X12", "X32", "X12", "X20", "X14", "00:30", "00:30", "00:30", "00:30"};
    ChoiseAdapter adapter2 = new ChoiseAdapter(this, arrayList2);
    recyclerView.setAdapter(adapter2);




}
else if (a==4) {
    arrayList3.add(new ChoiseClass(R.raw.armrises, "ARM RAISES", "00:30", R.string.armraises));
    arrayList3.add(new ChoiseClass(R.raw.sidearmraises, "SIDE ARM RAISE", "00:30", R.string.sidearmraises));
    arrayList3.add(new ChoiseClass(R.raw.tricepsdips, "TRICEPS DIPS", "X10", R.string.tricepsdips));
    arrayList3.add(new ChoiseClass(R.raw.armcirclesclickwise, "ARM CIRCLES CLOCKWISE", "00:30", R.string.armcirclesclickwise));
    arrayList3.add(new ChoiseClass(R.raw.armcirclescounterclickwise, "ARM CIRCLES COUNTERCLOCKWISE", "00:30", R.string.armcirclescounterclickwise));
    arrayList3.add(new ChoiseClass(R.raw.diamondpushups, "DIAMOND PUSH-UPS", "X6", R.string.diamondpushups));
    arrayList3.add(new ChoiseClass(R.raw.jumpingjacks, "JUMPING JACK", "00:30", R.string.jumingjack));
    arrayList3.add(new ChoiseClass(R.raw.chestpresspulse, "CHEST PRESS PULSE", "00:16", R.string.chestpresspulse));
    arrayList3.add(new ChoiseClass(R.raw.legbrbellcurlleft, "LEG BARBELL CURL LEFT", "X8", R.string.legbrbellcurlleft));
    arrayList3.add(new ChoiseClass(R.raw.legbrbellcurlright, "LEG BARBELL CURL RIGHT", "X8", R.string.legbrbellcurlright));
    arrayList3.add(new ChoiseClass(R.raw.diagonalplank, "DIAGONAL PLANK", "X10", R.string.diagonalplank));
    arrayList3.add(new ChoiseClass(R.raw.punches, "PUNCHES", "00:30", R.string.punches));
    arrayList3.add(new ChoiseClass(R.raw.pushups, "PUSH-UPS", "X10", R.string.pushup));
    arrayList3.add(new ChoiseClass(R.raw.inchworms, "INCHWORMS", "X8", R.string.inchworms));
    arrayList3.add(new ChoiseClass(R.raw.wallpushups, "WALL PUSH-UPS", "X12", R.string.wallpushups));
    arrayList3.add(new ChoiseClass(R.raw.tricepsstretchleft, "TRICEPS STRETCH LEFT", "00:30", R.string.tricepsstretchleft));
    arrayList3.add(new ChoiseClass(R.raw.tricepsstretchright, "TRICEPS STRETCH RIGHT", "00:30", R.string.tricepsstretchright));
    arrayList3.add(new ChoiseClass(R.raw.standingbicepsstretchleft, "STANDING BICEPS STRETCH LEFT", "00:30", R.string.standingbicepsstretchleft));
    arrayList3.add(new ChoiseClass(R.raw.standingbicepsstretchright, "STANDING BICEPS STRETCH RIGHT", "00:30", R.string.standingbicepsstretchright));
    duration= new String[]{"00:30", "00:30", "X10", "00:30", "00:30", "X6", "00:30", "00:16", "X8", "X8", "X10", "00:30", "X10", "X8", "X12", "00:30", "00:30", "00:30", "00:30"};
    name= new String[]{"ARM RAISES", "SIDE ARM RAISE", "TRICEPS DIPS", "ARM CIRCLES CLOCKWISE", "ARM CIRCLES COUNTERCLOCKWISE", "DIAMOND PUSH-UPS", "JUMPING JACK", "CHEST PRESS PULSE", "LEG BARBELL CURL LEFT", "LEG BARBELL CURL RIGHT", "DIAGONAL PLANK", "PUNCHES", "PUSH-UPS", "INCHWORMS", "WALL PUSH-UPS", "TRICEPS STRETCH LEFT", "TRICEPS STRETCH RIGHT", "STANDING BICEPS STRETCH LEFT", "STANDING BICEPS STRETCH RIGHT"};
    resources= new int[]{R.raw.armrises, R.raw.sidearmraises, R.raw.tricepsdips, R.raw.armcirclesclickwise, R.raw.armcirclescounterclickwise, R.raw.diamondpushups, R.raw.jumpingjacks, R.raw.chestpresspulse, R.raw.legbrbellcurlleft, R.raw.legbrbellcurlright, R.raw.diagonalplank, R.raw.punches, R.raw.inchworms, R.raw.wallpushups, R.raw.tricepsstretchleft, R.raw.tricepsstretchright, R.raw.standingbicepsstretchleft, R.raw.standingbicepsstretchright};

    ChoiseAdapter adapter3 = new ChoiseAdapter(this, arrayList3);
    recyclerView.setAdapter(adapter3);
}
else if(a==5) {
    arrayList4.add(new ChoiseClass(R.raw.jumpingjacks, "JUMPING JACK", "00:30", R.string.jumingjack));
    arrayList4.add(new ChoiseClass(R.raw.inclinepushups, "INCLINE PUSH-UPS", "X6", R.string.inclinepushup));
    arrayList4.add(new ChoiseClass(R.raw.pushups, "PUSH-UPS", "X4", R.string.pushup));
    arrayList4.add(new ChoiseClass(R.raw.widearmpushups, "WIDE ARM PUSH-UPS", "X4", R.string.widearmpushup));
    arrayList4.add(new ChoiseClass(R.raw.tricepsdips, "TRICEPS DIPS", "X6", R.string.tricepsdips));
    arrayList4.add(new ChoiseClass(R.raw.widearmpushups, "WIDE ARM PUSH-UPS", "X4", R.string.widearmpushup));
    arrayList4.add(new ChoiseClass(R.raw.inclinepushups, "INCLINE PUSH-UPS", "X4", R.string.inclinepushup));
    arrayList4.add(new ChoiseClass(R.raw.tricepsdips, "TRICEPS DIPS", "X4", R.string.tricepsdips));
    arrayList4.add(new ChoiseClass(R.raw.kneepushups, "KNEE PUSH-UPS", "X4", R.string.kneepushup));
    arrayList4.add(new ChoiseClass(R.raw.cobrastretch, "COBRA STRETCH", "00:20", R.string.cobrastrecth));
    arrayList4.add(new ChoiseClass(R.raw.cheststretch, "CHEST STRETCH", "00:20", R.string.cheststretch));
    resources= new int[]{R.raw.jumpingjacks, R.raw.inclinepushups, R.raw.pushups, R.raw.widearmpushups, R.raw.tricepsdips, R.raw.widearmpushups, R.raw.inclinepushups, R.raw.tricepsdips, R.raw.kneepushups, R.raw.cobrastretch, R.raw.cheststretch};
    name= new String[]{"JUMPING JACK", "INCLINE PUSH-UPS", "PUSH-UPS", "WIDE ARM PUSH-UPS", "TRICEPS DIPS", "WIDE ARM PUSH-UPS", "INCLINE PUSH-UPS", "TRICEPS DIPS", "KNEE PUSH-UPS", "COBRA STRETCH", "CHEST STRETCH"};
    duration= new String[]{"00:30", "X6", "X4", "X4", "X6", "X4", "X4", "X4", "X4", "00:20", "00:20"};
    ChoiseAdapter adapter4 = new ChoiseAdapter(this, arrayList4);
    recyclerView.setAdapter(adapter4);
}
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        send.putExtra("resources",resources);
        send.putExtra("name",name);
        send.putExtra("duration",duration);
        send.putExtra("toolbarText",integer.getStringExtra("toolbarText"));
        startActivity(send);
    }
});

    }




}
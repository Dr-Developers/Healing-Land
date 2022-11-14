//package com.scorpion.healingland;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//public class Events extends AppCompatActivity {
//
//    Button submitbtn;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_events);
//
//        submitbtn =findViewById(R.id.subitbtn);
//
//        submitbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent i = new Intent(getApplicationContext(),EventAdd.class);
//                startActivity(i);
//            }
//        });
//    }
//
//    public void clickNew1(View view) {
//
//        Intent i = new Intent(getApplicationContext(), SeedDistribution.class);
//        startActivity(i);
//    }
//
//    public void clickNew(View view) {
//
//        Intent i = new Intent(getApplicationContext(), EventView.class);
//        startActivity(i);
//    }
//
//    public void clickNew2(View view) {
//
//        Intent i = new Intent(getApplicationContext(), PlantProgram.class);
//        startActivity(i);
//    }
//
//    public void clickNew3(View view) {
//
//        Intent i = new Intent(getApplicationContext(), SeedDistribution.class);
//        startActivity(i);
//    }
//}
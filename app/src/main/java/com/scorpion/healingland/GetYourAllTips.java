package com.scorpion.healingland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GetYourAllTips extends AppCompatActivity {

    Button addNewTip;
    ImageView rose;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_your_all_tips);

        addNewTip = findViewById(R.id.addTip);
        rose = findViewById(R.id.rose_button);

        addNewTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), AddGardenTips.class);
                startActivity(i);
            }
        });

        rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), RoseView.class);
                startActivity(i);
            }
        });

    }
}
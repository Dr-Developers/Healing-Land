package com.scorpion.healingland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeedDistribution extends AppCompatActivity {

    Button Event_update ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seed_distribution);

        Event_update =findViewById(R.id.Event_update);

        Event_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), EventUpdate.class);
                startActivity(i);
            }
        });
    }
}
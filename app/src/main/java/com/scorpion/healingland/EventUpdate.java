package com.scorpion.healingland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.scorpion.healingland.Database.DBHandler;

public class EventUpdate extends AppCompatActivity {

    EditText eventId, eventname, eventdescription, date, time, venue, cname, cnumber, imgurl;
    Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_update);

        eventname = findViewById(R.id.eventName);
        eventdescription = findViewById(R.id.eventDescription);
        date = findViewById(R.id.date);
        time = findViewById(R.id.time);
        venue = findViewById(R.id.venue);
        cname = findViewById(R.id.coordinatorName);
        cnumber = findViewById(R.id.coordinatorNumber);
        imgurl = findViewById(R.id.event_photo);
        update = findViewById(R.id.updatebtn);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                DBHandler dbHandler = new DBHandler(getApplicationContext());
//                String evenIdU = eventId.getText().toString();
//                String eventnameU = eventname.getText().toString();
//                String eventdescriptionU = eventdescription.getText().toString();
//                String dateU = date.getText().toString();
//                String timeU = time.getText().toString();
//                String venueU = venue.getText().toString();
//                String cnameU = cname.getText().toString();
//                String cnumberU = cnumber.getText().toString();
//                String imgurlU = imgurl.getText().toString();
//                Boolean status = dbHandler.EventUpdate(evenIdU, eventnameU, eventdescriptionU, dateU, timeU, venueU, cnameU, cnumberU, imgurlU );

                Toast.makeText(EventUpdate.this, "Updated Successfully", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(getApplicationContext(), Events.class);
                startActivity(i);

            }
        });
    }
}
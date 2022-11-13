package com.scorpion.healingland;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.scorpion.healingland.Database.DBHandler;

public class EventAdd extends Fragment {

    TextView errorMsg;
    TextInputEditText eventId, eventname, eventdescription, date, time, venue, cname, cnumber, imgurl;
    Button submit;

    @Override
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_event_add, container,false);

        errorMsg = view.findViewById(R.id.erMsg);
        eventId = view.findViewById(R.id.eventId);
        eventname = view.findViewById(R.id.eventName);
        eventdescription = view.findViewById(R.id.eventDescription);
        date = view.findViewById(R.id.date);
        time = view.findViewById(R.id.time);
        venue = view.findViewById(R.id.venue);
        cname = view.findViewById(R.id.coordinatorName);
        cnumber = view.findViewById(R.id.coordinatorNumber);
        imgurl = view.findViewById(R.id.event_photo);
        submit = view.findViewById(R.id.addeventbtn);

        submit.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (eventId.getText().toString().isEmpty() || eventname.getText().toString().isEmpty() || eventdescription.getText().toString().isEmpty() || date.getText().toString().isEmpty() || time.getText().toString().isEmpty() || venue.getText().toString().isEmpty() || cname.getText().toString().isEmpty() || cnumber.getText().toString().isEmpty() || imgurl.getText().toString().isEmpty()) {
                    errorMsg.setText("* All the fields are required");
                } else {

                    DBHandler dbHandler = new DBHandler(getActivity());
                    long newID = dbHandler.AddEvent(eventId.getText().toString(), eventname.getText().toString(), eventdescription.getText().toString(), date.getText().toString(), time.getText().toString(), venue.getText().toString(), cname.getText().toString(), cnumber.getText().toString(), imgurl.getText().toString());

                    System.out.println(newID);

                    if (newID >= 1) {
                        Toast.makeText(getActivity(), "Event Added Successfully!", Toast.LENGTH_SHORT).show();


                        // checking the login status

                    } else {
                        errorMsg.setText("* Event added failed.");
                    }

                }
            }

        });

        return view;
    }

//    public void navigateLogin(View view) {
//        Intent i = new Intent(getApplicationContext(), Events.class);
//        startActivity(i);
//        finish();
//    }
}
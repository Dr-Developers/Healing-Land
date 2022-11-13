package com.scorpion.healingland;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EventUpdate extends Fragment {

    EditText eventId, eventname, eventdescription, date, time, venue, cname, cnumber, imgurl;
    Button update;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_event_update, container,false);

        eventname = view.findViewById(R.id.eventName);
        eventdescription = view.findViewById(R.id.eventDescription);
        date = view.findViewById(R.id.date);
        time = view.findViewById(R.id.time);
        venue = view.findViewById(R.id.venue);
        cname = view.findViewById(R.id.coordinatorName);
        cnumber = view.findViewById(R.id.coordinatorNumber);
        imgurl = view.findViewById(R.id.event_photo);
        update = view.findViewById(R.id.updatebtn);
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

                Toast.makeText(getActivity(), "Updated Successfully", Toast.LENGTH_SHORT).show();

                EventList events = new EventList();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, events);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        return view;
    }
}
package com.scorpion.healingland;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.imageview.ShapeableImageView;

public class EventList extends Fragment {

    Button submit;
    ShapeableImageView event;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_events, container, false);

        submit = view.findViewById(R.id.addEvents);
        event = view.findViewById(R.id.event1);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventAdd eventAdd = new EventAdd();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, eventAdd);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventView eventView = new EventView();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, eventView);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }

    public void clickNew1(View view) {

        SeedDistribution seedDistribution = new SeedDistribution();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, seedDistribution);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void clickNew(View view) {

        EventView eventView = new EventView();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, eventView);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void clickNew2(View view) {

        PlantProgram plantProgram = new PlantProgram();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, plantProgram);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void clickNew3(View view) {

        SeedDistribution seedDistribution = new SeedDistribution();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, seedDistribution);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
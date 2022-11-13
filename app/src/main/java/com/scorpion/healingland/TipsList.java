package com.scorpion.healingland;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class TipsList extends Fragment {

    Button addNewTip;
    ImageView rose,gerbera;
    ImageView petunia;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tips_list, container, false);

        addNewTip = view.findViewById(R.id.addTip);
        rose = view.findViewById(R.id.rose_button_click);
        gerbera = view.findViewById(R.id.gerbera_button_click);
        petunia = view.findViewById(R.id.petunia_button_click);

        addNewTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddGardenTips addGardenTips = new AddGardenTips();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, addGardenTips);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               RoseView roseView = new RoseView();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, roseView);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        gerbera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GerberaPlantView gerberaView = new GerberaPlantView();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, gerberaView);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        petunia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PinkPlantView petuniaView = new PinkPlantView();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, petuniaView);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}
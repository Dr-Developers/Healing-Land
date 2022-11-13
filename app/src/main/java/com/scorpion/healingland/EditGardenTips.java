package com.scorpion.healingland;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

import com.scorpion.healingland.Database.DBHandler;

public class EditGardenTips extends Fragment {

    Button update;
    EditText plantCode, plantName, botanicalName, plantType, water, plantingTip, fertilizingTip, imageUrl;
    DBHandler dbHandler;


    @Override
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_edit_garden_tips, container, false);

        plantName = view.findViewById(R.id.pName);
        botanicalName = view.findViewById(R.id.bName);
        plantType = view.findViewById(R.id.pType);
        water = view.findViewById(R.id.wtr);
        plantingTip = view.findViewById(R.id.plTip);
        fertilizingTip = view.findViewById(R.id.fert);
        imageUrl = view.findViewById(R.id.upPhoto);
        update = view.findViewById(R.id.editTip);

        DBHandler dbHandler = new DBHandler(getActivity());
        update.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                Toast.makeText(getActivity(), "Updated Successfully", Toast.LENGTH_SHORT).show();
                TipsList tipsList = new TipsList();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, tipsList);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;

    }
}
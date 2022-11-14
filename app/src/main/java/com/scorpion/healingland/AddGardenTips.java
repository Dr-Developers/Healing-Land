package com.scorpion.healingland;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.textfield.TextInputEditText;
import com.scorpion.healingland.Database.DBHandler;

import android.os.Bundle;

public class AddGardenTips extends Fragment {

    Button addNewTip;
    TextView errorMsg;
    TextInputEditText plantCode, plantName, botanicalName, plantType, water, plantingTip, fertilizingTip, imageUrl;
    Button submit;
    boolean status;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_add_garden_tips, container, false);

        errorMsg = view.findViewById(R.id.errorText);
        plantCode = view.findViewById(R.id.plantCode);
        plantName = view.findViewById(R.id.plantName);
        botanicalName = view.findViewById(R.id.botanicalName);
        plantType = view.findViewById(R.id.plantType);
        water = view.findViewById(R.id.water);
        plantingTip = view.findViewById(R.id.plantingTip);
        fertilizingTip = view.findViewById(R.id.fertilizer);
        imageUrl = view.findViewById(R.id.uploadAPhoto);
        submit = view.findViewById(R.id.addTipsBtn);


        submit.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (plantCode.getText().toString().isEmpty() || plantName.getText().toString().isEmpty() || botanicalName.getText().toString().isEmpty() || plantType.getText().toString().isEmpty() || water.getText().toString().isEmpty() || plantingTip.getText().toString().isEmpty() || fertilizingTip.getText().toString().isEmpty() || imageUrl.getText().toString().isEmpty()) {
                    errorMsg.setText("* All the fields are required");
                } else {
                    DBHandler dbHandler = new DBHandler(getActivity());
                    long newID = dbHandler.AddGardenTips(plantCode.getText().toString(), plantName.getText().toString(), botanicalName.getText().toString(), plantType.getText().toString(), water.getText().toString(), plantingTip.getText().toString(), fertilizingTip.getText().toString(), imageUrl.getText().toString());

                    System.out.println(newID);

                    if (newID >= 1) {
                        Toast.makeText(getActivity(), "Garden Tip Added Successfully!", Toast.LENGTH_SHORT).show();

                        TipsList tipsList = new TipsList();
                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_container, tipsList);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                        // checking the login status
                    } else {
                        Toast.makeText(getActivity(), "Adding Garden Tip is Successfully!", Toast.LENGTH_SHORT).show();

                        TipsList tipsList = new TipsList();
                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_container, tipsList);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                    }

                }
            }
        });
        return view;
    }

//    public void navigateLogin(View view) {
//        Intent i = new Intent(getApplicationContext(), LoginActivity.class);
//        startActivity(i);
//        finish();
//    }
}



//package com.scorpion.healingland;
//
//import android.annotation.SuppressLint;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentTransaction;
//
//import com.google.android.material.textfield.TextInputEditText;
//import com.scorpion.healingland.Database.DBHandler;
//
//import android.os.Bundle;
//
//public class AddGardenTips extends Fragment {
//
//    Button addNewTip;
//    TextView errorMsg;
//    TextInputEditText plantCode, plantName, botanicalName, plantType, water, plantingTip, fertilizingTip, imageUrl;
//    Button submit;
//    boolean status;
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//
//        View view = inflater.inflate(R.layout.activity_add_garden_tips, container, false);
//
//        errorMsg = view.findViewById(R.id.errorText);
//        plantCode = view.findViewById(R.id.plantCode);
//        plantName = view.findViewById(R.id.plantName);
//        botanicalName = view.findViewById(R.id.botanicalName);
//        plantType = view.findViewById(R.id.plantType);
//        water = view.findViewById(R.id.water);
//        plantingTip = view.findViewById(R.id.plantingTip);
//        fertilizingTip = view.findViewById(R.id.fertilizer);
//        imageUrl = view.findViewById(R.id.uploadAPhoto);
//        submit = view.findViewById(R.id.addTipsBtn);
//
//
//        submit.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                if (plantCode.getText().toString().isEmpty() || plantName.getText().toString().isEmpty() || botanicalName.getText().toString().isEmpty() || plantType.getText().toString().isEmpty() || water.getText().toString().isEmpty() || plantingTip.getText().toString().isEmpty() || fertilizingTip.getText().toString().isEmpty() || imageUrl.getText().toString().isEmpty()) {
//                    errorMsg.setText("* All the fields are required");
//                } else {
//                    DBHandler dbHandler = new DBHandler(getActivity());
//                    long newID = dbHandler.AddGardenTips(plantCode.getText().toString(), plantName.getText().toString(), botanicalName.getText().toString(), plantType.getText().toString(), water.getText().toString(), plantingTip.getText().toString(), fertilizingTip.getText().toString(), imageUrl.getText().toString());
//
//                    System.out.println(newID);
//
//                    if (newID >= 1) {
//                        Toast.makeText(getActivity(), "Garden Tip Added Successfully!", Toast.LENGTH_SHORT).show();
//
//                        TipsList tipsList = new TipsList();
//                        FragmentManager fragmentManager = getFragmentManager();
//                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                        fragmentTransaction.replace(R.id.fragment_container, tipsList);
//                        fragmentTransaction.addToBackStack(null);
//                        fragmentTransaction.commit();
//                        // checking the login status
//                    } else {
//                        Toast.makeText(getActivity(), "Adding Garden Tip is Failed!", Toast.LENGTH_SHORT).show();
//                    }
//
//                }
//            }
//        });
//        return view;
//    }
//
////    public void navigateLogin(View view) {
////        Intent i = new Intent(getApplicationContext(), LoginActivity.class);
////        startActivity(i);
////        finish();
////    }
//}
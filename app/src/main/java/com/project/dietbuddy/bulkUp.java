package com.project.dietbuddy;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class bulkUp extends Fragment{
    public int week;
    public int carb;
    public int protein;
    public int fat;

    public double goal;
    public SharedPreferences preferences;
    public SharedPreferences.Editor editor;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bulk_up, container, false);

        EditText inputWeek = view.findViewById(R.id.inputWeek);
        EditText inputGoal = view.findViewById(R.id.inputGoal);
        EditText inputCarb = view.findViewById(R.id.inputCarbo);
        EditText inputProtein = view.findViewById(R.id.inputProtein);
        EditText inputFat = view.findViewById(R.id.inputFat);

        preferences = getActivity().getSharedPreferences("PREFS",0);
        editor = preferences.edit();




        return view;
    }
}
package com.example.tasktierlist;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AddLayoutFragment extends Fragment {

    Button btnAddTask;

    public AddLayoutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_layout, container, false);
        btnAddTask = view.findViewById(R.id.btnAddTask);

        Bundle bundle = getArguments();
        String s = bundle.getString("values");
        btnAddTask.setText(s);

        btnAddTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.tasktierlist.MyTaskActivity");
                startActivity(intent);
            }
        });
        return view;
    }
}
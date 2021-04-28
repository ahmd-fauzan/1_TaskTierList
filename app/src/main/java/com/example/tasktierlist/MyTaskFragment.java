package com.example.tasktierlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class BlankFragment extends Fragment {

    private List<Tier> tierList;

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        RecyclerView rvItem = view.findViewById(R.id.rv_item);
        ItemAdapter itemAdapter = new ItemAdapter(buildItemList());
        rvItem.setAdapter(itemAdapter);
        rvItem.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }

    private List<Tier> buildItemList() {
        List<Tier> tierList = new ArrayList<>();
        List<Task> sTier = new ArrayList<>();
        List<Task> aTier = new ArrayList<>();
        List<Task> bTier = new ArrayList<>();

        for (Task t : buildSubItemList()) {
            if(t.getDeadline() <= 1){
                sTier.add(t);
            }

            else if(t.getDeadline() <= 3){
                aTier.add(t);
            }

            else
                bTier.add(t);
        }
        tierList.add(new Tier("S", sTier));
        tierList.add(new Tier("A", aTier));
        tierList.add(new Tier("B", bTier));

        return tierList;
    }

    private List<Task> buildSubItemList() {
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Fragment vs RecycleView", "Dalam bentuk PDF", 5, "Google", "E-Learning", "PPB_NIM"));
        taskList.add(new Task("MindMap", "Dalam bentuk PDF bergambar", 3, "SWEBOKV3", "E-Learning", "MindMap_NIM"));
        taskList.add(new Task("Sensor", "Kelompok Dalam bentuk PDF", 1, "Youtube", "E-Learning", "PPL_NIM"));
        taskList.add(new Task("Instal Arduino", "Dalam bentuk PDF", 2, "Google", "E-Learning", "PPL_NIM"));
        taskList.add(new Task("Mockup", "Dalam bentuk PDF", 4, "Google", "E-Learning", "PPB_NIM"));

        return taskList;
    }
}
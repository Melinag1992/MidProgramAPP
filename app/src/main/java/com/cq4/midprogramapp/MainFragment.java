package com.cq4.midprogramapp;


import android.app.Fragment;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by melina.gonzalez on 12/6/17.
 */

public class MainFragment extends Fragment {

    private View rootview;
    private RecyclerView recyclerView;
    private TextView emailshown;


    public MainFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);



        rootview = inflater.inflate(R.layout.myfragment,container,false);

        emailshown = rootview.findViewById(R.id.emailshown_textview);

        recyclerView = rootview.findViewById(R.id.my_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        showEmail();
        return rootview;
    }

    public void showEmail(){
        Bundle emailextra = new Bundle();
        emailshown.setText(emailextra.get("email").toString());
    }
}

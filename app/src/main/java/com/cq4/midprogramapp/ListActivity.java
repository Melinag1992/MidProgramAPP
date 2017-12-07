package com.cq4.midprogramapp;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.cq4.midprogramapp.MainFragment;
import com.cq4.midprogramapp.R;

/**
 * Created by melina.gonzalez on 12/6/17.
 */

public class ListActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        Fragment mainFragment = new Fragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_container, mainFragment);
        fragmentTransaction.commit();
    }
}

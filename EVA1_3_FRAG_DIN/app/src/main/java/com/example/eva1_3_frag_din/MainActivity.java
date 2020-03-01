package com.example.eva1_3_frag_din;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fragmento1(View view) {
        androidx.fragment.app.FragmentTransaction frameB= getSupportFragmentManager().beginTransaction();
        blackFragment black = new blackFragment();
        frameB.replace(R.id.framexd, black);
        frameB.commit();
    }

    public void fragmento2(View view) {
        FragmentTransaction frameB= getSupportFragmentManager().beginTransaction();
        purpleFragment black = new purpleFragment();
        frameB.replace(R.id.framexd, black);
        frameB.commit();
    }
}

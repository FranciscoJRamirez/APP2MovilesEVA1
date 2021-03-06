package com.example.eva1_6_transiciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Slide;
import android.view.Window;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setAllowEnterTransitionOverlap(true);//se sobrelapan los enter transitions, no los exits
        getWindow().setExitTransition(new Slide().setDuration(500));
        setContentView(R.layout.activity_main2);
    }
}

package com.example.eva1_8_escenas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    Scene escenaa, escenab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewGroup reemplazar = findViewById(R.id.layoutmain);
        escenaa = Scene.getSceneForLayout(reemplazar, R.layout.escenaa, this);
        escenab = Scene.getSceneForLayout(reemplazar, R.layout.escenab, this);
        //Transition fade = new Fade();
        //TransitionManager.go(escenaa, fade);
        escenaa.enter();
    }
    public void miClick(View v){
        Transition fade = new Slide();
        TransitionManager.go(escenab, fade);
    }
}

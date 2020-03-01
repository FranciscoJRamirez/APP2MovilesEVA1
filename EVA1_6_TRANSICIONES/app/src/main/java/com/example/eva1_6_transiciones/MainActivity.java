package com.example.eva1_6_transiciones;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Slide;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {
    Intent intento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setExitTransition(new Fade().setDuration(5000));
        setContentView(R.layout.activity_main);
        intento = new Intent(this, Main2Activity.class);
    }

    public void click(View view) {
        startActivity(intento, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
}

package com.example.eva1_5_frag_nav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out, android.R.anim.fade_in, android.R.anim.fade_out);
        fragmento1 frame = new fragmento1();
        frame.setClic(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction ft1= getSupportFragmentManager().beginTransaction();
                ft1.setCustomAnimations(R.anim.anim_enter, R.anim.anim_exit, android.R.anim.fade_in, android.R.anim.fade_out);
                fragmento2 frag2 = new fragmento2();
                ft1.replace(R.id.framexd, frag2);
                ft1.addToBackStack("xd");
                ft1.commit();
            }
        });
        ft.replace(R.id.framexd, frame);
        ft.commit();
    }
}

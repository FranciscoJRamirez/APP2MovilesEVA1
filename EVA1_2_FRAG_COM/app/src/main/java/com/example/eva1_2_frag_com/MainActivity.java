package com.example.eva1_2_frag_com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    listFragment lstfrag;
    BlankFragment btnf;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt1);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if(fragment.getClass() == BlankFragment.class){
            btnf = (BlankFragment)fragment;
        }else if (fragment.getClass() == listFragment.class){
            lstfrag = (listFragment)fragment;
        }
    }

    public void onMessageFromFragmentToMain(String Sender, String param){
        if (Sender.equals("Lista")){
            txt.setText("Lista: "+param);
            btnf.onMessageFromMainToFragment(param);
        }else if (Sender.equals("Boton")){
            txt.setText("Boton: "+param);
        }
    }
}

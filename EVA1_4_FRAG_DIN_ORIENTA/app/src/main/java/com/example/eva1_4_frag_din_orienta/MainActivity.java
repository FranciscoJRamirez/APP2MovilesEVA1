package com.example.eva1_4_frag_din_orienta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FrameLayout frame;
    TwoF t= new TwoF();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onMessageFromFragToMain (){
        frame = findViewById(R.id.framexd);
        if (frame != null){ //modo landscape
            //crear el fragmento 2 dinamicamente
            FragmentTransaction fra = getSupportFragmentManager().beginTransaction();
            TwoF two = new TwoF();
            two.setParam("landscape");
            fra.replace(R.id.framexd, two);
            //two.mansaje("landscape");
            fra.commit();

            //Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        }else {//portrait
            //lanzar la actividad secundaria con intento
            Intent intento = new Intent(this, Main2Activity.class);
            intento.putExtra("mssg", "Portrait");
            startActivity(intento);
            //Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
}

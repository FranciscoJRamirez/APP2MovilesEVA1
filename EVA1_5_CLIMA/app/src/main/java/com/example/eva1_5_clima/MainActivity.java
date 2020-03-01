package com.example.eva1_5_clima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    lstFrag lista;
    ClimaFrag climaFrag;
    Clima clima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction frmTran = getSupportFragmentManager().beginTransaction();
        lstFrag lst = new lstFrag();
        frmTran.replace(R.id.frmFragment, lst);
        frmTran.commit();
    }

    public void sendDatatoFrag(int i, String s, String s2, double d){
        //Toast.makeText(this, i, Toast.LENGTH_SHORT).show();
        ClimaFrag climafragment = new ClimaFrag();
        climafragment.setIr(i);
        climafragment.setTc(s);
        climafragment.setTcl(s2);
        climafragment.setTt(d);
        FragmentTransaction frmT = getSupportFragmentManager().beginTransaction();

        frmT.replace(R.id.frmFragment,climafragment);
        frmT.addToBackStack("stack");
        frmT.commit();
    }
}

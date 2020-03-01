package com.example.eva1_5_clima;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClimaFrag extends Fragment {

    ImageView img;
    TextView txtC, txtCli, txtT;

    int ir;
    String tc, tcl;
    double tt;
    public ClimaFrag() {
        // Required empty public constructor
    }

    public ClimaFrag(int ir, String tc, String tcl, double tt) {
        this.ir = ir;
        this.tc = tc;
        this.tcl = tcl;
        this.tt = tt;
    }

    public int getIr() {
        return ir;
    }

    public void setIr(int ir) {
        this.ir = ir;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getTcl() {
        return tcl;
    }

    public void setTcl(String tcl) {
        this.tcl = tcl;
    }

    public double getTt() {
        return tt;
    }

    public void setTt(double tt) {
        this.tt = tt;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout lin = (LinearLayout)inflater.inflate(R.layout.fragment_clima, container, false);
        img = lin.findViewById(R.id.imgWeather);
        txtC = lin.findViewById(R.id.txtCiudad);
        txtCli = lin.findViewById(R.id.txtClima);
        txtT = lin.findViewById(R.id.txtTemp);
        img.setImageResource(getIr());
        txtC.setText(getTc());
        txtCli.setText(getTcl());
        txtT.setText(getTt()+" °C");
        return lin ;
    }
    /*public void setRecursos(int i, String s, String s2, double d){
        img.setImageResource(i);
        txtC.setText(s);
        txtCli.setText(s2);
        txtT.setText(d+" °C");
    }*/

}

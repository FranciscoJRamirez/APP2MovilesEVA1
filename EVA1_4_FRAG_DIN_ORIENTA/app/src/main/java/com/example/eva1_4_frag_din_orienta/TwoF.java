package com.example.eva1_4_frag_din_orienta;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;


public class TwoF extends Fragment {
    TextView txt;
    private String param;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    public TwoF() {
        // Required empty public constructor
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
    // TODO: Rename and change types and number of parameters




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout f = (LinearLayout)inflater.inflate(R.layout.fragment_two, container, false);
        txt = f.findViewById(R.id.txt);
        mansaje(param);
        return f;
    }

    // TODO: Rename method, update argument and hook method into UI event


    public void mansaje(String p){
        txt.setText(p);
    }



}

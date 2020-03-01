package com.example.eva1_5_frag_nav;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class fragmento1 extends Fragment {


    private View.OnClickListener clic;

    public View.OnClickListener getClic() {
        return clic;
    }

    public void setClic(View.OnClickListener clic) {
        this.clic = clic;
    }

    public fragmento1() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout ll= (LinearLayout)inflater.inflate(R.layout.fragment_fragmento1, container, false);
        Button btn = ll.findViewById(R.id.button);
        btn.setOnClickListener(clic);
        return ll;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.wtf("hola", "destruido xd");
    }
    // TODO: Rename method, update argument and hook method into UI event








}

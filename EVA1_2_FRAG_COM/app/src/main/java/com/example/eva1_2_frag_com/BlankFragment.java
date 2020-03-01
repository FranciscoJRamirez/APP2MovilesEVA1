package com.example.eva1_2_frag_com;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    MainActivity main;
    Button btn;
    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        main = (MainActivity)getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FrameLayout llayout = (FrameLayout) inflater.inflate(R.layout.fragment_blank, container, false);

        btn = llayout.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.onMessageFromFragmentToMain("Boton", "Boton locuas");
            }
        });
        return llayout;
    }
    public void onMessageFromMainToFragment (String param){
        btn.setText(param);
    }
}

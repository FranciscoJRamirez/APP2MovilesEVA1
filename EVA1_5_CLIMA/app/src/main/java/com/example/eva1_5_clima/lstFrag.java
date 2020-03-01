package com.example.eva1_5_clima;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class lstFrag extends Fragment {
Clima [] ciudades = {
        new Clima(R.drawable.atmospher, "Aldama", "Chido", 25),
        new Clima(R.drawable.cloudy, "Cuahutemoc", "Nublado", 28),
        new Clima(R.drawable.light_rain, "Creel", "Nublado", 18.5),
        new Clima(R.drawable.rainy, "Allende", "Lluvioso", 17),
        new Clima(R.drawable.snow, "Guerrero", "Nevado", -7),
        new Clima(R.drawable.sunny, "Madera", "Soleado", 35),
        new Clima(R.drawable.thunderstorm, "Delicias", "Tormenta electrica", 16),
        new Clima(R.drawable.tornado, "Parral", "Tornado", 26)
};
MainActivity main;

    public lstFrag() {
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
        LinearLayout ll = (LinearLayout)inflater.inflate(R.layout.fragment_lst, container, false);
        ListView list = ll.findViewById(R.id.lstClima);
        list.setAdapter(new ClimaAdapter(main, R.layout.fragment_clima, ciudades));
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                main.sendDatatoFrag(ciudades[position].getImg(), ciudades[position].getCiudad(),
                        ciudades[position].getClima(), ciudades[position].getTemp());
            }
        });

        return ll;
    }

}

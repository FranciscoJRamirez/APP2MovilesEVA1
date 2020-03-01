package com.example.eva1_5_clima;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ClimaAdapter extends ArrayAdapter<Clima> {
    Context c;
    int resource;
    Clima [] Ciudades;
    public ClimaAdapter(Context context, int resource, Clima[] objects) {
        super(context, resource, objects);
        c = context;
        this.resource = resource;
        Ciudades = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView imgWeather;
        TextView txtCiudad, txtVwTemp, txtVwClima;

        if(convertView == null){
            LayoutInflater inflater = ((Activity) c).getLayoutInflater();
            convertView = inflater.inflate(resource, parent, false);
        }

        imgWeather = convertView.findViewById(R.id.imgWeather);
        txtCiudad = convertView.findViewById(R.id.txtCiudad);
        txtVwClima = convertView.findViewById(R.id.txtClima);
        txtVwTemp = convertView.findViewById(R.id.txtTemp);

        imgWeather.setImageResource(Ciudades[position].getImg());
        txtCiudad.setText(Ciudades[position].getCiudad());
        txtVwTemp.setText(Ciudades[position].getTemp() + " °C");
        txtVwClima.setText(Ciudades[position].getClima());

        return convertView;

    }
}

package com.example.eva1_5_clima;

public class Clima {
    private int img;
    private String ciudad, clima;
    private double temp;

    public Clima(int img, String ciudad, String clima, double temp) {
        this.img = img;
        this.ciudad = ciudad;
        this.clima = clima;
        this.temp = temp;
    }

    public int getImg() {
        return img;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getClima() {
        return clima;
    }

    public double getTemp() {
        return temp;
    }
}



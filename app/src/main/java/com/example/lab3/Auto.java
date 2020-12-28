package com.example.lab3;

public class Auto {
    private String brand;
    private  String model;
    private int image;

    Auto(String brand, String model, int image){
        this.brand = brand;
        this.model = model;
        this.image = image;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getImage() {
        return this.image;
    }
}

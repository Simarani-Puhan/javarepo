package com.API.lang;

import java.util.Objects;

public class Vehicle {

    private String color;
    private String brand;
    private String model;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return  brand.equals(vehicle.brand) && model.equals(vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash( brand, model);
    }

    //default constructor
    public Vehicle() {
    }
//parameterised constructor
    public Vehicle(String color, String brand, String model) {
        this.color = color;
        this.brand = brand;
        this.model = model;
    }
//Getter setter method
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

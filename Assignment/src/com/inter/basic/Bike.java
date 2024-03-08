package com.inter.basic;

public class Bike extends Vehicle implements IExternal{

    String capacity;

    public Bike(String brand, String model, double price, String capacity) {
        super(brand, model, price);
        this.capacity = capacity;
    }

    @Override
    public void showAcc() {
        System.out.println("Exterior  properties of bike");
    }

    @Override
    public void exterior() {
        System.out.println("Interior  properties of bike");
    }

    @Override
    void getMileage() {
        System.out.println("Get mileage of bike");
    }
    void showB(){
        System.out.println("Show some functions of bike");
    }
}

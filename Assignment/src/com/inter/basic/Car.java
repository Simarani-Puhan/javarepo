package com.inter.basic;

public class Car extends Vehicle implements IExternal,IInternal{
    String type;
    public Car(String brand, String model, double price, String type) {
        super(brand, model, price);
        this.type = type;
    }

    @Override
    public void showAcc() {
        System.out.println("Show accessories");
    }

    @Override
    public void exterior() {
        System.out.println("Exterior  properties of car");
    }

    @Override
    public void interior() {
        System.out.println("Interior  properties of car");
    }

    @Override
    void getMileage() {
        System.out.println("Get Mileage of car");
    }

    void showC(){
        System.out.println("Show some functions of car");
    }
}

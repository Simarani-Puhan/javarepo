package com.oops.overloading;

public class Vehicle {
    String brand;
    double price;
    String model;


    //default
    public Vehicle() {
        System.out.println("default");
    }
  //brand
    public Vehicle(String brand) {
        this();
        System.out.println("One");
        this.brand = brand;
    }
    //brand,model
    public Vehicle(String brand,  String model) {
        this(brand);
        System.out.println("Two");
        this.brand = brand;
        this.model = model;

    }
    //brand,model,price
    public Vehicle(String brand, double price, String model) {
        this(brand,model);
        System.out.println("Three");
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    void getDetails(){
        if(model!=null)
        System.out.println("Model "+model);
        if(brand!=null)
            System.out.println("Brand "+brand);
        if(price>0)
            System.out.println("Price "+price);

    }
}

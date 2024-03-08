package com.oops.bean;

public class BeanDemo {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();

        vehicle.setModel("abc");
        System.out.println(vehicle.getModel());

        vehicle.setBrand("Honda");
        System.out.println(vehicle.getBrand());

        vehicle.setPrice(20000);
        System.out.println(vehicle.getPrice());
    }

}

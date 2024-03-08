package com.oops.overloading;

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle vehicle=new Vehicle("Suzuki");
        vehicle.getDetails();
        System.out.println();
        Vehicle vehicle1=new Vehicle();
        vehicle1.getDetails();
        System.out.println();
        Vehicle vehicle2=new Vehicle("abc","ab");
        vehicle2.getDetails();
        System.out.println();
        Vehicle vehicle3=new Vehicle("same",50000,"abcd");
        vehicle3.getDetails();
        System.out.println();
    }
}

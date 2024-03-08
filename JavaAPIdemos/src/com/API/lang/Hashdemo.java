package com.API.lang;

import java.awt.*;

public class Hashdemo {
    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle("Black","Audi","x100");
        Vehicle vehicle2=new Vehicle("white","Audi","x100");
        Vehicle vehicle3=new Vehicle("white","Audi","ax3");
        Vehicle vehicle4=new Vehicle("Black","Audi","x100");
        System.out.println(vehicle1.equals(vehicle2));
        System.out.println(vehicle1.equals(vehicle3));
        System.out.println(vehicle2.equals(vehicle3));
        System.out.println(vehicle1.equals(vehicle4));
        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());
        System.out.println(vehicle3.hashCode());
        System.out.println(vehicle4.hashCode());
    }
}

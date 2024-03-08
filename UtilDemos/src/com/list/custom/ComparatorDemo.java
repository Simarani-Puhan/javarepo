package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles =
                Arrays.asList(
                        new Vehicle("City", "Honda", 23_90_000),
                        new Vehicle("Hexa", "Tata", 12_50_000),
                        new Vehicle("Santro", "Hyundai", 45_00_000),
                        new Vehicle("A100", "Audi", 11_00_000),
                        new Vehicle("X10", "Maruthi", 1190000));
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        System.out.println("Sort by brand");
        Collections.sort(vehicles,new BrandSort());
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }
        System.out.println("Sort by model");
        Collections.sort(vehicles,new ModelSort());
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }
        System.out.println("Sort by price");
        Collections.sort(vehicles,new ModelSort());
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }
    }
}

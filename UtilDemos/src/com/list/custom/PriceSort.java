package com.list.custom;

import java.util.Comparator;

public class PriceSort implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        Double price1=o1.getPrice();
        return (price1).compareTo(o2.getPrice());
    }


}

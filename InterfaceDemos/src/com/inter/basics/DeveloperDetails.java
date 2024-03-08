package com.inter.basics;

public class DeveloperDetails implements IEntertainment {
    @Override
    public void showGames(String type) {
        if(type.equals("outdoor"))
            System.out.println("Carrom and Shuttle available");
        else{
            System.out.println("Cricket");
        }
    }

    @Override
    public void showActivity() {
        System.out.println("Weekly lunch outing");

    }
}

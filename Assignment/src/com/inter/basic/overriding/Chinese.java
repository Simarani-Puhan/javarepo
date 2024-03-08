package com.inter.basic.overriding;

public class Chinese extends Menu{



    void showItems(String type){
        if(type.equals("starters")){
            System.out.println("crispy corn");
        } else if (type.equals("lunch")) {
            System.out.println("Veg meals");
        }
        else {
            System.out.println("Desserts");
        }
    }

    void printGames(){
        System.out.println("Board games available");
    }
}

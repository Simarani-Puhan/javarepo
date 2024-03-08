package com.inter.basic.overriding;

public class Indian extends Menu{


    void showItems(String type){
        if (type.equals("starters")){
            System.out.println("Panner 65");
        } else if (type.equals("lunch")) {
            System.out.println("Nonveg Meal");

        }
        else{
            System.out.println("desserts");
        }
    }
}

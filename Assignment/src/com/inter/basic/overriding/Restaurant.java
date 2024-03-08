package com.inter.basic.overriding;

public class Restaurant {
    public static void main(String[] args) {
        Menu menu=new Chinese();
        menu.showItems("starters");

        Chinese chinese =(Chinese) menu;
        chinese.printGames();
        menu=new Indian();
        menu.showItems("lunch");


    }
}

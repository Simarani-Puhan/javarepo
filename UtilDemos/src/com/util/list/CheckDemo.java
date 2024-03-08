package com.util.list;

import java.util.ArrayList;
import java.util.List;

public class CheckDemo {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Banana");
        fruitList.add("BlackBerry");
        fruitList.add("BlueBerry");
        fruitList.add("GreenApple");
        System.out.println(fruitList);
        List<String> fruitLists = new ArrayList<>();
        System.out.println(fruitLists);

        for (String fruit : fruitList)
            if (fruit.startsWith("B")) {
                fruitLists.add(fruit);
            }
                for (String fruitlists1 : fruitLists)
                    if (fruitlists1.startsWith("B")) {
                        fruitLists.add(fruitlists1);

            }
    }
}
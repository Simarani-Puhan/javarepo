package com.util.set;

import java.util.*;

public class HashDemo {
    public static void main(String[] args) {
        //Set<String>hashset=new HashSet<>();
        Set<String>hashset=new LinkedHashSet<>();
        //Set<String>hashset=new TreeSet<>();
        hashset.add("Apple");
        hashset.add("Pineapple");
        hashset.add("Orange");
        hashset.add("Banana");
        hashset.add("Kiwi");
        hashset.add("100");
        hashset.add(null);
        System.out.println(hashset);
        //System.out.println(hashset);
        for (String element : hashset){
            System.out.println(element);
        }
        List<String>fruits=Arrays.asList("Apple","Orange","Apple");
        Set<String>newfruits=new HashSet<>(fruits);
        System.out.println(newfruits);
    }
}

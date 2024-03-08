package com.util.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> hashmap=new HashMap<>();
        //Map<Integer,String>hashmap=new LinkedHashMap<>();
        //Map<Integer,String>hashmap=TreeMap<>();
        hashmap.put(1,"Java");
        hashmap.put(2,"Spring");
        hashmap.put(3,"Robotics");
        hashmap.put(4,"Python");
        hashmap.put(null,"Css");
        hashmap.put(null,"Angular");
        hashmap.put(5,"html");
        System.out.println(hashmap);
        System.out.println("After Modify");
        hashmap.put(1,"React");
        hashmap.put(100,null);
        hashmap.put(101,null);
        System.out.println(hashmap);

        System.out.println(hashmap.get(1));
        System.out.println(hashmap.get(102));
        System.out.println(hashmap.getOrDefault(102,"JSp"));
        System.out.println(hashmap.containsKey(1));
        hashmap.values();

        System.out.println();
        Set<Integer> keys=hashmap.keySet();
        for (Integer key:keys){
            System.out.println(key+" "+hashmap.get(key));
        }
        System.out.println();
        System.out.println("Using entry set");
        Set<Map.Entry<Integer,String>>entries=hashmap.entrySet();
        for (Map.Entry<Integer,String>entry:entries){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
    }
}

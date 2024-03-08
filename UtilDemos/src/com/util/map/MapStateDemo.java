package com.util.map;

import java.util.*;

public class MapStateDemo {
    public static void main(String[] args) {
        Map<String, List<String>> statemap=new HashMap<>();
        statemap.put("Karnataka", Arrays.asList("Bangalore","Mangaluru","Upudi"));
        statemap.put("Tamilnadu",Arrays.asList("Chennai","Madurai"));
        statemap.put("Odisha",Arrays.asList("Bhubaneswar","Cuttack"));

        System.out.println(statemap);
        System.out.println(statemap.get(1));

        for(Map.Entry<String,List<String>>stateEntries : statemap.entrySet()){
            System.out.println(stateEntries.getKey());
            List<String>cities=stateEntries.getValue();
            for (String city :cities)
                System.out.println(city);
        }
        for (String stateNAme:statemap.keySet()){
            System.out.println("State:"+stateNAme);
            List<String>cities=statemap.get(stateNAme);
            for (String city:cities){
                System.out.println("City :"+city);
            }
        }
    }
}

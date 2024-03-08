package com.util.list;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        System.out.println(list.size());
        list.add("Java");
        list.add("54.9");
        list.add("Spring");
        list.add(1,"util");
        System.out.println(list);
        list.set(2,"Some");
        System.out.println(list.size());

        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            String str= iterator.next();
            System.out.println(str);
        }
        System.out.println();
        ListIterator<String> iter=list.listIterator(list.size());
        while (iter.hasPrevious()){
            String str=iter.previous();
            System.out.println(str);
        }
        System.out.println(".....");
        System.out.println("Sorting the list");
        Collections.sort(list);
        for (String val:list)
            System.out.println(val.toUpperCase());
    }
}

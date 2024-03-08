package com.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer>nums= Arrays.asList(11,20,30,54,60,45);
        List<Integer>newnum= new ArrayList<>();
        for (int num:nums) {
            if (num % 2 == 0) {
                System.out.println(nums);
                newnum.add(num);

            }
        }
        for (Integer integer:newnum)
            System.out.println(integer);
    }
}

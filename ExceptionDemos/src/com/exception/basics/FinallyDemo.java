package com.exception.basics;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome");
            String value = "Sima";
            System.out.println("Value " + value);
            int num = Integer.parseInt(value);
            System.out.println("Number " + num);
            int result = 100 / num;
            System.out.println(result);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Close the connection");
        }
        System.out.println("Completed");
    }
}

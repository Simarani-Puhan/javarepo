package com.API.io.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialDemo {
    public static void main(String[] args) {
       Student student=new Student("Sri",10,"CSE");
        System.out.println("Serializing");

        try (
            FileOutputStream fileOutputStream = new FileOutputStream("Stud.ser");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            ){
            objectOutputStream.writeObject(student);
            System.out.println("Completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

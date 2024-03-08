package com.API.io.serial;

import java.io.*;

public class DeSerialDemo {
    public static void main(String[] args) {
        try(
                FileInputStream fileInputStream=new FileInputStream("Stud.ser");
                ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        ){
            Student student=(Student) objectInputStream.readObject();
            System.out.println(student);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


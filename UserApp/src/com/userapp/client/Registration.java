package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.ValidationServiceImpl;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) throws NameExistsException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username ");
        String username=sc.next();
        System.out.println("Enter Password");
        String password = sc.next();
        ValidationServiceImpl validation=new ValidationServiceImpl();
        try {
            if (validation.validateUsername(username)) {
                System.out.println("Welcome "+username+"You are registered");
            }
            } catch (NameExistsException e) {
            System.out.println("Name already exists");
            e.printStackTrace();
        }try{
            if(validation.validatePassword(password)){
                System.out.println("You have entered correct password");
            }
        } catch(TooLongException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(TooShortException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    }


package com.voterapp.client;
import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.service.ElectionBoothServiceImpl;
import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = scanner.nextInt();
        System.out.println("Enter locality :");
       String locality = scanner.next();
        System.out.println("Enter VoterID");
       int vid = scanner.nextInt();
        ElectionBoothServiceImpl election = new ElectionBoothServiceImpl();
        try {
            election.checkEligibility(age,locality,vid);
            System.out.println("You are eligible  to vote");
        } catch (UnderAgeException |LocalityNotFoundException| InvalidVoterIDException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
            System.out.println("Not eligible");
        }
    }
}
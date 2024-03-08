package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.UnderAgeException;
public class ElectionBoothServiceImpl implements IElectionBoothService {
    @Override
    public boolean checkEligibility(int age, String locality, int vid)throws UnderAgeException, InvalidVoterIDException,LocalityNotFoundException {
        checkAge(age);
        checkLocality(locality);
        checkVoterID(vid);
        return false;
    }
    private boolean checkAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("Age should be greater than 18");
        } else {
            return true;
        }
    }
    private boolean checkLocality(String locality) throws LocalityNotFoundException {
        String[] localities = {"JP Nagar", "ABC Nagar", "Whitefield"};
        for (String location : localities) {
            if (location.equals(locality)) {
                throw new LocalityNotFoundException("Locality already Exists");
            }
        }
        return true;
    }
    private boolean checkVoterID(int voterID) throws InvalidVoterIDException {
        if (voterID > 1000 && voterID < 9999) {
            throw new InvalidVoterIDException("Voter id is wrong" +
                    "");
        } else {
            return true;
        }
    }
}

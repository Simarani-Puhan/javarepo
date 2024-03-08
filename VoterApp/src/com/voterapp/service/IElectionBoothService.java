package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public interface IElectionBoothService {
    boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException;

}

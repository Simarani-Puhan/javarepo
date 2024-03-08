package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {
    @Override
    public boolean validatePassword(String password) throws TooShortException,TooLongException{
        return false;
    }

    @Override
    public boolean validateUsername(String username) throws NameExistsException {
        return false;
    }

}

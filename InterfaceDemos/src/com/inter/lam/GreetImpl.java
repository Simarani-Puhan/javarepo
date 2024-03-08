package com.inter.lam;

public class GreetImpl implements IGreeter{
    @Override
    public void greeetMessage(String message) {
        System.out.println(message);
    }
}

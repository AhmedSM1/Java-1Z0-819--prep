package com.ahmed.chapter4;

@FunctionalInterface
public interface FuncInterface {

    //This interface has a single abstract method: fun().
    // The other methods have a method body, which shows they are not abstract.
    void play(int x);
    public static void baseball() {}
    private static void soccer() {}


    //interface with one  abstract method
    //default,static,private methods can be added to functional interface



    //all variables are static final in interface
    // and methods are abstract unless specified



}

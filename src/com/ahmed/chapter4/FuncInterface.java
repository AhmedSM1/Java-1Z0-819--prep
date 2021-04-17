package com.ahmed.chapter4;

@FunctionalInterface
public interface FuncInterface {

    //This interface has a single abstract method: fun().
    // The other methods have a method body, which shows they are not abstract.
    void play();
    public static void baseball() {}
    private static void soccer() {}


}

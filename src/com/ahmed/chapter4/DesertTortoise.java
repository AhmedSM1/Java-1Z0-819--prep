package com.ahmed.chapter4;

interface CanBurrow {
     void burrow();
}

@FunctionalInterface interface HasHardShell extends CanBurrow {}

abstract class Tortoise implements HasHardShell {
    public abstract int toughness();
}


public class DesertTortoise extends Tortoise {

    @Override
    public void burrow() {

    }

    @Override
    public int toughness() {
        return 11;
    }
}



package com.ahmed.chapter4;

public class SubClass extends AbstractClass {

    @Override
    public void moveForward() {
        super.moveForward();
    }

    @Override
    public void moveBackward() {
        super.moveBackward();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    //required because it is abstract method
    @Override
    public void dance() {

    }
}

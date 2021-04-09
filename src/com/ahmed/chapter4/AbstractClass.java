package com.ahmed.chapter4;

 abstract class AbstractClass {
    //Abstract methods can only be declared not defined
    // you cant create object of Abstract class

    public static void main(String[] args) {
        System.out.println("Abstract Classes");

    }

    public void moveForward(){
        // code
    }
     public void moveBackward(){
         // code
     }
     public void moveRight(){
         // code
     }
     public void moveLeft(){
         // code
     }


     // if abstract method is defined the class must be abstract
     public abstract void dance();




 }


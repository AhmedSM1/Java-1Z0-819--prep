package com.ahmed.abstractionExample;

public class Main {

    public static void main(String[] args) {
        System.out.println("abstraction Example");
        System.out.println("First subclass Iphone");
        System.out.println("-----------------------------------------------------------");
        show(new Iphone());
        System.out.println("second subclass samsung galaxy");
        System.out.println("-----------------------------------------------------------");
        show(new SamsungGalaxy());
    }

    public static  void show(Phone phone){
        phone.specs();
    }



}

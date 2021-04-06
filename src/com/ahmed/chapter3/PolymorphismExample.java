package com.ahmed.chapter3;

public class PolymorphismExample {
    public void startup() {
        System.out.print("computer-");
    }
    public static void main(String[] args) {
        PolymorphismExample computer = new Laptop();
        Laptop laptop = new Laptop();
        computer.startup();
        laptop.startup();
    }







}

class Laptop extends PolymorphismExample {
    public void startup() {
        System.out.print("laptop-");
    }
}

package com.ahmed.concurency;

import java.util.concurrent.locks.*;
public class TieShoes {
    private Lock shoes = new ReentrantLock();
    public void tie() {
        try {
            if (shoes.tryLock()) {
                System.out.println("Tie!");
                shoes.unlock();
            }
        } catch (Exception e) {}
    }
    public static void main(String... unused) {
        var gate = new TieShoes();
        for (int i = 0; i < 10; i++) {
            new Thread(gate::tie).start();
        }
    } }
package com.ahmed.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeeExample {



    public static void main(String[] args) {
        Product p1 = new Product("Cake");
        Product p2 = new Product("Tea");


        Deque<Product> menu = new ArrayDeque<>();
        menu.add(p1);
        menu.add(p2);
    }

}

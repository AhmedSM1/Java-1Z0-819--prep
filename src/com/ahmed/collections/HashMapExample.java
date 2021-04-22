package com.ahmed.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer,Product> menu = new HashMap<>();
        Product p1 = new Product("Cake");
        Product product = menu.put(1, p1);
        boolean b = menu.containsKey(1);
        Product default_product = menu.getOrDefault(5, new Product("Default Product"));
        System.out.println(p1.getName());





    }
}

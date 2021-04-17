package com.ahmed.collections;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {


    public static void main(String[] args) {
        //default initial capacity (16) and load factor (0.75)
        //duplicate cannot be added
        // add will return false if duplicate is found
        Set<String> set = new HashSet<>();
        args = new String[] {"0", "1", "01", "10" };
        Arrays.sort(args);
        System.out.println(Arrays.toString(args));
    }
}

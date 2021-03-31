package com.ahmed.chapter3;

public class Text {

    public static void main(String[] args) {
        System.out.println("String initialization");
        jvmWithString();
        stringOperations();


    }

    private static void stringOperations() {
        //String objects are immutable




    }

    private static void jvmWithString() {

        System.out.println("You can create string with new keyword  ");
        //adding new keyword will disable String interning
        String a = new String("String");

        //String interning is enabled which means  better performance  and lower memory usage
        String b = "String";
        String c = "String";
    }



}

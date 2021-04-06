package com.ahmed.chapter3;

import java.util.List;

public class Text {

    //String is immutable and thread safe
    //StringBuilder is mutable and not thread safe
    //StringBuffer is mutable and  thread safe

    //Thread safety means that object would not allow multiple threads to modify its content concurrently
    // Thread safe object --> costs resources and has decremental effect on performance
    // recommended to use thread unsafe versions

    public static void main(String[] args) {
        System.out.println("String initialization");
        jvmWithString();
        stringOperations();

    }

    private static void stringOperations() {
      StringBuilder stringBuilder = new StringBuilder("String builder is mutable");
      stringBuilder.append("  Appending text doesnt need to create new variable ");
      System.out.println(stringBuilder);

      String string = "String is immutable";
      String newVariable = string.concat("Concat needs new variable");
      System.out.println(string + newVariable);
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

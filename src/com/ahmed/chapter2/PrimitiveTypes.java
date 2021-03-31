package com.ahmed.chapter2;

public class PrimitiveTypes {

    public static void main(StringAndStringBuilders[] args) {
        //java provides 8 primitive type

        //whole numbers
        byte b = 0;
        System.out.println("Default value for byte: " + b + " and it contains 8 bits");
        short s = 0;
        System.out.println("Default value for short: " + s + " and it contains 16 bits");
        int i = 0;
        System.out.println("Default value for int: " + i + " and it contains 32 bits");
        long l = 0L;
        System.out.println("Default value for long: " + l + " and it contains 64 bits");

        //Floating point numbers
        float f = 0.0F;
        System.out.println("Default value for float: " + f + " and it contains 32 bits");
        double d = 0.0;
        System.out.println("Default value for double: " + d + " and it contains 64 bits");


        boolean b1 = false;
        System.out.println("Default value for boolean: " + b1 );


        char c = '\u0000';
        System.out.println("Default value for char: " + c  + " and it contains 16 bits" );

    }



    //TODO: rules:
    // 1- syntax = <type> <name> = <value> ;
    // 2- can be dclared with no immediate init but you cant use it unitll init
    // 3- numeric value can be declared as binary octal decimal and hex
    // 4- smaller types are automatically promoted to bigger types  but bigger types cannot be assigned to smaller types
    // 5- char must be enclosed with single quotes and cannot contain more than one character
    // 6- primitives cannot be null

}

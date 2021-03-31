package com.ahmed.chapter2;

public class MathOperators {

    public static void main(StringAndStringBuilders[] args) {
        System.out.println(" basic math operators");
        basicMath();
        compoundAssignment();
        mathFunctions();
    }

    private static void basicMath(){
        int init = 11;
        int split = 3;
        int partA = init / split;
        System.out.println(" 11 / 3 = "+ partA);
        int partB = init % split;
        System.out.println(" 11 % 3 = "+ partB);
        int result = split * (partB + partA);
        System.out.println(" 3 * (3 + 2) = "+ result);
    }

    private static  void compoundAssignment(){
        System.out.println(" compound Assignment operators");
        int a = 1, b = 3;
        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a%=b);
    }

    private static void mathFunctions(){
        System.out.println("Math class functions ");
        double a = 1.99, b = 2.99;
        //"NaN" stands for "not a number" and signifies that a value is not defined.
        double cosine = Math.cos(a);
        System.out.println("cosine ="+ cosine);
        double arcCosine = Math.acos(cosine);
        System.out.println("arc cosine ="+ arcCosine);
        double sine = Math.sin(a);
        System.out.println("sine ="+ sine);
        double arcSine = Math.asin(sine);
        System.out.println("arc sine ="+ arcSine);

        double tangent = Math.tan(a);
        System.out.println("Tangent = "+ tangent);

        double arcTangent = Math.atan(tangent);
        System.out.println("arc tangent = "+ arcTangent);


        double exp = Math.exp(a);
        System.out.println("e^1.99 = "+ exp);

        double max = Math.max(a, b);
        System.out.println("max between 1.99 & 2.99 = "+ max);

        double min = Math.max(a, b);
        System.out.println("min between 1.99 & 2.99 = "+ min);


        double pow = Math.pow(a, b);
        System.out.println("a^b = "+pow);

        double sqrt = Math.sqrt(a);
        System.out.println("Square root of a = " + sqrt);

        double random = Math.random();
        System.out.println("random number between 0.0 and 1.0: "+ random);
    }

}

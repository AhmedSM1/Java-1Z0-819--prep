package com.ahmed.chapter2;

public class Operators {

    //TODO
    // List of operators precedence:
    // 1- postfix  expr++ expr--
    // 2- unary  ++expr --expr  +expr ~ !
    // 3- multiplicative   * / %
    // 4- additive  + -
    // 5- shift << >> >>>
    // 6- relational < > <= >= instanceof
    // 7- equality == !=
    // 8- bitwise AND &
    // 9- bitwise exclusive OR  ^
    // 10- bitwise inclusive OR |
    // 11- logical AND &&
    // 12- logical OR ||
    // 13- tenary ?:
    // 14- assignment = += -= *= /= %= &= ^= |= <<= >>= >>>=


    public static void main(String[] args) {
        System.out.println("postfix and prefix");
        postfixAndPrefixOperator();
        postFixAndPreFixQuestions();


        System.out.println("shift");
        shiftOperator();
        System.out.println(" bitwise AND & , bitwise exclusive OR ~ , bitwise inclusive OR |  operators:");
        bitwiseORandAND();

    }



    private static void bitwiseORandAND(){
        // & 1 1  ->   1
        // & 1 0  ->  0


        // | 1 1  -> 1
        // | 1 0  ->  1
        // | 0  0 -> 0


        int a = 25;  // 1 1 0 0 1
        int b = 15;  // 0 1 1 1 1



        int and = a & b; //0 1 0 0 1 -> 9
        System.out.println("bitwise and operator  25 & 15 = "+ and);

        // similar will be True(1) and dissimilar will be False(0)
        int inclusiveOR = a | b;  // 1 1 1 1 1 -> 31
        System.out.println("bitwise inclusive or operator  25 | 15 = "+ inclusiveOR);


        // similar will be False(0) and dissimilar will be True(1)
       int exclusiveOR = a ^ b; // 1 0 1 1 0
        System.out.println("bitwise exclusive or operator 25 ^ 15 = "+ exclusiveOR);
    }






    private static  void postfixAndPrefixOperator (){
        //post‐decrement operator can be applied only to variables, not values.
        int i = 1,postfix = i++, prefix = ++i ;
        System.out.println("Postfix is assigned first then incremented so postfix = "+ postfix);
        System.out.println("Prefix is incremented first then assigned so prefix  = "+ prefix);


    }


    private static void postFixAndPreFixQuestions(){
        System.out.println("Qustion 1 ");
        int a = 0;
        int b = 0;
        if (++a == b-- && --a == b++){
            // in the first expression ++a == b --
            // 1 == 0  so false
            // and then b will become -1
            // and the second expression --a == b++ wont be evaluated because && is short evaluation
        }else {
            System.out.println("a = "+ a);
            System.out.println("b = "+ b);
        }
        System.out.println("Qustion 2 ");
        int time = 9;
        int day = 3;
        var dinner = ++time>= 10 ? day-- <= 2
                ? "Takeout" : "Salad" : "Leftovers";

        System.out.println(dinner);

        System.out.println("Qustion 3 ");
        int height = 2, length = 3;
        boolean w = height> 1 | --length < 4;
        var x = height!=2 ? length++ : height;
        boolean z = height % length == 0;
        System.out.println(w + "-" + x + "-" + z);

    }


    private static void  shiftOperator(){
        byte x, y;
        x=10;
        y=-10;
        System.out.println("Bitwise Left Shift: x<<2 = "+(x<<2));
        System.out.println("Bitwise Right Shift: x>>2 = "+(x>>2));
        System.out.println("Bitwise Zero Fill Right Shift: x>>>2 = "+(x>>>2));
        System.out.println("Bitwise Zero Fill Right Shift: y>>>2 = "+(y>>>2));
    }





    private static int question3(){
        int x = 1, y = 1, z = 0;
        if (x == y | x < ++y) {
                //pay attention to ++y
            // z = 1 + 2
            z = x+y;
            System.out.println(z);
        }
        else{
            z = 1;
        }
        return z;
    }










}

package com.ahmed.chapter2;

public class StringAndStringBuilders {

    public static void main(String[] args) {
        System.out.println("String andS  StringBuilders");
        questions();
    }

    private static void questions() {
        System.out.println("Question 1");
        var sb = new StringBuilder();
        sb.append("red");
        sb.deleteCharAt(0);
        sb.delete(1, 2);
       System.out.println(sb);
    }
}

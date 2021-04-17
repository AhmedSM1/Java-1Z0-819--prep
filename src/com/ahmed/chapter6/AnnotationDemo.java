package com.ahmed.chapter6;


import java.lang.annotation.Annotation;

@SmartPhone()

class SamsungS21{

    private int screenSize;
    private double price;

    public SamsungS21(int screenSize, double price) {
        this.screenSize = screenSize;
        this.price = price;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public double getPrice() {
        return price;
    }
}





public class AnnotationDemo {

    public static void main(String[] args) {
        System.out.println("Annotation  Demo");
        SamsungS21 obj = new SamsungS21(12,3000);
        Annotation[] annotations = SamsungS21.class.getAnnotations();
        System.out.println(annotations.length);

    }
}

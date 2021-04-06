package com.ahmed.chapter3;

public interface JavaInterface {

    private static void privateStaticMethod() { };

    static void staticMethodWithoutAccessModifier() {};

    public static void  publicStaticMethod(){};

//TODO  NOT allowed:

//    final  static void  finalStaticMethod(){};
//    protected static void protectedStaticMethod(){};


    default int defaultMethod(int x) {
        return x*100/2;
    }

    private void privateMethod() {
        String a = "Method body inside an interface";
    }

    void abstractMethod();
}

package com.tutorialspoint.a1.singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Creating singleton");
    }

    public static Singleton getInstance(){
        return singleton;
    }

    protected static void demoMethod(){
        System.out.println("This is a demo method from Singleton class");
    }

}

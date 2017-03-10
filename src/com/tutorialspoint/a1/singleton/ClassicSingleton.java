package com.tutorialspoint.a1.singleton;

public class ClassicSingleton {

    private static ClassicSingleton instance = null;

    private ClassicSingleton(){
        System.out.println("Creating classic singleton");
    }

    public static ClassicSingleton getInstance(){
        if(instance == null){
            instance = new ClassicSingleton();
        }
        return instance;
    }

    protected static void demoMethod() {
        System.out.println("This is a demo method from classic singleton class");
    }

}

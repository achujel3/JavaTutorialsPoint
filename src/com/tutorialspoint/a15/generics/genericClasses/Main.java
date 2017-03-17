package com.tutorialspoint.a15.generics.genericClasses;

public class Main {

    public static void main(String[] args) {

        RandomGenClass<Integer> randomGenClass = new RandomGenClass<>(new Integer(10));
        RandomGenClass<String> randomGenClass2 = new RandomGenClass<>(new String("abc"));

        System.out.printf("Integer value %d \n", randomGenClass.getT());
        System.out.printf("Integer value %s \n", randomGenClass2.getT());

    }

}

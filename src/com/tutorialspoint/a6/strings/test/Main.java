package com.tutorialspoint.a6.strings.test;

public class Main {

    public static void main(String[] args) {

        float floatVar = 1.5f;
        int intVar = 10;
        String stringVar = "50000";


        System.out.printf("The value of the float variable is " +
                "%f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", floatVar, intVar, stringVar);

        System.out.println("");

        String fs;
        fs = String.format("The value of the float variable is " +
                "%f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", floatVar, intVar, stringVar);
        System.out.println(fs);


    }

}

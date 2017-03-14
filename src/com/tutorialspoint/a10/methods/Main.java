package com.tutorialspoint.a10.methods;

public class Main {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Arguments:");
        for(int i = 0; i < args.length; i++) {
            stringBuilder.append(" ");
            stringBuilder.append(args[i]);
        }
        stringBuilder.append(".");
        System.out.println(stringBuilder);

        printMaxDouble();
    }

    public static void printMaxDouble(double ... doubles) {

        if(doubles.length == 0){
            System.out.println("The list is empty");
            return;
        }

        double max = 0;
        for(double value : doubles) {
            if(value > max){
                max = value;
            }
        }

        System.out.println("Max double is: " + max);
    }

}

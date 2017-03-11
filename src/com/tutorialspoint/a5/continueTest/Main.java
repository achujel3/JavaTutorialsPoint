package com.tutorialspoint.a5.continueTest;

public class Main {

    public static void main(String[] args) {

        int[] arrayOfIntegers = {10, 20, 30, 40, 50};

        for (int i : arrayOfIntegers) {
            if(i == 30){
                continue;
            }
            System.out.println(i);
        }

    }

}

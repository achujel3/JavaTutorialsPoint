package com.tutorialspoint.a7.arrays;

public class Main {

    public static void main(String[] args) {

        int[] anArray = {99, 100, 0, 1, 2, 3};
        int[] result = Main.reverseAnArray(anArray);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] reverseAnArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0, j = array.length - 1, z = 5; i < array.length; i++, j--, z++) {
            result[j] = array[i];
            System.out.println("z: " + z);
        }

        return result;
    }

}

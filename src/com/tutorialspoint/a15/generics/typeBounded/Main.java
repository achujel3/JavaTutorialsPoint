package com.tutorialspoint.a15.generics.typeBounded;

public class Main {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {

        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.printf("Maximum of %d, %d and %d is %d \n",
                1, 2, 3, maximum(1, 2, 3));

        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f \n",
                1.1, 2.5, 3.2, maximum(1.1, 2.5, 3.2));

        System.out.printf("Maximum of %s, %s and %s is %s \n",
                "apple", "pear", "orange",
                maximum("apple", "pear", "orange"));

    }

}

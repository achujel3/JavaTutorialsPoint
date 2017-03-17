package com.tutorialspoint.a15.generics.genericMethods;

public class Main {

    // generic method
    public static <E> void printinputArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4};
        Character[] chars = {'H', 'E', 'L', 'L', 'O'};
        String[] strings = {"abc", "def", "ghi"};

        System.out.println("Array of integers: ");
        printinputArray(integers);

        System.out.println("Array of doubles: ");
        printinputArray(doubles);

        System.out.println("Array of chars: ");
        printinputArray(chars);

        System.out.println("Array of strings: ");
        printinputArray(strings);

        Random[] randoms = {new Random("Rashad"),
                new Random("Kendrick"),
                new Random("David")};
        printinputArray(randoms);

    }

}

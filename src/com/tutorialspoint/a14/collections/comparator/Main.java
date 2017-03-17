package com.tutorialspoint.a14.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Dog> list = new ArrayList<Dog>();

        list.add(new Dog("Shaggy", 3));
        list.add(new Dog("Andy", 6));
        list.add(new Dog("Lacy", 2));
        list.add(new Dog("Roger", 10));
        list.add(new Dog("Tommy", 4));
        list.add(new Dog("Tammy", 1));

        Collections.sort(list);

        System.out.println("Sorting my the name: ");
        for(Dog dog : list) {
            System.out.println(dog.getName() + " " + dog.getAge());
        }

        Collections.sort(list, new Dog());
        System.out.println();

        System.out.println("Sorting by the age: ");
        for (Dog dog : list) {
            System.out.println(dog.getName() + " " + dog.getAge());
        }

    }


}

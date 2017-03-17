package com.tutorialspoint.a14.collections.comparator;

import java.util.Comparator;

public class Dog implements Comparable<Dog>, Comparator<Dog> {

    private String name;
    private int age;

    Dog() {

    }

    Dog(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Dog dog) {
        return (this.name).compareTo(dog.name);
    }

    @Override
    public int compare(Dog dog, Dog dog2) {
        return dog.age - dog2.age;
    }

}

package com.tutorialspoint.a15.generics.genericMethods;

public class Random {

    private String name;

    public Random(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

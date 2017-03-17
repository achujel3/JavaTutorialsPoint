package com.tutorialspoint.a15.generics.genericClasses;

public class RandomGenClass<T> {

    private T t;

    public RandomGenClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

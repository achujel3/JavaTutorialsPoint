package com.tutorialspoint.a19.threads.threadDemo;

public class Main {

    public static void main(String[] args) {

        ThreadDemo T1 = new ThreadDemo("Thread-1");
        T1.start();

        ThreadDemo T2 = new ThreadDemo("Thread-2");
        T2.start();

    }

}

package com.tutorialspoint.a19.threads.interthread;

public class T1 implements Runnable {

    Chat m;
    String[] s1 = {"Hi", "How are you?", "I'm also doing fine"};

    public T1(Chat m1) {
        this.m = m1;
        new Thread(this, "Question").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.Question(s1[i]);
        }
    }
}

package com.tutorialspoint.a3.non.access.modifiers;

public class Main {

    public static void main(String[] arguments) {

        Random random = new Random();
        System.out.println(random.number);
        System.out.println(random.k);

        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();

        MyRunnableTwo myRunnableTwo = new MyRunnableTwo();
        new Thread(myRunnableTwo).start();

        try {
            Thread.sleep(3000);
            myRunnable.stop(myRunnableTwo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}

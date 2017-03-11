package com.tutorialspoint.a3.non.access.modifiers;

public class MyRunnable implements Runnable {

    private volatile boolean active;
    private static int counter = 0;

    @Override
    public void run() {
        try {
            active = true;
            while (active) {
                Thread.sleep(1000);
                System.out.println(++counter + ". Executing first thread");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stop(MyRunnableTwo myRunnableTwo) throws InterruptedException {
        active = false;
        Thread.sleep(2000);
        myRunnableTwo.stop();
    }

}

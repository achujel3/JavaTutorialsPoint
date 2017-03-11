package com.tutorialspoint.a3.non.access.modifiers;

public class MyRunnableTwo implements Runnable {

    private volatile boolean active;
    private static int counter = 0;

    @Override
    public void run() {
        active = true;
        try {
            while (active) {
                Thread.sleep(1000);
                System.out.println(++counter + ". Executing second thread");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stop(){
        active = false;
    }

}

package com.tutorialspoint.a4.instance.of;

import com.tutorialspoint.a4.instance.of.car.Car;

public class Main {

    public static void main(String[] args) {

        Bmw bmw = new Bmw();

        if(bmw instanceof Car){
            System.out.println("This is a car");
        } else {
            System.out.println("This is not a car");
        }

    }

}

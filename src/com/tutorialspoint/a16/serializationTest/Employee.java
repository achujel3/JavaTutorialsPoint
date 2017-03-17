package com.tutorialspoint.a16.serializationTest;

import java.io.Serializable;

public class Employee implements Serializable {

    public String name;
    public String address;
    public transient int SNN;
    public int number;

    public void mailCheck() {
        System.out.println("Checking mail to " + this.name + " from " + this.address);
    }

    @Override
    public String toString() {
        return this.name + "\n" + this.address + "\n" + this.SNN + "\n" + this.number;
    }
}

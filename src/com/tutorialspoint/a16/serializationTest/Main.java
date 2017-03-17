package com.tutorialspoint.a16.serializationTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "David";
        employee.address = "New York";
        employee.SNN = 1234546;
        employee.number = 86969584;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(
                    "src/com/tutorialspoint/a16/serializationTest/files/employee.ser");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(employee);
            objectOutputStream.close();

            System.out.println("Serialization data saved");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

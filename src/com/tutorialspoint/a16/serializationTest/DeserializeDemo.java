package com.tutorialspoint.a16.serializationTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

    public static void main(String[] args) {

        Employee employee = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(
                    "src/com/tutorialspoint/a16/serializationTest/files/employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Deserialization done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            e.printStackTrace();
        }

        System.out.println(employee.toString());
    }

}

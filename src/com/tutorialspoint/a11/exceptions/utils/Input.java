package com.tutorialspoint.a11.exceptions.utils;

import java.util.Scanner;

public class Input {

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}

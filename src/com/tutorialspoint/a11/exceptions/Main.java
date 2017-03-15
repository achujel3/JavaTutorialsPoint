package com.tutorialspoint.a11.exceptions;

import com.tutorialspoint.a11.exceptions.utils.Input;

public class Main {

    public static void main(String[] args) {
        Integer number = 1;
        StringBuilder stringBuilder = new StringBuilder();
         do {
            try {
                number = Integer.valueOf(Input.getInput("Write integer: "));
                if(number != 0){

                    stringBuilder.append("Your integer is: ");
                    stringBuilder.append(number);
                    System.out.println(stringBuilder);
                    stringBuilder.setLength(0);
                    number = Integer.valueOf(Input.getInput("Write integer: "));
                }
            } catch (NumberFormatException e) {
                System.out.println("You've not typed an integer");
            }
        } while (number != 0);
    }

}

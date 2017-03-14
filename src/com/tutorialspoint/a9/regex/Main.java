package com.tutorialspoint.a9.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String INPUT = "Here you can find some 5556 text and a number 100000. And some more text";
    private static final String REGEX = "(.*)(\\d+)(.*)";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) {

        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        int n = matcher.groupCount();
        int i = 0;
        if (matcher.find()) {
            try {
                for (i = 0; i <= n; i++) {
                    System.out.println(i + ". Found value: " + m.group(i));
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println(i + ". No more groups!");
            }
        }

    }

}

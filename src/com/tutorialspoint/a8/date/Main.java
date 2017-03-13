package com.tutorialspoint.a8.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String args[]) throws InterruptedException {
        // Instantiate a Date object
        Date date = new Date();

        // display formatted date
        System.out.printf("%s %tB %<te, %<tY", "Due date:", date);

        System.out.println("");

        System.out.println(date.hashCode());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.mm.d EEEE HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));

        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);

        System.out.println("");
        // parsing date
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        String input = args.length == 0 ? "1818-11-11" : args[0];

        System.out.print(input + " Parses as ");
        Date t;
        try {
            t = ft.parse(input);
            System.out.println(t);
        }catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }

        long compare1 = System.currentTimeMillis();
        Thread.sleep(3000);
        long compare2 = System.currentTimeMillis();
        long diff = compare2 - compare1;
        System.out.println(diff);

    }
}

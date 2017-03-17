package com.tutorialspoint.a14.collections.hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // testing HashMap
        HashMap map = new HashMap();

        map.put("Zara", new Double(3434.34));
        map.put("Mahnaz", new Double(123.22));
        map.put("Ayan", new Double(1378.00));
        map.put("Daisy", new Double(99.22));
        map.put("Quadir", new Double(-19.08));

        Set set = map.entrySet();

        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + " : " );
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = (Double)map.get("Zara");
        map.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance: " + map.get("Zara"));

    }

}

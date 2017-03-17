package com.tutorialspoint.a14.collections.sortedSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        // testing sorted set
        SortedSet set = new TreeSet();

        set.add("b");
        set.add("f");
        set.add("e");
        set.add("a");
        set.add("c");
        set.add("d");

        Iterator it = set.iterator();

        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element.toString());
        }

    }

}

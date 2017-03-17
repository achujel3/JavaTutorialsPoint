package com.tutorialspoint.a14.collections.algo;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(new Integer(-8));
        list.add(new Integer(10));
        list.add(new Integer(15));
        list.add(new Integer(-15));
        list.add(new Integer(20));

        Comparator comparator = Collections.reverseOrder();

        Collections.sort(list, comparator);

        Iterator iterator = list.iterator();

        System.out.print("Reverse: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        Collections.shuffle(list);

        iterator = list.iterator();

        System.out.print("Shuffle: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

    }

}

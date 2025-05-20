package com.infocon.functionalInterfaces;

import java.util.Comparator;

public class ComparatorInterfaceExample {
    public static void main(String[] args) {
        Comparator<Integer> c = (a, b) -> {
            // if a>b then 1
            // if a<b then -1
            // if a==b then 0
            return a.compareTo(b);
        };
        System.out.println(c.compare(12,10));
        System.out.println(c.compare(10,10));
        System.out.println(c.compare(8,10));
    }
}

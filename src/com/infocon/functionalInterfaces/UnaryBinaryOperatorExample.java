package com.infocon.functionalInterfaces;

import java.util.Comparator;
import java.util.function.*;
public class UnaryBinaryOperatorExample {
    static UnaryOperator<Integer> up = (num) -> {return num * num;};
    static BinaryOperator<Integer> bp =(a, b) -> {return a*b;};
    static Comparator<Integer> cp = (p, q) -> { return p.compareTo(q);};
    public static void main(String[] args) {
        System.out.println("Result of Unary Operator:"+ up.apply(5));
        System.out.println("Result of Binary Operator:"+ bp.apply(4,5));

        BinaryOperator<Integer> b1 = BinaryOperator.minBy(cp);
        BinaryOperator<Integer> b2 = BinaryOperator.maxBy(cp);

        System.out.println("Result of minBy:"+ b1.apply(10, 15));
        System.out.println(("Result of maxBy:"+ b2.apply(12, 18)));
    }
}

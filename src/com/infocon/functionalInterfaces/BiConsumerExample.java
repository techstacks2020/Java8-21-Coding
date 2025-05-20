package com.infocon.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    static BiConsumer<Integer, Integer> b1 = (num1, num2) -> {
        System.out.println("Addition Result :"+ (num1 + num2));
    };

    static BiConsumer<Integer, Integer> b2 = (num1, num2) -> {
        System.out.println("Subtraction Result :"+ (num1-num2));
    };

    static BiConsumer<Integer, Integer> b3 = (num1, num2) -> {
      System.out.println("Multiplication :"+ (num1*num2));
    };

    static BiConsumer<Integer, Integer> b4 = (num1, num2) -> {
        System.out.println("Division Result :"+ (num1/num2));
    };

    static Integer num1 = 30;
    static Integer num2 = 10;

    public static void main(String[] args) {
        arithmeticOperations(num1, num2);
    }

    static void arithmeticOperations(int num1, int num2) {
        b1.accept(num1, num2);
        b2.accept(num1, num2);
        b3.accept(num1, num2);
        b4.accept(num1, num2);
    }
}

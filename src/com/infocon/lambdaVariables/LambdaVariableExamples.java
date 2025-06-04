package com.infocon.lambdaVariables;

import java.util.function.Consumer;

public class LambdaVariableExamples {
    static int i = 15; // Instance variable
    public static void main(String[] args) {
        int j = 0; // Local variable
        int k = 1;
        int m = 2;

//        Consumer<Integer> c1 = (j) -> {       //Error: local variable name cannot be the name of lambda input parameter
//            int k = 10; //Local variable cannot be declared with the same name
//            m = 3;  //Error: Local variable cannot be re-assigned a new value - Effectively final
//            System.out.println("Result:"+ j);
//        };

        Consumer<Integer> c = (num) -> {
            System.out.println("Result 2 :" + (num + i));
        };
        c.accept(5);
    }
}

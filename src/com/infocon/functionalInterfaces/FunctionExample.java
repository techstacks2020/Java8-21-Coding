package com.infocon.functionalInterfaces;

public class FunctionExample {
    public static void main(String[] args) {
        System.out.println("Function Interface Example");
        String result1 = FunctionBasicExample.function3.apply("Vaibhav Patil");
        System.out.println("Result1 :"+ result1);
        String result2 = FunctionBasicExample.function1.apply(result1);
        System.out.println("Result2 :"+ result2);
    }
}

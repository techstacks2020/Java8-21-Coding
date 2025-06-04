package com.infocon.methodConstructorReference;

import java.util.function.Function;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Function<String, String> f1 = (name) -> { return name.toUpperCase(); };
        Function<String, String> f2 = String::toUpperCase;

        System.out.println("Result using Lambda: " + f1.apply("vaibhav"));
        System.out.println("Result using MR: "+ f2.apply("patil"));
    }
}
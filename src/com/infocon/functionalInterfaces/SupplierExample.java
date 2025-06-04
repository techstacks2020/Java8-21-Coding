package com.infocon.functionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> s = () -> {
            return "Hello Vaibhav !!";
        };
        System.out.println("Supplier Example: " + s.get());
    }
}

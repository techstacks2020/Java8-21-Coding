package com.infocon.functionalInterfaces;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Hello from a Runnable interface");
        };
        new Thread(r).start();
    }
}

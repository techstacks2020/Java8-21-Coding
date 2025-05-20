package com.infocon.functionalInterfaces;

import java.util.function.Function;

public class FunctionBasicExample {
    static Function<String, String> function1 = (name) -> { return name.toUpperCase(); };
    static Function<String, String> function2 = (name) -> { return name.toUpperCase().concat(", KOP"); };
    static Function<String, String> function3 = (value) -> { return value.concat(", MH"); };
    static Function<String, String> function4 = (name) -> { return name.toLowerCase().concat(", IND"); };

    public static void main(String[] args) {
        System.out.println("Funcation Interface Basic Example");
        String name = " v.r.patil";
        System.out.println("Result 1:" + function1.apply(name));
        System.out.println("Result 2:" +function1.andThen(function2).apply(name));
        System.out.println("Result 3:" +function2.andThen(function3).apply(name)); //
        System.out.println("Result 4:" +function1.andThen(function2).andThen(function3).apply(name)); //
        System.out.println("Result 5:" +function4.compose(function1).apply(name)); //
        System.out.println("Result 6:" +function1.compose(function3).compose(function4).apply(name)); //
    }
}

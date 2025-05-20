package com.infocon.functionalInterfaces;

import com.infocon.data.Employee;
import com.infocon.data.EmployeeData;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Employee> c1 = (e) -> { System.out.print(e.getEmployeeName() +": "); };
    static Consumer<Employee> c2 = (e) -> {
        System.out.print(e.getEmployeeName() + ":");
        System.out.println(e.getSkills());
    };
    static Consumer<Employee> c3 = (e) -> { System.out.println(e.getSalary()); };


    public static void main(String[] args) {
        System.out.println("Consumer Interface Example !");
        List<Employee> employees = EmployeeData.getAllEmployees();
        System.out.println("Print All employee Names !");
        printEmployeeNames(employees);
        System.out.println("Print All employee Names & their skills !");
        printEmployeeNamesAndSkills(employees);
        System.out.println("Consumer Chaining !");
        printEmployeeNameAndSalaryUsingConsumerChaining(employees);
        System.out.println("Print All employee Names whose salary more than 5K !");
        printEmployeeNameUsingConditions(employees);
    }

    // Print the all Employees Names
    static void printEmployeeNames(List<Employee> employees) {
        employees.forEach(c1);
    }

    static void printEmployeeNamesAndSkills(List<Employee> employees) {
        employees.forEach(c2);
    }

    static void printEmployeeNameAndSalaryUsingConsumerChaining(List<Employee> employees) {
        employees.forEach( c1.andThen(c3) );
    }

    static void printEmployeeNameUsingConditions(List<Employee> employees) {
        employees.forEach(e -> {
            if(e.getSalary() > 5000) {
                c1.andThen(c3).accept(e);
            }
        });
    }
}

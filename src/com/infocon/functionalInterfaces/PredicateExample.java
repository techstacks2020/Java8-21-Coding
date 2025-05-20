package com.infocon.functionalInterfaces;

import com.infocon.data.Employee;
import com.infocon.data.EmployeeData;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p1 = (num) -> { return num%2==0; };
    static Predicate<Integer> p2 = (num) -> { return num%5==0; };

    static Predicate<Employee> p3 = (e) -> { return e.getSalary() > 6500; };
    static Predicate<Employee> p4 = (e) -> { return e.getGrade() < 3; };

    static List<Employee> employees = EmployeeData.getAllEmployees();

    public static void main(String[] args) {
        System.out.println("Predicate Examples");
        System.out.println("Predicate Test");
        predicateTest(10);
        System.out.println("Predicate AND");
        predicateAnd(10);
        predicateAnd(15);
        System.out.println("Predicate OR");
        predicateOr(15);
        predicateOr(13);
        System.out.println("Predicate NEGATE");
        predicateNot(10);
        predicateNot(16);
        System.out.println("Predicate with Employee data");
        filterEmployeesBasedOnGradeAndSalary(employees);
    }

    static void predicateTest(int num) {
        System.out.println(p1.test(num));
    }

    static void predicateAnd(int num) {
        System.out.println(p1.and(p2).test(num));
    }

    static void predicateOr(int num) {
        System.out.println(p1.or(p2).test(num));
    }

    static void predicateNot(int num) {
        System.out.println(p1.and(p2).negate().test(num));
    }

    static void filterEmployeesBasedOnGradeAndSalary(List<Employee> employees) {
        employees.forEach(e -> {
            if(p3.and(p4).test(e)) {
                System.out.println(e.getEmployeeName() + ":" + e.getSalary());
            }
        });
    }
}

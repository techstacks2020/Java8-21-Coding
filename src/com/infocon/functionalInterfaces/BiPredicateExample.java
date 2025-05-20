package com.infocon.functionalInterfaces;

import com.infocon.data.Employee;
import com.infocon.data.EmployeeData;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    static List<Employee> employees = EmployeeData.getAllEmployees();

    // BiPredicate Instance
    static BiPredicate<Double, Integer> bi = (salary, grade) -> { return salary > 6500 && grade < 3;};
    static BiConsumer<String, List<String>> bc = (name, skills) -> { System.out.println(name + ":" + skills); };

    public static void main(String[] args) {
        employees.forEach(e-> {
            if(bi.test(e.getSalary(), e.getGrade())) {
                System.out.println(e.getEmployeeName());
            }
        });

        // Combination of BiPredicate and BiConsumer
        employees.forEach(e -> {
            if(bi.test(e.getSalary(), e.getGrade())) {
                bc.accept(e.getEmployeeName(), e.getSkills());
            }
        });

    }
}

package com.infocon.functionalInterfaces;

import com.infocon.data.Employee;
import com.infocon.data.EmployeeData;
import com.infocon.functionalInterfaces.PredicateExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    static Map<String, Integer> empMap = new HashMap<>();
    static List<Employee> employees = EmployeeData.getAllEmployees();

    static BiFunction<List<Employee>, Predicate<Employee>, Map<String, Integer>> bifunction = ((employees, empPredicate) -> {
        employees.forEach(e -> {
            if(empPredicate.test(e)) {
                empMap.put(e.getEmployeeName(), e.getGrade());
            }
        });
        return empMap;
    });
    public static void main(String[] args) {
        System.out.println("BiFunction Example");
        empMap = bifunction.apply(employees, PredicateExample.p3);
        System.out.print(empMap);
    }
}

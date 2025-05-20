package com.infocon.functionalInterfaces;

import com.infocon.data.Employee;
import com.infocon.data.EmployeeData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionEmployeeExample {
    static Map<String, Double> empMap = new HashMap<>();
    static List<Employee> employees = EmployeeData.getAllEmployees();

    static Function<List<Employee>, Map<String, Double>> empFunction = (employees) -> {
        employees.forEach(e -> {
            if(PredicateExample.p3.and(PredicateExample.p4).test(e))  {
                empMap.put(e.getEmployeeName(), e.getSalary());
            }
        });
        return empMap;
    };

    public static void main(String[] args) {
        System.out.println("Function Employee Data Example");
        Map<String, Double> empMapData = empFunction.apply(employees);
        System.out.println("Result :"+ empMapData);
    }
}

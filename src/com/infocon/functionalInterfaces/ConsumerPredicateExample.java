package com.infocon.functionalInterfaces;

import com.infocon.data.Employee;
import com.infocon.data.EmployeeData;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerPredicateExample {
    static List<Employee> employees = EmployeeData.getAllEmployees();

    // Predicate Instance
    static Predicate<Employee> p1 = (e) -> { return e.getSalary() > 6500; };
    static Predicate<Employee> p2 = (e) -> { return  e.getGrade()<3;};

    // Consumer Instance
    static Consumer<Employee> c = (e) -> { System.out.println(e.getEmployeeName() + ":" + e.getSalary() + " & Grade:" + e.getGrade());};
    static BiConsumer<String, List<String>> b = (name, skills) -> { System.out.println(name +":"+skills);};

    public static void main(String[] args) {
        employees.forEach(e -> {
            if(p1.and(p2).test(e)) {
                c.accept(e);
                b.accept(e.getEmployeeName(), e.getSkills());
            }
        });
    }
}

package com.infocon.data;

import java.util.List;

public class EmployeeData {
    public static List<Employee> getAllEmployees() {
        Employee e1 = new Employee(101, "John Doe", 5000, List.of("Java", "Spring"), 2);
        Employee e2 = new Employee(102, "Amita Rao", 7000, List.of("GO", "Java"), 1);
        Employee e3 = new Employee(103, "R Shankar", 6500, List.of("Java", "AWS"), 2);
        Employee e4 = new Employee(104, "Yash Reddy", 4300, List.of("Python", "GCP"), 3);
        Employee e5 = new Employee(105, "Balmukund", 8400, List.of("Hadoop", "Tableu"), 1);
        Employee e6 = new Employee(106, "Smital Rai", 5000, List.of(".Net", "Azure"), 2);
        Employee e7 = new Employee(107, "Amisha Patel", 3900, List.of("C++", "GO"), 4);

        return List.of(e1, e2, e3, e4, e5, e6, e7);
    }
}

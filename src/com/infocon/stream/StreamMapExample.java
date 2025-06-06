package com.infocon.stream;

import com.infocon.data.Employee;
import com.infocon.data.EmployeeData;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {
    // WAP to shocase the use of map() of Stream. Print the employee names only.
    // map() used to convert one type to another type

    public static List<String> getEmpNames() {  // List used to print all data
        List<String> names = EmployeeData.getAllEmployees().stream()
                .map(e->e.getEmployeeName())        // Stream<String>
                .collect(Collectors.toList());
        return names;
    }

    public static Set<String> getEmpUniqueNames() { // Set used to print unique data
        Set<String> empSet = EmployeeData.getAllEmployees().stream()
                .map(Employee::getEmployeeName)
                .collect(Collectors.toSet());
        return empSet;
    }

    public static void main(String[] args) {
        System.out.println("Print Emp Name List :"+ getEmpNames());
        System.out.println("Print Unique Emp Names :"+ getEmpUniqueNames());
    }
}

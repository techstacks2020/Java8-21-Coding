package com.infocon.stream;

import com.infocon.data.Employee;
import com.infocon.data.EmployeeData;
import com.infocon.functionalInterfaces.ComparatorExample;

import java.util.Comparator;
import java.util.List;

public class Stream_Distinct_Count_Sort_Example {
    static List<String> getSkills() {
        return EmployeeData.getAllEmployees().stream().map(Employee::getSkills).flatMap(List::stream).toList();
    }

    static List<String> getDistinctSkills() {
        return EmployeeData.getAllEmployees().stream().map(Employee::getSkills).flatMap(List::stream).distinct().toList();
    }

    static long getSkillsCount() {
        return EmployeeData.getAllEmployees().stream().map(Employee::getSkills).flatMap(List::stream).distinct().count();
    }

    static List<String> getASCSortedSkills() {
        return EmployeeData.getAllEmployees().stream().map(Employee::getSkills).flatMap(List::stream).distinct().sorted().toList();
    }

    static Comparator<String> comparator = (obj1, obj2) -> {
        return - obj1.compareTo(obj2);
    };

    // Reverse sorting with old approach
    static List<String> getDESCSortedSkills() {
        return EmployeeData.getAllEmployees().stream().map(Employee::getSkills).flatMap(List::stream).distinct().sorted(comparator).toList();
    }

    // Sorting the Employees based on their names
    static List<Employee> getEmployeeByNameASC() {
        return EmployeeData.getAllEmployees().stream().sorted(Comparator.comparing(Employee::getEmployeeName)).toList();
    }

    // Reverse Sorting of an employee list based on their names
    static List<Employee> getEmployeeByNameDESC() {
        return EmployeeData.getAllEmployees().stream().sorted(Comparator.comparing(Employee::getEmployeeName).reversed()).toList();
    }

    // Reverse sorting of an employee list based on their salary
    static List<Employee> getEmployeeBySalaryDESC() {
        return EmployeeData.getAllEmployees().stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
    }

    public static void main(String[] args) {
        System.out.println("All skills :"+getSkills());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Distinct skills :"+ getDistinctSkills());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Distinct skills count :" +getSkillsCount());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("ASC Sorted Skills :"+ getASCSortedSkills());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("DESC Sorted Skills (old approach) :"+ getDESCSortedSkills());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Employees sorted by their Names (ASC)" + getEmployeeByNameASC());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Employees sorted by their Names (DESC)" + getEmployeeByNameDESC());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Employees sorted by their salary (DESC)" + getEmployeeBySalaryDESC());
    }
}

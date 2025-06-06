package com.infocon.stream;

import com.infocon.data.Employee;
import com.infocon.data.EmployeeData;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class StreamFlatMapExample {
    /* WAP to showcase the use of flatMap() of stream
     flatMap is same as map but used in the context of stream where each element contains collection of elements.
     Example, inside the employee object skills presented by List<String>
     these skills presented as a collective list of all String */

    static List<String> getAllSkils() {
        List<String> skills = EmployeeData.getAllEmployees().stream()   // Stream<Employee>
                .map(Employee::getSkills)                               // Stream<List<String>>
                .peek(System.out::println)                              // Debugging
                .flatMap(List::stream)                                  // Stream<String>
                .peek(System.out::println)                              // Debugging
                .collect(Collectors.toList());
        return skills;
    }

    static Set<String> getUniqueSkills() {
        Set<String> uniqueSkills = EmployeeData.getAllEmployees().stream()
                .map(Employee::getSkills)
                .flatMap(List::stream)
                .collect(toSet());
        return  uniqueSkills;
    }

    public static void main(String[] args) {
        System.out.println("List of all skills :"+ getAllSkils());
        System.out.println("Set of unique skills :"+ getUniqueSkills());
    }
}

package com.infocon.stream;

import com.infocon.data.Employee;
import com.infocon.data.EmployeeData;
import com.infocon.data.EmployeeUtility;

import java.util.List;
import java.util.stream.Collectors;

public class StreamBasicExample {
    //WAP to create a stream of Employee objects and perform various operations like filtering, collecting.
    public static void main(String[] args) {
        //Print single employee object
        Employee e = EmployeeUtility.empSupplier.get();
        System.out.println("Emp Data:" + e);

        //Create streams and perform filter and collect operation
        List<Employee> emps = EmployeeData.getAllEmployees().stream()     // Initial Operation
                .filter(employee -> employee.getSalary()>3200)   // Intermediate Operation
                .peek(employee -> System.out.println("Filter with salary :" + employee))                                // Debug mode
                .filter(employee -> employee.grade > 2)          // Intermediate Operation
                .peek(employee -> System.out.println("Filter with rating :"+ employee))                                // Debug mode
                .collect(Collectors.toList());                            // Terminal Operation

        System.out.println("All Emps Data:" + emps);

    }
}

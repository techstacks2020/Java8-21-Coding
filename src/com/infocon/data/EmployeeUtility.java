package com.infocon.data;

import java.util.function.Supplier;

public class EmployeeUtility {
    public static Supplier<Employee> empSupplier = () -> {
        return EmployeeData.getEmpobj();
    };            ;
}

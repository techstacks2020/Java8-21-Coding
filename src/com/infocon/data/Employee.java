package com.infocon.data;

import java.util.List;
import java.util.Objects;

public class Employee {
    public int employeeId;
    public String employeeName;
    public double salary;
    public List<String> skills;
    public int grade;

    public Employee(int employeeId, String employeeName, double salary, List<String> skills, int grade) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.skills = skills;
        this.grade = grade;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && Double.compare(salary, employee.salary) == 0 && grade == employee.grade && Objects.equals(employeeName, employee.employeeName) && Objects.equals(skills, employee.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, employeeName, salary, skills, grade);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", skills=" + skills +
                ", grade=" + grade +
                '}';
    }
}

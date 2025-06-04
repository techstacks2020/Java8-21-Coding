package com.infocon.methodConstructorReference;

import com.infocon.functionalInterfaces.SupplierExample;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    static Supplier<Student> s1 = () -> { return new Student(); };
    static Supplier<Student> s2 = Student::new;     //Zero Parameter Constructor Reference
    static Function<String, Student> f1 = Student::new; //One Parameter Constructor Reference

    public static void main(String[] args) {
        System.out.println("Using Zero Parameter Constructor Reference: "+ s1.get());
        System.out.println("Using Zero Parameter Constructor Reference: "+ s2.get());
        System.out.println("Using one Parameter Constructor Reference: " + f1.apply("Vaibhav"));
    }
}

class Student {
    private String name;
    private String address;
    private int age;

    public Student() { }
    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.syscho.pattern.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {

        Employee build = new Employee.EmployeeBuilder()
                .setAge(1)
                .build();
        System.out.println(build.getAge());
        System.out.println(build.getName());

    }
}

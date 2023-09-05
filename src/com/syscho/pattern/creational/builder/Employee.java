package com.syscho.pattern.creational.builder;

public class Employee {
    private String empId;
    private String name;
    private String designation;
    private int age;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.empId = employeeBuilder.empId;
        this.name = employeeBuilder.name;
        this.designation = employeeBuilder.designation;
        this.age = employeeBuilder.age;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getAge() {
        return age;
    }

    public static class EmployeeBuilder {
        private String empId;
        private String name;
        private String designation;
        private int age;

        public EmployeeBuilder setEmpId(String empId) {
            this.empId = empId;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setDesignation(String designation) {
            this.designation = designation;
            return this;
        }

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}

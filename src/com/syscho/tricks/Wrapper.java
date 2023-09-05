package com.syscho.tricks;

class Employee {
    String name;
    int age;
    int amount;

    public Employee(String name, int age) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}

public class Wrapper {

    public static void main(String[] args) {
        Employee employee = new Employee("", 0);
        employee.setAmount(null);
    }
}

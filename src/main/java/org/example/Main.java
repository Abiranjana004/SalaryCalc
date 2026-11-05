package org.example;

public class Main {
    public static void main(String[] args) {
        Salary salary = new Salary();
        int total = salary.calcSalary(50000, 16000, 9500);
        System.out.println("Total Salary: " + total);
    }
}
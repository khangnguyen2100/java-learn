package com.javaLearn.Classrom;

public class Employee extends Person {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(String name, short age, String address, int baseSalary, int hourlyRate) {
        super(name, age, address);
        this.baseSalary = baseSalary;
        this.hourlyRate = hourlyRate;
    }

    public static void printNumberOfEmployees() {
        System.out.println("The number of employees is: " + numberOfEmployees);
    }

    // baseSalary
    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base Salary must be greater than 0.");
        }
        this.baseSalary = baseSalary;
    }

    // hourlyRate
    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly Rate must be greater than 0.");
        }
        this.hourlyRate = hourlyRate;
    }

    // methods
    public int calculateWage(int extraHours) {
        return this.baseSalary + (extraHours * this.hourlyRate);
    }
}

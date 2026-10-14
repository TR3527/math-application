package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1
        double bobSalary = 100000.0000;
        double garySalary = 80000.0000;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);

        //Question 2
        double carPrice = 40000.1234;
        double truckPrice = 60000.5678;
        double lowestPrice = Math.min(carPrice,truckPrice);

        System.out.println("The lowest price is " + lowestPrice);

        //Question 3


    }
}

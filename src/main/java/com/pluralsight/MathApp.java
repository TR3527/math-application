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
        double circleRadius = 7.25;
        double circleArea = Math.PI * circleRadius * circleRadius;

        System.out.println("The area of the circle is " + circleArea);

        //Question 4
        double preSquareRoot = 5.0;
        double squareRoot = Math.sqrt(preSquareRoot);

        System.out.println("The square root is " + squareRoot);


        //Question 5
        double x1 = 5;
        double y1 = 10;

        double x2 = 85;
        double y2 = 50;

        double xDifference = (x2 - x1);
        double yDifference = (y2 - y1);

        double xDiffSquared = xDifference * xDifference;
        double yDiffSquared = yDifference * yDifference;

        double xandYdiffAdded = xDiffSquared + yDiffSquared;

        double differenceSquareRoot = Math.sqrt(xandYdiffAdded);

        System.out.println("The distance between the points is: "+ differenceSquareRoot);

        //Question 6
        double preNumber = -3.8;
        double absoluteValue = Math.abs(preNumber);

        System.out.println("The absolute value is " + absoluteValue);

        //Question 7
        double randomNumber = Math.random();
        System.out.println("Random number between 0 and 1: " + randomNumber);

        //Question 8

        int dayCount = 24;
        int hourCount = dayCount * 24;
        int minuteCount = hourCount * 60;
        long msCount = minuteCount * 60000L;

        System.out.println("There are " + minuteCount + " minutes in 24 days.");
        System.out.println("There are " + msCount + " milliseconds in 24 days.");









    }
}
